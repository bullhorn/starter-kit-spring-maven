package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.candidate.CandidateWorkHistoryDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("candidateWorkHistoryGetService")
public class CandidateWorkHistoryDtoFieldGetService extends DtoFieldGetService<CandidateWorkHistoryDto> {
	
	public CandidateWorkHistoryDtoFieldGetService() {
		super();
	}
	
	@Override
	public Object retrieveField(String field, CandidateWorkHistoryDto candidateWorkHistory, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if (field.equalsIgnoreCase(BONUS)) {
			value = candidateWorkHistory.getBonus();
		}
		else if (field.equalsIgnoreCase(CANDIDATEID)) {
			value = candidateWorkHistory.getCandidateID();
		}
		else if (field.equalsIgnoreCase(CANDIDATEWORKHISTORYID)) {
			value = candidateWorkHistory.getCandidateWorkHistoryID();
		}
		else if (field.equalsIgnoreCase(CLIENTCORPORATIONID)) {
			value = candidateWorkHistory.getClientCorporationID();
		}
		else if (field.equalsIgnoreCase(COMMENTS)) {
			value = candidateWorkHistory.getComments();
		}
		else if (field.equalsIgnoreCase(COMMISSION)) {
			value = candidateWorkHistory.getCommission();
		}
		else if (field.equalsIgnoreCase(COMPANYNAME)) {
			value = candidateWorkHistory.getCompanyName();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE1)) {
			value = candidateWorkHistory.getCustomDate1();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE2)) {
			value = candidateWorkHistory.getCustomDate2();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE3)) {
			value = candidateWorkHistory.getCustomDate3();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE4)) {
			value = candidateWorkHistory.getCustomDate4();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE5)) {
			value = candidateWorkHistory.getCustomDate5();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT1)) {
			value = candidateWorkHistory.getCustomFloat1();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT2)) {
			value = candidateWorkHistory.getCustomFloat2();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT3)) {
			value = candidateWorkHistory.getCustomFloat3();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT4)) {
			value = candidateWorkHistory.getCustomFloat4();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT5)) {
			value = candidateWorkHistory.getCustomFloat5();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT1)) {
			value = candidateWorkHistory.getCustomInt1();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT2)) {
			value = candidateWorkHistory.getCustomInt2();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT3)) {
			value = candidateWorkHistory.getCustomInt3();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT4)) {
			value = candidateWorkHistory.getCustomInt4();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT5)) {
			value = candidateWorkHistory.getCustomInt5();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT1)) {
			value = candidateWorkHistory.getCustomText1();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT2)) {
			value = candidateWorkHistory.getCustomText2();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT3)) {
			value = candidateWorkHistory.getCustomText3();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT4)) {
			value = candidateWorkHistory.getCustomText4();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT5)) {
			value = candidateWorkHistory.getCustomText5();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {
			value = candidateWorkHistory.getCustomTextBlock1();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {
			value = candidateWorkHistory.getCustomTextBlock2();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {
			value = candidateWorkHistory.getCustomTextBlock3();
		}
		else if (field.equalsIgnoreCase(DATEADDED)) {
			value = candidateWorkHistory.getDateAdded();
		}
		else if (field.equalsIgnoreCase(ENDDATE)) {
			value = candidateWorkHistory.getEndDate();
		}
		else if (field.equalsIgnoreCase(ISDELETED)) {
			value = candidateWorkHistory.isIsDeleted();
		}
		else if (field.equalsIgnoreCase(ISLASTJOB)) {
			value = candidateWorkHistory.isIsLastJob();
		}
		else if (field.equalsIgnoreCase(JOBORDERID)) {
			value = candidateWorkHistory.getJobOrderID();
		}
		else if (field.equalsIgnoreCase(MIGRATEGUID)) {
			value = candidateWorkHistory.getMigrateGUID();
		}
		else if (field.equalsIgnoreCase(PLACEMENTID)) {
			value = candidateWorkHistory.getPlacementID();
		}
		else if (field.equalsIgnoreCase(SALARY1)) {
			value = candidateWorkHistory.getSalary1();
		}
		else if (field.equalsIgnoreCase(SALARY2)) {
			value = candidateWorkHistory.getSalary2();
		}
		else if (field.equalsIgnoreCase(SALARYTYPE)) {
			value = candidateWorkHistory.getSalaryType();
		}
		else if (field.equalsIgnoreCase(STARTDATE)) {
			value = candidateWorkHistory.getStartDate();
		}
		else if (field.equalsIgnoreCase(TERMINATIONREASON)) {
			value = candidateWorkHistory.getTerminationReason();
		}
		else if (field.equalsIgnoreCase(TITLE)) {
			value = candidateWorkHistory.getTitle();
		}
		else {
			throw new NoSuchMethodException();
		}
		
		return value;
	}

	private String BONUS="bonus";
	private String CANDIDATEID="candidateID";
	private String CANDIDATEWORKHISTORYID="candidateWorkHistoryID";
	private String CLIENTCORPORATIONID="clientCorporationID";
	private String COMMENTS="comments";
	private String COMMISSION="commission";
	private String COMPANYNAME="companyName";
	private String CUSTOMDATE1="customDate1";
	private String CUSTOMDATE2="customDate2";
	private String CUSTOMDATE3="customDate3";
	private String CUSTOMDATE4="customDate4";
	private String CUSTOMDATE5="customDate5";
	private String CUSTOMFLOAT1="customFloat1";
	private String CUSTOMFLOAT2="customFloat2";
	private String CUSTOMFLOAT3="customFloat3";
	private String CUSTOMFLOAT4="customFloat4";
	private String CUSTOMFLOAT5="customFloat5";
	private String CUSTOMINT1="customInt1";
	private String CUSTOMINT2="customInt2";
	private String CUSTOMINT3="customInt3";
	private String CUSTOMINT4="customInt4";
	private String CUSTOMINT5="customInt5";
	private String CUSTOMTEXT1="customText1";
	private String CUSTOMTEXT2="customText2";
	private String CUSTOMTEXT3="customText3";
	private String CUSTOMTEXT4="customText4";
	private String CUSTOMTEXT5="customText5";
	private String CUSTOMTEXTBLOCK1="customTextBlock1";
	private String CUSTOMTEXTBLOCK2="customTextBlock2";
	private String CUSTOMTEXTBLOCK3="customTextBlock3";
	private String DATEADDED="dateAdded";
	private String ENDDATE="endDate";
	private String ISDELETED="isDeleted";
	private String ISLASTJOB="isLastJob";
	private String JOBORDERID="jobOrderID";
	private String MIGRATEGUID="migrateGUID";
	private String PLACEMENTID="placementID";
	private String SALARY1="salary1";
	private String SALARY2="salary2";
	private String SALARYTYPE="salaryType";
	private String STARTDATE="startDate";
	private String TERMINATIONREASON="terminationReason";
	private String TITLE="title";

}
