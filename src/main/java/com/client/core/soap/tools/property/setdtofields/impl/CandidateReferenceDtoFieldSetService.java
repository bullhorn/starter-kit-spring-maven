package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.candidate.CandidateReferenceDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("candidateReferenceSetService")
public class CandidateReferenceDtoFieldSetService extends DtoFieldSetService<CandidateReferenceDto> {
	
	public CandidateReferenceDtoFieldSetService() {
		super();
	}

	@Override
	public CandidateReferenceDto changeDto(CandidateReferenceDto candidateReference, Map<String, String> fieldValues, String dateFormat,
			Boolean isDotPrefixed) {

		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}
			
			if(field.equalsIgnoreCase(CANDIDATEID)) {

				candidateReference.setCandidateID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CANDIDATEREFERENCEID)) {

				candidateReference.setCandidateReferenceID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CANDIDATETITLE)) {

				candidateReference.setCandidateTitle(value);

		    } else if(field.equalsIgnoreCase(CLIENTCORPORATIONID)) {

				candidateReference.setClientCorporationID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(COMPANYNAME)) {

				candidateReference.setCompanyName(value);

		    } else if(field.equalsIgnoreCase(CUSTOMDATE1)) {

				candidateReference.setCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CUSTOMDATE2)) {

				candidateReference.setCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CUSTOMDATE3)) {

				candidateReference.setCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CUSTOMDATE4)) {

				candidateReference.setCustomDate4(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CUSTOMDATE5)) {

				candidateReference.setCustomDate5(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {

				candidateReference.setCustomFloat1(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {

				candidateReference.setCustomFloat2(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {

				candidateReference.setCustomFloat3(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CUSTOMFLOAT4)) {

				candidateReference.setCustomFloat4(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CUSTOMFLOAT5)) {

				candidateReference.setCustomFloat5(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CUSTOMINT1)) {

				candidateReference.setCustomInt1(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CUSTOMINT2)) {

				candidateReference.setCustomInt2(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CUSTOMINT3)) {

				candidateReference.setCustomInt3(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CUSTOMINT4)) {

				candidateReference.setCustomInt4(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CUSTOMINT5)) {

				candidateReference.setCustomInt5(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CUSTOMMIGRATEGUID)) {

				candidateReference.setCustomMigrateGUID(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {

				candidateReference.setCustomText1(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {

				candidateReference.setCustomText2(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {

				candidateReference.setCustomText3(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {

				candidateReference.setCustomText4(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {

				candidateReference.setCustomText5(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {

				candidateReference.setCustomTextBlock1(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {

				candidateReference.setCustomTextBlock2(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {

				candidateReference.setCustomTextBlock3(value);

		    } else if(field.equalsIgnoreCase(DATEADDED)) {

				candidateReference.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(EMPLOYMENTEND)) {

				candidateReference.setEmploymentEnd(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(EMPLOYMENTSTART)) {

				candidateReference.setEmploymentStart(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(ISDELETED)) {

				candidateReference.setIsDeleted(Utility.parseBoolean(value));

		    } else if(field.equalsIgnoreCase(JOBORDERID)) {

				candidateReference.setJobOrderID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(MIGRATEGUID)) {

				candidateReference.setMigrateGUID(value);

		    } else if(field.equalsIgnoreCase(REFERENCECLIENTCONTACTID)) {

				candidateReference.setReferenceClientContactID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(REFERENCEEMAIL)) {

				candidateReference.setReferenceEmail(value);

		    } else if(field.equalsIgnoreCase(REFERENCEFIRSTNAME)) {

				candidateReference.setReferenceFirstName(value);

		    } else if(field.equalsIgnoreCase(REFERENCELASTNAME)) {

				candidateReference.setReferenceLastName(value);

		    } else if(field.equalsIgnoreCase(REFERENCEPHONE)) {

				candidateReference.setReferencePhone(value);

		    } else if(field.equalsIgnoreCase(REFERENCETITLE)) {

				candidateReference.setReferenceTitle(value);

		    } else if(field.equalsIgnoreCase(STATUS)) {

				candidateReference.setStatus(value);

		    } else if(field.equalsIgnoreCase(YEARSKNOWN)) {

				candidateReference.setYearsKnown(Utility.forceParseInteger(value));

			}
			
		}
		
		return candidateReference;
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
