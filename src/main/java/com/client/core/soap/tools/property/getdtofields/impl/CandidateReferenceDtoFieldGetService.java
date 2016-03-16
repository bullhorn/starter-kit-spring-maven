package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.candidate.CandidateReferenceDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("candidateReferenceGetService")
public class CandidateReferenceDtoFieldGetService extends DtoFieldGetService<CandidateReferenceDto> {

	public CandidateReferenceDtoFieldGetService() {
		super();
	}

	@Override
	public Object retrieveField(String field, CandidateReferenceDto candidateReference, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}

		if (field.equalsIgnoreCase(CANDIDATEID)) {
			value = candidateReference.getCandidateID();
		}
		else if (field.equalsIgnoreCase(CANDIDATEREFERENCEID)) {
			value = candidateReference.getCandidateReferenceID();
		}
		else if (field.equalsIgnoreCase(CANDIDATETITLE)) {
			value = candidateReference.getCandidateTitle();
		}
		else if (field.equalsIgnoreCase(CLIENTCORPORATIONID)) {
			value = candidateReference.getClientCorporationID();
		}
		else if (field.equalsIgnoreCase(COMPANYNAME)) {
			value = candidateReference.getCompanyName();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE1)) {
			value = candidateReference.getCustomDate1();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE2)) {
			value = candidateReference.getCustomDate2();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE3)) {
			value = candidateReference.getCustomDate3();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE4)) {
			value = candidateReference.getCustomDate4();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE5)) {
			value = candidateReference.getCustomDate5();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT1)) {
			value = candidateReference.getCustomFloat1();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT2)) {
			value = candidateReference.getCustomFloat2();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT3)) {
			value = candidateReference.getCustomFloat3();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT4)) {
			value = candidateReference.getCustomFloat4();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT5)) {
			value = candidateReference.getCustomFloat5();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT1)) {
			value = candidateReference.getCustomInt1();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT2)) {
			value = candidateReference.getCustomInt2();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT3)) {
			value = candidateReference.getCustomInt3();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT4)) {
			value = candidateReference.getCustomInt4();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT5)) {
			value = candidateReference.getCustomInt5();
		}
		else if (field.equalsIgnoreCase(CUSTOMMIGRATEGUID)) {
			value = candidateReference.getCustomMigrateGUID();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT1)) {
			value = candidateReference.getCustomText1();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT2)) {
			value = candidateReference.getCustomText2();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT3)) {
			value = candidateReference.getCustomText3();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT4)) {
			value = candidateReference.getCustomText4();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT5)) {
			value = candidateReference.getCustomText5();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {
			value = candidateReference.getCustomTextBlock1();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {
			value = candidateReference.getCustomTextBlock2();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {
			value = candidateReference.getCustomTextBlock3();
		}
		else if (field.equalsIgnoreCase(DATEADDED)) {
			value = candidateReference.getDateAdded();
		}
		else if (field.equalsIgnoreCase(EMPLOYMENTEND)) {
			value = candidateReference.getEmploymentEnd();
		}
		else if (field.equalsIgnoreCase(EMPLOYMENTSTART)) {
			value = candidateReference.getEmploymentStart();
		}
		else if (field.equalsIgnoreCase(ISDELETED)) {
			value = candidateReference.isIsDeleted();
		}
		else if (field.equalsIgnoreCase(JOBORDERID)) {
			value = candidateReference.getJobOrderID();
		}
		else if (field.equalsIgnoreCase(MIGRATEGUID)) {
			value = candidateReference.getMigrateGUID();
		}
		else if (field.equalsIgnoreCase(REFERENCECLIENTCONTACTID)) {
			value = candidateReference.getReferenceClientContactID();
		}
		else if (field.equalsIgnoreCase(REFERENCEEMAIL)) {
			value = candidateReference.getReferenceEmail();
		}
		else if (field.equalsIgnoreCase(REFERENCEFIRSTNAME)) {
			value = candidateReference.getReferenceFirstName();
		}
		else if (field.equalsIgnoreCase(REFERENCELASTNAME)) {
			value = candidateReference.getReferenceLastName();
		}
		else if (field.equalsIgnoreCase(REFERENCEPHONE)) {
			value = candidateReference.getReferencePhone();
		}
		else if (field.equalsIgnoreCase(REFERENCETITLE)) {
			value = candidateReference.getReferenceTitle();
		}
		else if (field.equalsIgnoreCase(STATUS)) {
			value = candidateReference.getStatus();
		}
		else if (field.equalsIgnoreCase(YEARSKNOWN)) {
			value = candidateReference.getYearsKnown();
		}
		else {
			throw new NoSuchMethodException();
		}

		return value;
	}

	private String CANDIDATEID="candidateID";
	private String CANDIDATEREFERENCEID="candidateReferenceID";
	private String CANDIDATETITLE="candidateTitle";
	private String CLIENTCORPORATIONID="clientCorporationID";
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
	private String CUSTOMMIGRATEGUID="customMigrateGUID";
	private String CUSTOMTEXT1="customText1";
	private String CUSTOMTEXT2="customText2";
	private String CUSTOMTEXT3="customText3";
	private String CUSTOMTEXT4="customText4";
	private String CUSTOMTEXT5="customText5";
	private String CUSTOMTEXTBLOCK1="customTextBlock1";
	private String CUSTOMTEXTBLOCK2="customTextBlock2";
	private String CUSTOMTEXTBLOCK3="customTextBlock3";
	private String DATEADDED="dateAdded";
	private String EMPLOYMENTEND="employmentEnd";
	private String EMPLOYMENTSTART="employmentStart";
	private String ISDELETED="isDeleted";
	private String JOBORDERID="jobOrderID";
	private String MIGRATEGUID="migrateGUID";
	private String REFERENCECLIENTCONTACTID="referenceClientContactID";
	private String REFERENCEEMAIL="referenceEmail";
	private String REFERENCEFIRSTNAME="referenceFirstName";
	private String REFERENCELASTNAME="referenceLastName";
	private String REFERENCEPHONE="referencePhone";
	private String REFERENCETITLE="referenceTitle";
	private String STATUS="status";
	private String YEARSKNOWN="yearsKnown";

}
