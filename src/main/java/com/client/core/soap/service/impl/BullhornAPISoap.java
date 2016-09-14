package com.client.core.soap.service.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.xml.namespace.QName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Seconds;
import org.springframework.util.StringUtils;

import com.bullhorn.apiservice.ApiService;
import com.bullhorn.apiservice.ApiService_Service;
import com.bullhorn.apiservice.query.DtoQuery;
import com.bullhorn.apiservice.result.ApiEventsGetEventsResult;
import com.bullhorn.apiservice.result.ApiEventsGetLastRequestIdResult;
import com.bullhorn.apiservice.result.ApiFindResult;
import com.bullhorn.apiservice.result.ApiGetUserTypesResult;
import com.bullhorn.apiservice.result.ApiQueryResult;
import com.bullhorn.apiservice.result.ApiSaveResult;
import com.bullhorn.apiservice.result.ApiStartSessionResult;
import com.bullhorn.dataevent.event.DataEvent;
import com.bullhorn.dataevent.event.DataEvent.EventMetadata;
import com.bullhorn.dataevent.event.DataEvent.EventMetadata.Entry;
import com.bullhorn.dataevent.event.EntityDeletedEvent;
import com.bullhorn.dataevent.event.EntityInsertedEvent;
import com.bullhorn.dataevent.event.EntityUpdatedEvent;
import com.bullhorn.dataevent.result.GetEventsResults;
import com.bullhorn.entity.AbstractDto;
import com.bullhorn.entity.ApiEntityName;
import com.bullhorn.entity.user.UserTypeDto;
import com.client.core.ApplicationSettings;
import com.client.core.scheduledtasks.dao.BullhornLogDAO;
import com.client.core.scheduledtasks.model.log.BullhornLog;
import com.client.core.scheduledtasks.model.log.Request;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.soap.model.SubscriptionEvent;
import com.client.core.soap.service.BullhornAPI;
import com.client.core.soap.workers.EntityFindWorker;

/**
 * Main bullhorn api utility class. Handles session creation and session refresh.
 * 
 * @author magnus.palm
 * 
 */

public class BullhornAPISoap implements BullhornAPI {

    private DateTime sessionLastUpdated;

    private static Log log = LogFactory.getLog(BullhornAPISoap.class);

    private ApiService service;

    private String session;

    private ApplicationSettings appSettings;

	private int corporationID;

    private BullhornLogDAO bullhornLogDAO;

    public BullhornAPISoap(ApplicationSettings appSettings, BullhornLogDAO bullhornLogDAO) {
        this.appSettings = appSettings;
        this.service = createService();
        this.session = createSession();
        this.bullhornLogDAO = bullhornLogDAO;
        this.sessionLastUpdated = new DateTime(DateTimeZone.forID("EST5EDT"));
    }

    private void updateSessionLastUpdated() {
        this.sessionLastUpdated = new DateTime(DateTimeZone.forID("EST5EDT"));
    }

    /**
     * Creates the service that will be used by the rest of this class when making api calls to Bullhorn APIs.
     * 
     * @return the ApiService
     */

    private ApiService createService() {

        QName SERVICE_NAME = new QName("http://apiservice.bullhorn.com/", "ApiService");

        String wsdlUrl = appSettings.getApiUrl();

        URL serviceUrl;
        try {
            URL baseUrl = com.bullhorn.apiservice.ApiService_Service.class.getResource(".");

            serviceUrl = new URL(baseUrl, wsdlUrl);
            service = new ApiService_Service(serviceUrl, SERVICE_NAME).getApiServicePort();

        } catch (Exception e) {
            log.error("Error while creating ApiService", e);
        }

        return service;
    }

    /**
     * Generates a session using the username, password and ApiKey setup in the application settings.
     *
     * @return the session
     */

    private String createSession() {

        String username = appSettings.getUsername();
        String password = appSettings.getPassword();
        String apiKey = appSettings.getApiKey();

        try {
            ApiStartSessionResult apiStartSessionResult = getService().startSession(username, password, apiKey);
            if (session != null && session.equalsIgnoreCase(apiStartSessionResult.getSession())) {
                log.info("Issue with Service. Recreating the Service!");
                service = createService();
                apiStartSessionResult = getService().startSession(username, password, apiKey);
            }
            // reset session
            setSession(apiStartSessionResult.getSession());
            corporationID = apiStartSessionResult.getCorporationId();
        } catch (Exception e) {
            log.error("Error creating session", e);
        }

        return getSession();
    }

    /**
     * Retrieves a list of SubscriptionEvents based on the subscription name passed in.
     * 
     * @param numberRequested
     *            the number of events to pull off the queue each time
     * @param subscriptionName
     *            the name of the specific subscription
     * 
     * @return a list of SubscriptionEvents generated by bullhorn
     */
    @Override
    public List<SubscriptionEvent> getSubscriptionEvents(int numberRequested, String subscriptionName) {
        List<SubscriptionEvent> returnList = new ArrayList<SubscriptionEvent>();

        try {

            // check to see if we have max request id, if we don't get it and use it
            ApiEventsGetEventsResult eRes = null;
            ApiEventsGetLastRequestIdResult requestRes = getService().eventsGetLastRequestId(getSession(), subscriptionName);
            long lastRequestID = requestRes.getLastRequestId();
            List<Request> reqList = bullhornLogDAO.getMaxRequestID(corporationID, subscriptionName);
            int requestID = 0;
            if (reqList.size() > 0) {
                requestID = reqList.get(0).getRequestID();
            }
            // if last request in BH doesn't match what we consumed
            if (lastRequestID != requestID && requestID > 0) {
                eRes = getService().eventsRegetEvents(getSession(), subscriptionName, lastRequestID);
                // if reget fails, read from the queue
                if (eRes.getResults() == null) {
                    eRes = getService().eventsGetEvents(getSession(), subscriptionName, numberRequested);
                }
            } else {
                eRes = getService().eventsGetEvents(getSession(), subscriptionName, numberRequested);
            }

            if (eRes != null) {
                GetEventsResults res = eRes.getResults();
                setSession(eRes.getSession());
                if (res != null) {
                    // log requestID
                    Request request = logAndCreateRequest(subscriptionName, res.getRequestId());

                    try {

                        for (DataEvent dataEvent : res.getEvents()) {

                            // get updating user
                            String updatingUserID = "0";
                            String transactionID = "0";
                            EventMetadata meta = dataEvent.getEventMetadata();
                            if (meta != null) {
                                for (Entry de : meta.getEntry()) {
                                    if (de.getKey().equalsIgnoreCase("PERSON_ID")) {
                                        updatingUserID = de.getValue().toString();
                                    } else if  (de.getKey().equalsIgnoreCase("TRANSACTION_ID")) {
                                    	transactionID = de.getValue().toString();
                                    }
                                }
                            }

                            SubscriptionEvent se = null;
                            
                            if (!transactionID.equals("0")) {
                            	se = SubscriptionEvent.instantiateNonErrorWithTransactionID(dataEvent, updatingUserID,
                                        subscriptionName, request.getRequestID(), transactionID);
                            } else {
                            	se = SubscriptionEvent.instantiateNonError(dataEvent, updatingUserID,
                            			subscriptionName, request.getRequestID());                            	
                            }

                            if (dataEvent instanceof EntityUpdatedEvent) {
                                handleUpdateEvent(se, dataEvent);

                            } else if (dataEvent instanceof EntityInsertedEvent) {
                                handleInsertEvent(se, dataEvent);

                            } else if (dataEvent instanceof EntityDeletedEvent) {
                                handleDeleteEvent(se, dataEvent);

                            }

                            returnList.add(se);
                        }
                    } catch (Exception e) {
                        log.error("Error", e);
                    }
                }
            }

            // now add any errored events for this corp/subscription back
            addErrorEventsFromLogForThisCorpSubscription(returnList, subscriptionName);

        } catch (Exception e) {
            log.error("Error", e);
        }

        return returnList;
    }

    private void addErrorEventsFromLogForThisCorpSubscription(List<SubscriptionEvent> returnList, String subscriptionName) {
        try {
            // now add any errored events for this corp/subscription back
            String queryWhere = "corporationID = " + corporationID + " AND subscriptionID = '" + subscriptionName + "'"
                    + " AND errorCount < 4 AND status = 'error'";
            List<BullhornLog> errorRows = bullhornLogDAO.selectWhere(queryWhere);
            if (errorRows.size() > 0) {
                for (BullhornLog bhLog : errorRows) {
                    try {
                        SubscriptionEvent se = SubscriptionEvent.instantiateError(bhLog, subscriptionName);
                        returnList.add(se);

                    } catch (Exception e) {
                        log.error(e);
                    }
                }
            }
        } catch (Exception e) {
            log.error(e);
        }

    }

    private void handleUpdateEvent(SubscriptionEvent se, DataEvent dataEvent) {
        se.setEventType(EventType.UPDATE.value());
        EntityUpdatedEvent ue = (EntityUpdatedEvent) dataEvent;
        se.setEntityType(ue.getEntityName());
        se.setEntityID(((Number) ue.getEntityId()).intValue());
        se.setUpdatedProperties(StringUtils.toStringArray(ue.getUpdatedProperties()));

    }

    private void handleInsertEvent(SubscriptionEvent se, DataEvent dataEvent) {
        se.setEventType(EventType.INSERT.value());
        EntityInsertedEvent ie = (EntityInsertedEvent) dataEvent;
        se.setEntityType(ie.getEntityName());
        se.setEntityID(((Number) ie.getEntityId()).intValue());
        se.setUpdatedProperties(null);

    }

    private void handleDeleteEvent(SubscriptionEvent se, DataEvent dataEvent) {
        se.setEventType(EventType.DELETE.value());
        EntityDeletedEvent de = (EntityDeletedEvent) dataEvent;
        se.setEntityType(de.getEntityName());
        se.setEntityID(((Number) de.getEntityId()).intValue());
        se.setUpdatedProperties(null);
    }

    private Request logAndCreateRequest(String subscriptionName, long requestID) {
        // log requestID
        Request request = new Request();
        request.setCorporationID(corporationID);
        request.setSubscriptionID(subscriptionName);
        request.setRequestID((int) requestID);
        bullhornLogDAO.insertRequest(request);
        return request;

    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends AbstractDto> T findEntity(String entityType, Object id) {
        T returnObject = null;

        try {
            ApiFindResult findResult = getService().find(getSession(), entityType, Integer.parseInt(id.toString()));
            setSession(findResult.getSession());
            returnObject = (T) findResult.getDto();
        } catch (Exception e) {
            log.error(
                    "ERROR entityType=" + entityType + "; id=" + id.toString() + "; session=" + session + "; error="
                            + e.getMessage(), e);
        }

        log.info("entityType = " + entityType + " id=" + id);
        return returnObject;
    }

    @Override
    public <T extends AbstractDto> void delete(T entity) {
        try {
            getService().delete(getSession(), entity);
        } catch (Exception e) {
            log.error("Error deleting entity " + entity);
        }
    }

    @Override
    public UserTypeDto findUserType(int id) {

        ApiGetUserTypesResult queryResult = getService().getUserTypes(getSession(), ApiEntityName.CORPORATE_USER.value());
        setSession(queryResult.getSession());
        List<UserTypeDto> userTypeDtos = queryResult.getUserTypeDtos();

        for (UserTypeDto dto : userTypeDtos) {
            if (dto.getUserTypeID() == id) {
                return dto;
            }
        }

        return null;
    }

    /**
     * Takes a dto query and an entity type and returns the result in List<T extends AbstractDto>, the execution is taking place
     * in a multi-threaded fashion.
     * 
     * @param entityType
     *            the bullhorn entity type, see ApiEntityName
     * @param dtoQuery
     *            a query
     * 
     * @return A list of DTOs of type entityType based on the dtoQuery.
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T extends AbstractDto> List<T> getQueryResults(String entityType, DtoQuery dtoQuery) {
        List<T> resultsList = new ArrayList<T>();

        ApiQueryResult result = query(dtoQuery);
        if (result != null && result.getIds().size() > 0) {
            resultsList = getDtosFromIds(entityType, result.getIds());

        }
        return resultsList;
    }

    @Override
    public <T extends AbstractDto> List<T> getDtosFromIds(String entityType, List<Object> ids) {
        List<T> resultsList = new ArrayList<T>();
        if (ids != null && ids.size() > 0) {

            // Create an ExecutorService with the number of processors available to the Java virtual machine.
            ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            List<Future<T>> futureList = new ArrayList<Future<T>>();

            for (Object entityId : ids) {
                EntityFindWorker<T> worker = new EntityFindWorker<T>(entityId, entityType, this);
                Future<T> aDto = executor.submit(worker);
                futureList.add(aDto);
            }

            for (Future<T> future : futureList) {
                try {
                    resultsList.add(future.get());
                } catch (InterruptedException e) {
                    log.error("Error in bullhornapi.getQueryResultsMultiThread", e);
                } catch (ExecutionException e) {
                    log.error("Error in bullhornapi.getQueryResultsMultiThread", e);
                }
            }

            // shutdown pool, wait until it's done
            executor.shutdown();
            while (!executor.isTerminated()) {
            }
            // null it out
            executor = null;
        }
        return resultsList;
    }

    @Override
    public ApiQueryResult query(DtoQuery query) {
        ApiQueryResult result = null;
        try {
            result = getService().query(getSession(), query);
            setSession(result.getSession());
        } catch (Exception e) {
            log.error("Error occured in BullhornAPIService.query()", e);
            log.error("ERROR entityName=" + query.getEntityName() + "; session=" + session + "; error=" + e.getMessage());
        }
        return result;
    }

    /**
     * Persist an entity to Bullhorn
     * 
     * @param entity
     *            the entity to persist
     * 
     * @return ApiSaveResult
     */
    @Override
    public ApiSaveResult save(AbstractDto entity) {
        ApiSaveResult result = null;
        try {
            result = getService().save(getSession(), entity);
            setSession(result.getSession());
        } catch (Exception e) {
            log.error("Error occured in BullhornAPIService.save()", e);
        }
        return result;
    }

    /**
     * Persists a list of AbstractDtos to Bullhorn
     * 
     * @param dtoList
     */
    @Override
    public <T extends AbstractDto> void saveDtos(List<T> dtoList) {
        if (dtoList != null && dtoList.size() > 0) {
            for (AbstractDto dto : dtoList) {
                this.save(dto);
            }
        }

    }

    @Override
    public ApiService getService() {
        if (service == null)
            return createService();
        else
            return service;
    }

    /**
     * Checks is session is older than 4 minutes, if so it creates session again
     */
    @Override
    public String getSession() {

        if (session == null || sessionTooOld()) {
            return createSession();
        }
        return session;
    }

    private boolean sessionTooOld() {
        Seconds secondsSinceLastSessionUpdate = Seconds.secondsBetween(sessionLastUpdated,
                new DateTime(DateTimeZone.forID("EST5EDT")));
        log.info("seconds since last session update: " + secondsSinceLastSessionUpdate.getSeconds());
        if (secondsSinceLastSessionUpdate.getSeconds() > 240) {
            return true;
        }
        return false;

    }

    /**
     * Updates the session, and updates the sessionLastUpdated flag.
     * 
     * Method is synchronized to make sure the session update and the setting of the DateTime sessionLastUpdated is executed as an
     * atomic action.
     */
    @Override
    public synchronized void setSession(String session) {
        this.session = session;
        updateSessionLastUpdated();
    }

    @Override
    public int getCorporationID() {
        return corporationID;
    }

    @Override
    public ApplicationSettings getAppSettings() {
        return appSettings;
    }

    @Override
    public BullhornLogDAO getBullhornLogDAO() {
        return bullhornLogDAO;
    }
    
    @Override
    public String getHostName() {
    	String hostName = this.getService().getApplicationServerHost(appSettings.getUsername(), "");
    	
    	return org.apache.commons.lang3.StringUtils.substringBefore(hostName, "|");
    }
    
    @Override
    public String assembleOpenWindowLink(String hostName, ApiEntityName entity, Integer id) {
    	String openWindowLink = "https://" + hostName + "/BullhornStaffing/OpenWindow.cfm?entity=" + entity.value() + "&id=";
		
    	if (id != null) {
			openWindowLink = openWindowLink + id;
		}

		return openWindowLink;
    }
    
    @Override
	public String assembleOpenWindowLink(ApiEntityName entity, Integer id) {
		String hostName = this.getHostName();
		
		return assembleOpenWindowLink(hostName, entity, id);
	}

}
