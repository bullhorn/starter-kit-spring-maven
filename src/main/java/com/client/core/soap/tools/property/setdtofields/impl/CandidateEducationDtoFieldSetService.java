package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.candidate.CandidateEducationDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("candidateEducationSetService")
public class CandidateEducationDtoFieldSetService extends DtoFieldSetService<CandidateEducationDto> {

	public CandidateEducationDtoFieldSetService() {
		super();
	}

	@Override
	public CandidateEducationDto changeDto(CandidateEducationDto candidateEducation, Map<String, String> fieldValues, String dateFormat,
			Boolean isDotPrefixed) {

		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}

			if(field.equalsIgnoreCase(CANDIDATEEDUCATIONID)) {

				candidateEducation.setCandidateEducationID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CANDIDATEID)) {

				candidateEducation.setCandidateID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CERTIFICATION)) {

				candidateEducation.setCertification(value);

			} else if(field.equalsIgnoreCase(CITY)) {

				candidateEducation.setCity(value);

			} else if(field.equalsIgnoreCase(COMMENTS)) {

				candidateEducation.setComments(value);

			} else if(field.equalsIgnoreCase(CUSTOMDATE1)) {

				candidateEducation.setCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE2)) {

				candidateEducation.setCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE3)) {

				candidateEducation.setCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE4)) {

				candidateEducation.setCustomDate4(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE5)) {

				candidateEducation.setCustomDate5(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {

				candidateEducation.setCustomFloat1(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {

				candidateEducation.setCustomFloat2(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {

				candidateEducation.setCustomFloat3(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT4)) {

				candidateEducation.setCustomFloat4(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT5)) {

				candidateEducation.setCustomFloat5(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT1)) {

				candidateEducation.setCustomInt1(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT2)) {

				candidateEducation.setCustomInt2(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT3)) {

				candidateEducation.setCustomInt3(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT4)) {

				candidateEducation.setCustomInt4(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT5)) {

				candidateEducation.setCustomInt5(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {

				candidateEducation.setCustomText1(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {

				candidateEducation.setCustomText1(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {

				candidateEducation.setCustomText3(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {

				candidateEducation.setCustomText4(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {

				candidateEducation.setCustomText5(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {

				candidateEducation.setCustomTextBlock1(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {

				candidateEducation.setCustomTextBlock2(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {

				candidateEducation.setCustomTextBlock3(value);

			} else if(field.equalsIgnoreCase(DATEADDED)) {

				candidateEducation.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DEGREE)) {

				candidateEducation.setDegree(value);

			} else if(field.equalsIgnoreCase(ENDDATE)) {

				candidateEducation.setEndDate(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(EXPIRATIONDATE)) {

				candidateEducation.setExpirationDate(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(GPA)) {

				candidateEducation.setGpa(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(GRADUATIONDATE)) {

				candidateEducation.setGraduationDate(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(ISDELETED)) {

				candidateEducation.setIsDeleted(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(MAJOR)) {

				candidateEducation.setMajor(value);

			} else if(field.equalsIgnoreCase(MIGRATEGUID)) {

				candidateEducation.setMigrateGUID(value);

			} else if(field.equalsIgnoreCase(SCHOOL)) {

				candidateEducation.setSchool(value);

			} else if(field.equalsIgnoreCase(STARTDATE)) {

				candidateEducation.setStartDate(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(STATE)) {

				candidateEducation.setState(value);

			}
		}

		return candidateEducation;
	}

	private String CANDIDATEEDUCATIONID="candidateEducationID";
	private String CANDIDATEID="candidateID";
	private String CERTIFICATION="certification";
	private String CITY="city";
	private String COMMENTS="comments";
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
	private String CUSTOMTEXT2="customText1";
	private String CUSTOMTEXT3="customText3";
	private String CUSTOMTEXT4="customText4";
	private String CUSTOMTEXT5="customText5";
	private String CUSTOMTEXTBLOCK1="customTextBlock1";
	private String CUSTOMTEXTBLOCK2="customTextBlock2";
	private String CUSTOMTEXTBLOCK3="customTextBlock3";
	private String DATEADDED="dateAdded";
	private String DEGREE="degree";
	private String ENDDATE="endDate";
	private String EXPIRATIONDATE="expirationDate";
	private String GPA="gpa";
	private String GRADUATIONDATE="graduationDate";
	private String ISDELETED="isDeleted";
	private String MAJOR="major";
	private String MIGRATEGUID="migrateGUID";
	private String SCHOOL="school";
	private String STARTDATE="startDate";
	private String STATE="state";

}
