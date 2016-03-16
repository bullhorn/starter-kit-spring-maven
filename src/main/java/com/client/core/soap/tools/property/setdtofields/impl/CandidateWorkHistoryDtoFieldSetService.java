package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.candidate.CandidateWorkHistoryDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("candidateWorkHistorySetService")
public class CandidateWorkHistoryDtoFieldSetService extends DtoFieldSetService<CandidateWorkHistoryDto> {

	public CandidateWorkHistoryDtoFieldSetService() {
		super();
	}

	@Override
	public CandidateWorkHistoryDto changeDto(CandidateWorkHistoryDto candidateWorkHistory, Map<String, String> fieldValues, String dateFormat,
			Boolean isDotPrefixed) {

		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}

			if(field.equalsIgnoreCase(BONUS)) {

				candidateWorkHistory.setBonus(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CANDIDATEID)) {

				candidateWorkHistory.setCandidateID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CANDIDATEWORKHISTORYID)) {

				candidateWorkHistory.setCandidateWorkHistoryID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CLIENTCORPORATIONID)) {

				candidateWorkHistory.setClientCorporationID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(COMMENTS)) {

				candidateWorkHistory.setComments(value);

			} else if(field.equalsIgnoreCase(COMMISSION)) {

				candidateWorkHistory.setCommission(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(COMPANYNAME)) {

				candidateWorkHistory.setCompanyName(value);

			} else if(field.equalsIgnoreCase(CUSTOMDATE1)) {

				candidateWorkHistory.setCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE2)) {

				candidateWorkHistory.setCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE3)) {

				candidateWorkHistory.setCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE4)) {

				candidateWorkHistory.setCustomDate4(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE5)) {

				candidateWorkHistory.setCustomDate5(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {

				candidateWorkHistory.setCustomFloat1(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {

				candidateWorkHistory.setCustomFloat2(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {

				candidateWorkHistory.setCustomFloat3(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT4)) {

				candidateWorkHistory.setCustomFloat4(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT5)) {

				candidateWorkHistory.setCustomFloat5(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT1)) {

				candidateWorkHistory.setCustomInt1(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT2)) {

				candidateWorkHistory.setCustomInt2(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT3)) {

				candidateWorkHistory.setCustomInt3(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT4)) {

				candidateWorkHistory.setCustomInt4(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT5)) {

				candidateWorkHistory.setCustomInt5(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {

				candidateWorkHistory.setCustomText1(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {

				candidateWorkHistory.setCustomText2(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {

				candidateWorkHistory.setCustomText3(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {

				candidateWorkHistory.setCustomText4(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {

				candidateWorkHistory.setCustomText5(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {

				candidateWorkHistory.setCustomTextBlock1(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {

				candidateWorkHistory.setCustomTextBlock2(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {

				candidateWorkHistory.setCustomTextBlock3(value);

			} else if(field.equalsIgnoreCase(DATEADDED)) {

				candidateWorkHistory.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(ENDDATE)) {

				candidateWorkHistory.setEndDate(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(ISDELETED)) {

				candidateWorkHistory.setIsDeleted(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISLASTJOB)) {

				candidateWorkHistory.setIsLastJob(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(JOBORDERID)) {

				candidateWorkHistory.setJobOrderID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(MIGRATEGUID)) {

				candidateWorkHistory.setMigrateGUID(value);

			} else if(field.equalsIgnoreCase(PLACEMENTID)) {

				candidateWorkHistory.setPlacementID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(SALARY1)) {

				candidateWorkHistory.setSalary1(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(SALARY2)) {

				candidateWorkHistory.setSalary2(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(SALARYTYPE)) {

				candidateWorkHistory.setSalaryType(value);

			} else if(field.equalsIgnoreCase(STARTDATE)) {

				candidateWorkHistory.setStartDate(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(TERMINATIONREASON)) {

				candidateWorkHistory.setTerminationReason(value);

			} else if(field.equalsIgnoreCase(TITLE)) {

				candidateWorkHistory.setTitle(value);

			}

		}

		return candidateWorkHistory;
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
