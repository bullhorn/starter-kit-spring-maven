package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.candidate.CandidateEducationDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("candidateEducationGetService")
public class CandidateEducationDtoFieldGetService extends DtoFieldGetService<CandidateEducationDto> {
	
	public CandidateEducationDtoFieldGetService() {
		super();
	}

	@Override
	public Object retrieveField(String field, CandidateEducationDto candidateEducation, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if (field.equalsIgnoreCase(CANDIDATEEDUCATIONID)) {
			value = candidateEducation.getCandidateEducationID();
		}
		else if (field.equalsIgnoreCase(CANDIDATEID)) {
			value = candidateEducation.getCandidateID();
		}
		else if (field.equalsIgnoreCase(CERTIFICATION)) {
			value = candidateEducation.getCertification();
		}
		else if (field.equalsIgnoreCase(CITY)) {
			value = candidateEducation.getCity();
		}
		else if (field.equalsIgnoreCase(COMMENTS)) {
			value = candidateEducation.getComments();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE1)) {
			value = candidateEducation.getCustomDate1();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE2)) {
			value = candidateEducation.getCustomDate2();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE3)) {
			value = candidateEducation.getCustomDate3();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE4)) {
			value = candidateEducation.getCustomDate4();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE5)) {
			value = candidateEducation.getCustomDate5();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT1)) {
			value = candidateEducation.getCustomFloat1();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT2)) {
			value = candidateEducation.getCustomFloat2();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT3)) {
			value = candidateEducation.getCustomFloat3();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT4)) {
			value = candidateEducation.getCustomFloat4();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT5)) {
			value = candidateEducation.getCustomFloat5();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT1)) {
			value = candidateEducation.getCustomInt1();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT2)) {
			value = candidateEducation.getCustomInt2();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT3)) {
			value = candidateEducation.getCustomInt3();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT4)) {
			value = candidateEducation.getCustomInt4();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT5)) {
			value = candidateEducation.getCustomInt5();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT1)) {
			value = candidateEducation.getCustomText1();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT2)) {
			value = candidateEducation.getCustomText2();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT3)) {
			value = candidateEducation.getCustomText3();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT4)) {
			value = candidateEducation.getCustomText4();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT5)) {
			value = candidateEducation.getCustomText5();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {
			value = candidateEducation.getCustomTextBlock1();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {
			value = candidateEducation.getCustomTextBlock2();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {
			value = candidateEducation.getCustomTextBlock3();
		}
		else if (field.equalsIgnoreCase(DATEADDED)) {
			value = candidateEducation.getDateAdded();
		}
		else if (field.equalsIgnoreCase(DEGREE)) {
			value = candidateEducation.getDegree();
		}
		else if (field.equalsIgnoreCase(ENDDATE)) {
			value = candidateEducation.getEndDate();
		}
		else if (field.equalsIgnoreCase(EXPIRATIONDATE)) {
			value = candidateEducation.getExpirationDate();
		}
		else if (field.equalsIgnoreCase(GPA)) {
			value = candidateEducation.getGpa();
		}
		else if (field.equalsIgnoreCase(GRADUATIONDATE)) {
			value = candidateEducation.getGraduationDate();
		}
		else if (field.equalsIgnoreCase(ISDELETED)) {
			candidateEducation.isIsDeleted();
		}
		else if (field.equalsIgnoreCase(MAJOR)) {
			value = candidateEducation.getMajor();
		}
		else if (field.equalsIgnoreCase(MIGRATEGUID)) {
			value = candidateEducation.getMigrateGUID();
		}
		else if (field.equalsIgnoreCase(SCHOOL)) {
			value = candidateEducation.getSchool();
		}
		else if (field.equalsIgnoreCase(STARTDATE)) {
			value = candidateEducation.getStartDate();
		}
		else if (field.equalsIgnoreCase(STATE)) {
			value = candidateEducation.getState();
		}
		else {
			throw new NoSuchMethodException();
		}
		
		return value;
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
