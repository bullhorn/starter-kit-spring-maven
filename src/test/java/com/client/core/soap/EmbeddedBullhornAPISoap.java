package com.client.core.soap;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bullhorn.apiservice.result.ApiFindResult;
import com.bullhorn.apiservice.result.ApiSaveResult;
import com.bullhorn.entity.AbstractDto;
import com.client.core.ApplicationSettings;
import com.client.core.scheduledtasks.dao.BullhornLogDAO;
import com.client.core.soap.service.impl.BullhornAPISoap;
import com.client.core.base.tools.test.TestEntities;

/**
 * This implementation of BullhornAPI is used for unit tests. It caches the entities in a map for speed.
 * 
 * @author magnus.palm
 * 
 */

public class EmbeddedBullhornAPISoap extends BullhornAPISoap {

	private static Log log = LogFactory.getLog(EmbeddedBullhornAPISoap.class);
	private final Map<String, Map<Integer, ? extends AbstractDto>> soapEntityMap;

	public EmbeddedBullhornAPISoap() {
		super(null, null);
		this.soapEntityMap = null;
	}

	public EmbeddedBullhornAPISoap(ApplicationSettings appSettings, BullhornLogDAO bullhornLogDAO, TestEntities testEntities) {
		super(appSettings, bullhornLogDAO);
		this.soapEntityMap = new HashMap<String, Map<Integer, ? extends AbstractDto>>();
		// setupTestEntities(testEntities);
	}

	public <T extends AbstractDto> T getSoapEntity(String entityName, Integer id) {
		Map<Integer, T> mapWithSoapEntitiesOfTypeT = (Map<Integer, T>) soapEntityMap.get(entityName);

		if (mapWithSoapEntitiesOfTypeT != null && mapWithSoapEntitiesOfTypeT.get(id) != null) {
			return mapWithSoapEntitiesOfTypeT.get(id);
		}

		synchronized (this) {
			if (mapWithSoapEntitiesOfTypeT == null) {
				mapWithSoapEntitiesOfTypeT = new HashMap<Integer, T>();
				soapEntityMap.put(entityName, mapWithSoapEntitiesOfTypeT);
			}
			if (mapWithSoapEntitiesOfTypeT.get(id) == null) {

				try {
					ApiFindResult findResult = getService().find(getSession(), entityName, Integer.parseInt(id.toString()));
					setSession(findResult.getSession());
					T entity = (T) findResult.getDto();
					mapWithSoapEntitiesOfTypeT.put(id, entity);
				} catch (Exception e) {
					log.error("Error preloading test entity: " + entityName + " id: " + id);
				}

			}
		}

		return mapWithSoapEntitiesOfTypeT.get(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends AbstractDto> T findEntity(String entityType, Object id) {

		String idString = id.toString();

		return this.getSoapEntity(entityType, Integer.valueOf(idString));
	}

	@Override
	public <T extends AbstractDto> void delete(T entity) {
		try {
			getService().delete(getSession(), entity);
		} catch (Exception e) {
			log.error("Error deleting entity " + entity);
		}
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

}
