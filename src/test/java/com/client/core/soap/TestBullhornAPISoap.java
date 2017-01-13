package com.client.core.soap;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bullhorn.apiservice.query.DtoQuery;
import com.bullhorn.apiservice.result.ApiSaveResult;
import com.bullhorn.entity.ApiEntityName;
import com.bullhorn.entity.candidate.CandidateDto;
import com.bullhorn.entity.job.JobOrderDto;
import com.bullhorn.entity.user.CorporateUserDto;
import com.bullhorn.entity.user.UserTypeDto;
import com.client.BaseTest;
import com.client.core.ApplicationSettings;
import com.client.core.soap.model.SubscriptionEvent;
import com.client.core.soap.service.impl.BullhornAPISoap;

@Ignore
public class TestBullhornAPISoap extends BaseTest {

	@Autowired
	private BullhornAPISoap bullhornAPI;

	@Autowired
	@Qualifier("appSettings")
	private ApplicationSettings applicationSettings;

	@Test
	public void testBullhornAPISoap() {
		assertNotNull(bullhornAPI);
	}

	@Test
	public void testFindEntity() {
		CandidateDto candidate = bullhornAPI.findEntity(ApiEntityName.CANDIDATE.value(), getTestEntities()
				.getCandidateId());
		assertTrue(candidate.getUserID().intValue() == getTestEntities().getCandidateId().intValue());
	}

	@Test
	public void testFindUserType() {
		CorporateUserDto cu = bullhornAPI.findEntity(ApiEntityName.CORPORATE_USER.value(), getTestEntities()
				.getCorporateUserId());
		UserTypeDto userType = bullhornAPI.findUserType(cu.getUserTypeID());
		assertNotNull(userType);
		assertNotNull(userType.getName());
	}

	@Test
	public void testGetQueryResults() {
		DtoQuery dtoQuery = new DtoQuery();
		dtoQuery.setEntityName(ApiEntityName.JOB_ORDER.value());
		dtoQuery.setMaxResults(1);
		dtoQuery.setWhere("jobOrderID=" + getTestEntities().getJobOrderId());
		List<JobOrderDto> results = bullhornAPI.getQueryResults(ApiEntityName.JOB_ORDER.value(), dtoQuery);

		assertTrue(results.size() == 1);

	}

	@Test
	public void testSave() {
		CandidateDto candidate = bullhornAPI.findEntity(ApiEntityName.CANDIDATE.value(), getTestEntities()
				.getCandidateId());
		assertTrue(candidate.getUserID().intValue() == getTestEntities().getCandidateId().intValue());
		ApiSaveResult result = bullhornAPI.save(candidate);
		CandidateDto savedCandidate = (CandidateDto) result.getDto();
		assertTrue(savedCandidate.getUserID().equals(candidate.getUserID()));
	}

	@Test
	public void testSaveDtos() {
		CandidateDto candidate = bullhornAPI.findEntity(ApiEntityName.CANDIDATE.value(), getTestEntities()
				.getCandidateId());
		assertTrue(candidate.getUserID().intValue() == getTestEntities().getCandidateId().intValue());
		List<CandidateDto> list = new ArrayList<CandidateDto>();
		list.add(candidate);
		bullhornAPI.saveDtos(list);

	}

	@Test
	public void testGetService() {

		assertNotNull(bullhornAPI.getService());
	}

	@Test
	public void testGetSession() {
		assertNotNull(bullhornAPI.getSession());

		bullhornAPI.setSession(null);
		assertNotNull(bullhornAPI.getSession());
	}

	@Test
	public void testGetCorporationID() {
		int corporationId = Integer.valueOf(applicationSettings.getCorporationID());

		int corpId = bullhornAPI.getCorporationID();

		assertTrue(corporationId == corpId);
	}

	@Test
	public void testGetAppSettings() {
		assertNotNull(bullhornAPI.getAppSettings());
	}

	@Test
	public void testGetBullhornLogDAO() {
		assertNotNull(bullhornAPI.getBullhornLogDAO());
	}

	@Test
	public void testAssembleOpenWindowLink() {
		String link = bullhornAPI.assembleOpenWindowLink(ApiEntityName.CANDIDATE, getTestEntities().getCandidateId());

		assertTrue(StringUtils.startsWith(link, "https://"));
		assertTrue(StringUtils.endsWith(link,
				"/BullhornStaffing/OpenWindow.cfm?entity=" + ApiEntityName.CANDIDATE.value() + "&id="
						+ getTestEntities().getCandidateId()));
	}

	@Test
	public void testAssembleOpenWindowLinkNull() {
		String link = bullhornAPI.assembleOpenWindowLink(ApiEntityName.CANDIDATE, null);

		assertTrue(StringUtils.startsWith(link, "https://"));
		assertTrue(StringUtils.endsWith(link,
				"/BullhornStaffing/OpenWindow.cfm?entity=" + ApiEntityName.CANDIDATE.value() + "&id="));
	}

}
