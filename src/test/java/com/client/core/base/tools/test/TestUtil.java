package com.client.core.base.tools.test;

import com.bullhorn.apiservice.query.DtoQuery;
import com.bullhorn.entity.AbstractDto;
import com.bullhorn.entity.ApiEntityName;
import com.bullhorn.entity.candidate.CandidateEducationDto;
import com.bullhorn.entity.candidate.CandidateReferenceDto;
import com.bullhorn.entity.candidate.CandidateWorkHistoryDto;
import com.bullhorn.entity.job.JobOrderDto;
import com.bullhornsdk.data.api.BullhornData;
import com.client.core.ApplicationSettings;
import com.client.core.formtrigger.model.form.impl.*;
import com.client.core.formtrigger.workflow.traversing.impl.*;
import com.client.core.scheduledtasks.model.helper.StandardEvent;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.impl.*;
import com.client.core.soap.service.BullhornAPI;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.text.DateFormat;
import java.util.*;

public class TestUtil {

	@Autowired
	private TestEntities testEntities;

	@Autowired
	private BullhornAPI bullhornApi;

	@Autowired
	private BullhornData bullhornData;

	@Autowired
	@Qualifier("appSettings")
	private ApplicationSettings appSettings;

	public TestUtil() {
		super();
	}

	public static StandardEvent event(Integer entityID, ApiEntityName entityName, EventType eventType, String[] updatedProperties,
									  Integer updatingUserID) {
		StandardEvent event = new StandardEvent();
		event.setEntityId(entityID);
		event.setEntityName(entityName.value());
		event.setEventType(eventType.value());
		event.setUpdatedProperties(Lists.newArrayList(updatedProperties));
		event.setUpdatingUserId(updatingUserID);
		return event;
	}

	public JobSubmissionEventTraverser jobSubmissionEventTraverser(EventType eventType, String[] updatedProperties) {
		StandardEvent event = TestUtil.event(getTestEntities().getJobSubmissionId(), ApiEntityName.JOB_SUBMISSION, eventType,
				updatedProperties, getTestEntities().getCorporateUserId());
		return jobSubmissionEventTraverser(event);
	}

	public SendoutEventTraverser sendoutEventTraverser(EventType eventType, String[] updatedProperties) {
		StandardEvent event = TestUtil.event(getTestEntities().getSendoutId(), ApiEntityName.SENDOUT, eventType, updatedProperties,
				getTestEntities().getCorporateUserId());
		return sendoutEventTraverser(event);
	}

	public PlacementEventTraverser placementEventTraverser(EventType eventType, String[] updatedProperties) {
		StandardEvent event = TestUtil.event(getTestEntities().getPlacementId(), ApiEntityName.PLACEMENT, eventType, updatedProperties,
				getTestEntities().getCorporateUserId());
		return placementEventTraverser(event);
	}

	public JobEventTraverser jobEventTraverser(EventType eventType, String[] updatedProperties) {
		StandardEvent event = TestUtil.event(getTestEntities().getJobOrderId(), ApiEntityName.JOB_ORDER, eventType, updatedProperties,
				getTestEntities().getCorporateUserId());
		return jobEventTraverser(event);
	}

	public JobSubmissionEventTraverser jobSubmissionEventTraverser(StandardEvent event) {
		return new JobSubmissionEventTraverser(event, bullhornData);
	}

	public PlacementEventTraverser placementEventTraverser(StandardEvent event) {
		return new PlacementEventTraverser(event, bullhornData);
	}

	public PlacementChangeRequestEventTraverser placementChangeRequestEventTraverser(StandardEvent event) {
		return new PlacementChangeRequestEventTraverser(event, bullhornData);
	}

	public CandidateEventTraverser candidateEventTraverser(StandardEvent event) {
		return new CandidateEventTraverser(event, bullhornData);
	}

	public ClientContactEventTraverser clientContactEventTraverser(StandardEvent event) {
		return new ClientContactEventTraverser(event, bullhornData);
	}

	public SendoutEventTraverser sendoutEventTraverser(StandardEvent event) {
		return new SendoutEventTraverser(event, bullhornData);
	}

	public JobEventTraverser jobEventTraverser(StandardEvent event) {
		return new JobEventTraverser(event, bullhornData);
	}

	public JobSubmissionValidationTraverser getJobSubmissionValidationTraverser(String status, int candidateID) {
		FormJobSubmissionDto dto = new FormJobSubmissionDto();
		dto.setComments("Comments on submission");
		dto.setJobPostingID(getTestEntities().getJobOrderId());
		dto.setJobResponseID(getTestEntities().getJobSubmissionId());
		dto.setSendingUserID(2);
		dto.setUserID(candidateID);
		dto.setStatus(status);
		JobSubmissionValidationTraverser traverser = new JobSubmissionValidationTraverser(dto, getTestEntities().getCorporateUserId(),
				true, bullhornData);

		return traverser;
	}

	public PlacementValidationTraverser getPlacementValidationTraverser(String status) {
		FormPlacementDto dto = new FormPlacementDto();
		dto.setJobPostingID(getTestEntities().getJobOrderId());
		dto.setUserID(getTestEntities().getCandidateId());
		dto.setPlacementID(getTestEntities().getPlacementId());
		dto.setStatus(status);
		PlacementValidationTraverser traverser = new PlacementValidationTraverser(dto, getTestEntities().getCorporateUserId(),
				true, bullhornData);

		return traverser;
	}

	public PlacementChangeRequestValidationTraverser getPlacementChangeRequestValidationTraverser(String status) {
		FormPlacementChangeRequestDto dto = new FormPlacementChangeRequestDto();

        dto.setPlacementChangeRequestID(getTestEntities().getPlacementChangeRequestId());
		dto.setPlacementID(getTestEntities().getPlacementId());
		dto.setStatus(status);

		PlacementChangeRequestValidationTraverser traverser = new PlacementChangeRequestValidationTraverser(dto, getTestEntities()
				.getCorporateUserId(), true, bullhornData);

		return traverser;
	}

	public JobValidationTraverser getJobValidationTraverser() {
		FormJobOrderDto dto = new FormJobOrderDto();
		dto.setJobPostingID(getTestEntities().getJobOrderId());
		dto.setClientUserID(getTestEntities().getClientContactId());
		dto.setClientCorporationID(getTestEntities().getClientCorporationId());
		dto.setUserID(testEntities.getCorporateUserId());
		
		JobValidationTraverser traverser = new JobValidationTraverser(dto, getTestEntities().getCorporateUserId(),
				true, bullhornData);

		return traverser;
	}

	public CandidateValidationTraverser getCandidateValidationTraverser() {
		FormCandidateDto dto = new FormCandidateDto();
		dto.setUserID(getTestEntities().getCandidateId().toString());
		dto.setRecruiterUserID(getTestEntities().getCorporateUserId().toString());

		CandidateValidationTraverser traverser = new CandidateValidationTraverser(dto, getTestEntities().getCorporateUserId(),
				true, bullhornData);
		return traverser;
	}

	public ClientContactValidationTraverser getClientContactValidationTraverser() {
		FormClientContactDto dto = new FormClientContactDto();
		dto.setUserID(getTestEntities().getCandidateId());
		dto.setRecruiterUserID(getTestEntities().getCorporateUserId().toString());
		dto.setClientCorporationID(getTestEntities().getClientCorporationId());

		ClientContactValidationTraverser traverser = new ClientContactValidationTraverser(dto, getTestEntities().getCorporateUserId(),
				true, bullhornData);
		return traverser;
	}

	public ClientCorporationValidationTraverser getClientCorporationValidationTraverser() {
		FormClientCorporationDto dto = new FormClientCorporationDto();
		dto.setClientCorporationID(getTestEntities().getClientCorporationId());

		ClientCorporationValidationTraverser traverser = new ClientCorporationValidationTraverser(dto, getTestEntities()
				.getCorporateUserId(), true, bullhornData);
		return traverser;
	}

	public NoteValidationTraverser getNoteValidationTraverser() {
		FormNoteDto dto = new FormNoteDto();

        dto.setUserCommentID(getTestEntities().getNoteId());
		dto.setCommentingUserID(getTestEntities().getCorporateUserId());

		NoteValidationTraverser traverser = new NoteValidationTraverser(dto, getTestEntities().getCorporateUserId(),
				true, bullhornData);
		return traverser;
	}

	/**
	 * Returns a valid CandidateWorkHistoryDto
	 * 
	 * @return
	 */
	public CandidateWorkHistoryDto validWorkHistory() {

		CandidateWorkHistoryDto entity = findCandidateInfo(ApiEntityName.CANDIDATE_WORK_HISTORY);

		return entity;
	}

	/**
	 * Returns a valid CandidateEducationDto
	 * 
	 * @return
	 */
	public CandidateEducationDto validEducation() {

		CandidateEducationDto entity = findCandidateInfo(ApiEntityName.CANDIDATE_EDUCATION);

		return entity;
	}

	/**
	 * Returns a valid CandidateReferenceDto
	 * 
	 * @return
	 */
	public CandidateReferenceDto validReference() {

		CandidateReferenceDto entity = findCandidateInfo(ApiEntityName.CANDIDATE_REFERENCE);

		return entity;
	}

	/**
	 * Returns a valid JobOrderDto
	 * 
	 * @return
	 */
	public JobOrderDto validJob() {

		JobOrderDto entity = bullhornApi.findEntity(ApiEntityName.JOB_ORDER.value(), testEntities.getJobOrderId());

		return entity;
	}

	public <T extends AbstractDto> T findCandidateInfo(ApiEntityName entityName) {

		String whereClause = "userID = " + testEntities.getCandidateId() + " and isDeleted = 0";
		DtoQuery dtoQuery = new DtoQuery();
		dtoQuery.setEntityName(entityName.value());
		dtoQuery.setMaxResults(1);

		if (whereClause != null && whereClause.trim().length() > 0) {
			dtoQuery.setWhere(whereClause);
		}

		List<T> queryResult = bullhornApi.getQueryResults(entityName.value(), dtoQuery);

		return queryResult.get(0);

	}

	public static byte[] convertObjectToFormUrlEncodedBytes(Object object) {

		return convertObjectToFormUrlParameters(object).getBytes();
	}

	public static String convertObjectToFormUrlParameters(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		mapper.registerModule(new JodaModule());

		Map<String, Object> propertyValues = mapper.convertValue(object, Map.class);

		Set<String> propertyNames = propertyValues.keySet();
		Iterator<String> nameIter = propertyNames.iterator();

		StringBuilder formUrlEncoded = new StringBuilder();

		for (int index = 0; index < propertyNames.size(); index++) {
			String currentKey = nameIter.next();
			Object currentValue = propertyValues.get(currentKey);

			formUrlEncoded.append(currentKey);
			formUrlEncoded.append("=");
			formUrlEncoded.append(currentValue);

			if (nameIter.hasNext()) {
				formUrlEncoded.append("&");
			}
		}

		return formUrlEncoded.toString();
	}

	public static Map<String, ?> getPropertyValues(Object object, DateFormat dateFormat) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(dateFormat);
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		mapper.registerModule(new JodaModule());

		TypeReference<HashMap<String, ?>> typeRef = new TypeReference<HashMap<String, ?>>() {
		};

		Map<String, ?> returnValues = mapper.convertValue(object, typeRef);

		return returnValues;

	}

	public TestEntities getTestEntities() {
		return testEntities;
	}

	public void setTestEntities(TestEntities testEntities) {
		this.testEntities = testEntities;
	}

	public BullhornAPI getBullhornApi() {
		return bullhornApi;
	}

	public void setBullhornApi(BullhornAPI bullhornApi) {
		this.bullhornApi = bullhornApi;
	}

}
