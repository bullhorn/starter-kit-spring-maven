package com.client.core.base.tools.restsoap.impl

import com.bullhorn.entity.appointment.AppointmentAttendeeDto
import com.bullhorn.entity.appointment.AppointmentDto
import com.bullhorn.entity.candidate.*
import com.bullhorn.entity.cert.CertificationDto
import com.bullhorn.entity.client.ClientContactDto
import com.bullhorn.entity.client.ClientCorporationDto
import com.bullhorn.entity.corp.CorporationDepartmentDto
import com.bullhorn.entity.emb.Address
import com.bullhorn.entity.emb.AddressWithoutCountry
import com.bullhorn.entity.job.*
import com.bullhorn.entity.lists.*
import com.bullhorn.entity.note.NoteDto
import com.bullhorn.entity.note.NoteEntityDto
import com.bullhorn.entity.task.TaskDto
import com.bullhorn.entity.user.CorporateUserDto
import com.bullhornsdk.data.model.entity.core.standard.*
import com.client.core.base.tools.restsoap.RestToSoapConverter
import com.client.core.base.util.Util
import org.joda.time.DateTime
import org.springframework.stereotype.Service

import javax.xml.datatype.XMLGregorianCalendar

@Service
public class StandardRestToSoapConverter implements RestToSoapConverter {

	@Override
	public AppointmentDto convert(Appointment entity) {
		AppointmentDto dto = new AppointmentDto();
		dto.setAppointmentID(entity.id);
		dto.setAppointmentUUID(entity.appointmentUUID);
		dto.setCandidateReferenceID(entity.candidateReference?.id);
		dto.setClientContactReferenceID(entity.clientContactReference?.id);
		dto.setCommunicationMethod(entity.communicationMethod);
		dto.setDateAdded(dateTimeToXmlGregCal(entity.dateAdded));
		dto.setDateBegin(dateTimeToXmlGregCal(entity.dateBegin));
		dto.setDateEnd(dateTimeToXmlGregCal(entity.dateEnd));
		dto.setDateLastModified(dateTimeToXmlGregCal(entity.dateLastModified));
		dto.setDescription(entity.description);
		dto.setIsAllDay(entity.isAllDay);
		dto.setIsDeleted(entity.isDeleted);
		dto.setIsPrivate(entity.isPrivate);
		dto.setJobOrderID(entity.jobOrder?.id);
		dto.setLocation(entity.location);
		dto.setMigrateGUID(entity.migrateGUID);
		dto.setNotificationMinutes(entity.notificationMinutes);
		dto.setOwnerID(entity.owner?.id);
		dto.setParentAppointmentID(entity.parentAppointment?.id);
		dto.setPlacementID(entity.placement?.id);
		dto.setRecurrenceDayBits(entity.recurrenceDayBits);
		dto.setRecurrenceFrequency(entity.recurrenceFrequency);
		dto.setRecurrenceMax(entity.recurrenceMax);
		dto.setRecurrenceMonthBits(entity.recurrenceMonthBits);
		dto.setRecurrenceStyle(entity.recurrenceStyle);
		dto.setRecurrenceType(entity.recurrenceType);
		dto.setShowTimeAs(entity.showTimeAs);
		dto.setSubject(entity.subject);
		dto.setTimeZoneID(entity.timeZoneID);
		dto.setType(entity.type);
		return dto;
	}

	@Override
	public AppointmentAttendeeDto convert(AppointmentAttendee entity) {
		AppointmentAttendeeDto dto = new AppointmentAttendeeDto();
		dto.setAcceptanceStatus(entity.acceptanceStatus);
		dto.setAppointmentAttendeeID(entity.id);
		dto.setAppointmentID(entity.appointment?.id);
		dto.setAttendeeID(entity.attendee?.id);
		dto.setMigrateGUID(entity.migrateGUID);
		return dto;
	}

	@Override
	public BusinessSectorDto convert(BusinessSector entity) {
		BusinessSectorDto dto = new BusinessSectorDto();
		dto.setBusinessSectorID(entity.id);
		dto.setDateAdded(dateTimeToXmlGregCal(entity.dateAdded));
		dto.setName(entity.name);
		return dto;
	}

	@Override
	public CandidateDto convert(Candidate entity) {
		CandidateDto dto = new CandidateDto();
		if (entity.address != null) {
			com.bullhorn.entity.emb.Address addressDto = new com.bullhorn.entity.emb.Address();
			addressDto.setAddress1(entity.address.getAddress1());
			addressDto.setAddress2(entity.address.getAddress2());
			addressDto.setCity(entity.address.getCity());
			addressDto.setCountryID(entity.address.getCountryID());
			addressDto.setState(entity.address.getState());
			addressDto.setZip(entity.address.getZip());
			dto.setAddress(addressDto);
		}

		if (entity.category != null) {
			dto.setCategoryID(entity.category.getId());
		}
		dto.setCertifications(entity.certifications);
		dto.setComments(entity.comments);
		dto.setCompanyName(entity.companyName);
		dto.setCompanyURL(entity.companyURL);
		dto.setCustomDate1(dateTimeToXmlGregCal(entity.getCustomDate1()));
		dto.setCustomDate2(dateTimeToXmlGregCal(entity.getCustomDate2()));
		dto.setCustomDate3(dateTimeToXmlGregCal(entity.getCustomDate3()));
		dto.setCustomFloat1(bigDecimalToDouble(entity.getCustomFloat1()));
		dto.setCustomFloat2(bigDecimalToDouble(entity.getCustomFloat2()));
		dto.setCustomFloat3(bigDecimalToDouble(entity.getCustomFloat3()));
		dto.setCustomInt1(entity.getCustomInt1());
		dto.setCustomInt2(entity.getCustomInt2());
		dto.setCustomInt3(entity.getCustomInt3());
		dto.setCustomText1(entity.getCustomText1());
		dto.setCustomText2(entity.getCustomText2());
		dto.setCustomText3(entity.getCustomText3());
		dto.setCustomText4(entity.getCustomText4());
		dto.setCustomText5(entity.getCustomText5());
		dto.setCustomText6(entity.getCustomText6());
		dto.setCustomText7(entity.getCustomText7());
		dto.setCustomText8(entity.getCustomText8());
		dto.setCustomText9(entity.getCustomText9());
		dto.setCustomText10(entity.getCustomText10());
		dto.setCustomText11(entity.getCustomText11());
		dto.setCustomText12(entity.getCustomText12());
		dto.setCustomText13(entity.getCustomText13());
		dto.setCustomText14(entity.getCustomText14());
		dto.setCustomText15(entity.getCustomText15());
		dto.setCustomText16(entity.getCustomText16());
		dto.setCustomText17(entity.getCustomText17());
		dto.setCustomText18(entity.getCustomText18());
		dto.setCustomText19(entity.getCustomText19());
		dto.setCustomText20(entity.getCustomText20());
		dto.setCustomTextBlock1(entity.getCustomTextBlock1());
		dto.setCustomTextBlock2(entity.getCustomTextBlock2());
		dto.setCustomTextBlock3(entity.getCustomTextBlock3());
		dto.setCustomTextBlock4(entity.getCustomTextBlock4());
		dto.setCustomTextBlock5(entity.getCustomTextBlock5());
		dto.setDateAdded(dateTimeToXmlGregCal(entity.dateAdded));
		dto.setDateAvailable(dateTimeToXmlGregCal(entity.dateAvailable));
		dto.setDateAvailableEnd(dateTimeToXmlGregCal(entity.dateAvailableEnd));
		dto.setDateI9Expiration(dateTimeToXmlGregCal(entity.dateI9Expiration));
		dto.setDateLastComment(dateTimeToXmlGregCal(entity.dateLastComment));
		dto.setDateNextCall(dateTimeToXmlGregCal(entity.dateNextCall));
		dto.setDateOfBirth(dateTimeToXmlGregCal(entity.dateOfBirth));
		dto.setDayRate(entity.dayRate);
		dto.setDayRateLow(entity.dayRateLow);
		dto.setDegreeList(entity.degreeList);
		dto.setDescription(entity.description);
		dto.setDesiredLocations(entity.desiredLocations);
		dto.setDisability(entity.disability);
		dto.setEducationDegree(entity.educationDegree);
		dto.setEmail(entity.email);
		dto.setEmail2(entity.email2);
		dto.setEmail3(entity.email3);
		dto.setEmployeeType(entity.employeeType);
		dto.setEmploymentPreference(entity.employmentPreference);
		dto.setEthnicity(entity.ethnicity);
		dto.setExperience(entity.experience);
		dto.setExternalID(entity.externalID);
		dto.setFax(entity.fax);
		dto.setFax2(entity.fax2);
		dto.setFax3(entity.fax3);
		dto.setFederalAddtionalWitholdingsAmount(entity.federalAddtionalWitholdingsAmount);
		dto.setFederalExemptions(entity.federalExemptions);
		dto.setFederalFilingStatus(entity.federalFilingStatus);
		dto.setFirstName(entity.firstName);
		dto.setGender(entity.gender);
		dto.setHourlyRate(entity.hourlyRate);
		dto.setHourlyRateLow(entity.hourlyRateLow);
		dto.setI9OnFile(entity.i9OnFile);
		dto.setIsDayLightSavings(entity.isDayLightSavings);
		dto.setIsDeleted(entity.isDeleted);
		dto.setIsEditable(entity.isEditable);
		dto.setIsLockedOut(entity.isLockedOut);
		dto.setLastName(entity.lastName);
		if (entity.linkedPerson != null) {
			dto.setLinkedPersonID(entity.linkedPerson.getId());
		}
		dto.setLocalAddtionalWitholdingsAmount(entity.localAddtionalWitholdingsAmount);
		dto.setLocalExemptions(entity.localExemptions);
		dto.setLocalFilingStatus(entity.localFilingStatus);
		dto.setLocalTaxCode(entity.localTaxCode);
		dto.setMassMailOptOut(entity.massMailOptOut);
		dto.setMiddleName(entity.middleName);
		dto.setMigrateGUID("" + entity.getMigrateGUID());
		dto.setMobile(entity.mobile);
		dto.setName(entity.name);

		dto.setNamePrefix(entity.namePrefix);
		dto.setNameSuffix(entity.nameSuffix);

		dto.setNickName(entity.nickName);
		dto.setNumCategories(entity.numCategories);
		dto.setNumOwners(entity.numOwners);
		dto.setOccupation(entity.occupation);
		if (entity.owner != null) {
			dto.setOwnerID(entity.owner.getId());
		}
		dto.setPager(entity.pager);
		dto.setPaperWorkOnFile(entity.paperWorkOnFile);
		dto.setPassword(entity.password);
		dto.setPhone(entity.phone);
		dto.setPhone2(entity.phone2);
		dto.setPhone3(entity.phone3);
		dto.setPreferredContact(entity.preferredContact);
		dto.setRecentClientList(entity.recentClientList);
		dto.setReferredBy(entity.referredBy);
		dto.setSalary(entity.salary);
		dto.setSalaryLow(entity.salaryLow);

		if (entity.secondaryAddress != null) {
			com.bullhorn.entity.emb.Address addressDto2 = new com.bullhorn.entity.emb.Address();
			addressDto2.setAddress1(entity.secondaryAddress.getAddress1());
			addressDto2.setAddress2(entity.secondaryAddress.getAddress2());
			addressDto2.setCity(entity.secondaryAddress.getCity());
			addressDto2.setCountryID(entity.secondaryAddress.getCountryID());
			addressDto2.setState(entity.secondaryAddress.getState());
			addressDto2.setZip(entity.secondaryAddress.getZip());
			dto.setSecondaryAddress(addressDto2);
		}

		dto.setSkillSet(entity.skillSet);
		dto.setSmsOptIn(entity.smsOptIn);
		dto.setSource(entity.source);
		dto.setSsn(entity.ssn);
		dto.setStateAddtionalWitholdingsAmount(entity.stateAddtionalWitholdingsAmount);
		dto.setStateExemptions(entity.stateExemptions);
		dto.setStateFilingStatus(entity.stateFilingStatus);
		dto.setStatus(entity.status);
		dto.setUserID(entity.id);
		dto.setUsername(entity.username);

		dto.setVeteran(entity.veteran);
		dto.setWillRelocate(entity.willRelocate);
		dto.setWorkAuthorized(entity.workAuthorized);
		dto.setWorkPhone(entity.workPhone);

		return dto;
	}

	@Override
	public CandidateEducationDto convert(CandidateEducation entity) {
		CandidateEducationDto dto = new CandidateEducationDto();
		dto.setCandidateEducationID(entity.id);
		dto.setCandidateID(entity.candidate?.id);
		dto.setCertification(entity.certification);
		dto.setCity(entity.city);
		dto.setComments(entity.comments);
		dto.setCustomDate1(dateTimeToXmlGregCal(entity.getCustomDate1()));
		dto.setCustomDate2(dateTimeToXmlGregCal(entity.getCustomDate2()));
		dto.setCustomDate3(dateTimeToXmlGregCal(entity.getCustomDate3()));
		dto.setCustomDate4(dateTimeToXmlGregCal(entity.getCustomDate4()));
		dto.setCustomDate5(dateTimeToXmlGregCal(entity.getCustomDate5()));
		dto.setCustomFloat1(bigDecimalToDouble(entity.getCustomFloat1()));
		dto.setCustomFloat2(bigDecimalToDouble(entity.getCustomFloat2()));
		dto.setCustomFloat3(bigDecimalToDouble(entity.getCustomFloat3()));
		dto.setCustomFloat4(bigDecimalToDouble(entity.getCustomFloat4()));
		dto.setCustomFloat5(bigDecimalToDouble(entity.getCustomFloat5()));
		dto.setCustomInt1(entity.getCustomInt1());
		dto.setCustomInt2(entity.getCustomInt2());
		dto.setCustomInt3(entity.getCustomInt3());
		dto.setCustomInt4(entity.getCustomInt4());
		dto.setCustomInt5(entity.getCustomInt5());
		dto.setCustomText1(entity.getCustomText1());
		dto.setCustomText2(entity.getCustomText2());
		dto.setCustomText3(entity.getCustomText3());
		dto.setCustomText4(entity.getCustomText4());
		dto.setCustomText5(entity.getCustomText5());

		dto.setCustomTextBlock1(entity.getCustomTextBlock1());
		dto.setCustomTextBlock2(entity.getCustomTextBlock2());
		dto.setCustomTextBlock3(entity.getCustomTextBlock3());
		dto.setDateAdded(dateTimeToXmlGregCal(entity.dateAdded));
		dto.setDegree(entity.degree);
		dto.setEndDate(dateTimeToXmlGregCal(entity.endDate));
		dto.setExpirationDate(dateTimeToXmlGregCal(entity.expirationDate));
		dto.setGpa(bigDecimalToDouble(entity.gpa));
		dto.setGraduationDate(dateTimeToXmlGregCal(entity.graduationDate));
		dto.setIsDeleted(entity.isDeleted);
		dto.setMajor(entity.major);
		dto.setMigrateGUID(entity.migrateGUID);
		dto.setSchool(entity.school);
		dto.setStartDate(dateTimeToXmlGregCal(entity.startDate));
		dto.setState(entity.state);
		return dto;
	}

	@Override
	public CandidateReferenceDto convert(CandidateReference entity) {
		CandidateReferenceDto dto = new CandidateReferenceDto();
		dto.setCandidateReferenceID(entity.id);
		dto.setCandidateID(entity.candidate?.id);
		dto.setCandidateTitle(entity.candidateTitle);
		dto.setClientCorporationID(entity.clientCorporation?.id);
		dto.setCompanyName(entity.companyName);
		dto.setCustomDate1(dateTimeToXmlGregCal(entity.getCustomDate1()));
		dto.setCustomDate2(dateTimeToXmlGregCal(entity.getCustomDate2()));
		dto.setCustomDate3(dateTimeToXmlGregCal(entity.getCustomDate3()));
		dto.setCustomDate4(dateTimeToXmlGregCal(entity.getCustomDate4()));
		dto.setCustomDate5(dateTimeToXmlGregCal(entity.getCustomDate5()));
		dto.setCustomFloat1(bigDecimalToDouble(entity.getCustomFloat1()));
		dto.setCustomFloat2(bigDecimalToDouble(entity.getCustomFloat2()));
		dto.setCustomFloat3(bigDecimalToDouble(entity.getCustomFloat3()));
		dto.setCustomFloat4(bigDecimalToDouble(entity.getCustomFloat4()));
		dto.setCustomFloat5(bigDecimalToDouble(entity.getCustomFloat5()));
		dto.setCustomInt1(entity.getCustomInt1());
		dto.setCustomInt2(entity.getCustomInt2());
		dto.setCustomInt3(entity.getCustomInt3());
		dto.setCustomInt4(entity.getCustomInt4());
		dto.setCustomInt5(entity.getCustomInt5());
		dto.setCustomMigrateGUID(entity.customMigrateGUID);
		dto.setCustomText1(entity.getCustomText1());
		dto.setCustomText2(entity.getCustomText2());
		dto.setCustomText3(entity.getCustomText3());
		dto.setCustomText4(entity.getCustomText4());
		dto.setCustomText5(entity.getCustomText5());
		dto.setCustomTextBlock1(entity.getCustomTextBlock1());
		dto.setCustomTextBlock2(entity.getCustomTextBlock2());
		dto.setCustomTextBlock3(entity.getCustomTextBlock3());
		dto.setDateAdded(dateTimeToXmlGregCal(entity.dateAdded));
		dto.setEmploymentEnd(dateTimeToXmlGregCal(entity.employmentEnd));
		dto.setEmploymentStart(dateTimeToXmlGregCal(entity.employmentStart));
		dto.setIsDeleted(entity.isDeleted);
		dto.setJobOrderID(entity.jobOrder?.id);
		dto.setMigrateGUID(entity.migrateGUID);
		dto.setReferenceClientContactID(entity.referenceClientContact?.id);
		dto.setReferenceEmail(entity.referenceEmail);
		dto.setReferenceFirstName(entity.referenceFirstName);
		dto.setReferenceLastName(entity.referenceLastName);
		dto.setReferencePhone(entity.referencePhone);
		dto.setReferenceTitle(entity.referenceTitle);
		dto.setStatus(entity.status);
		dto.setYearsKnown(entity.yearsKnown);

		return dto;
	}

	@Override
	public CandidateWorkHistoryDto convert(CandidateWorkHistory entity) {
		CandidateWorkHistoryDto dto = new CandidateWorkHistoryDto();
		dto.setBonus(bigDecimalToDouble(entity.bonus));
		dto.setCandidateWorkHistoryID(entity.id);
		dto.setCandidateID(entity.candidate?.id);
		dto.setClientCorporationID(entity.clientCorporation?.id);
		dto.setComments(entity.comments);
		dto.setCommission(bigDecimalToDouble(entity.commission));
		dto.setCompanyName(entity.companyName);
		dto.setCustomDate1(dateTimeToXmlGregCal(entity.getCustomDate1()));
		dto.setCustomDate2(dateTimeToXmlGregCal(entity.getCustomDate2()));
		dto.setCustomDate3(dateTimeToXmlGregCal(entity.getCustomDate3()));
		dto.setCustomDate4(dateTimeToXmlGregCal(entity.getCustomDate4()));
		dto.setCustomDate5(dateTimeToXmlGregCal(entity.getCustomDate5()));
		dto.setCustomFloat1(bigDecimalToDouble(entity.getCustomFloat1()));
		dto.setCustomFloat2(bigDecimalToDouble(entity.getCustomFloat2()));
		dto.setCustomFloat3(bigDecimalToDouble(entity.getCustomFloat3()));
		dto.setCustomFloat4(bigDecimalToDouble(entity.getCustomFloat4()));
		dto.setCustomFloat5(bigDecimalToDouble(entity.getCustomFloat5()));
		dto.setCustomInt1(entity.getCustomInt1());
		dto.setCustomInt2(entity.getCustomInt2());
		dto.setCustomInt3(entity.getCustomInt3());
		dto.setCustomInt4(entity.getCustomInt4());
		dto.setCustomInt5(entity.getCustomInt5());

		dto.setCustomText1(entity.getCustomText1());
		dto.setCustomText2(entity.getCustomText2());
		dto.setCustomText3(entity.getCustomText3());
		dto.setCustomText4(entity.getCustomText4());
		dto.setCustomText5(entity.getCustomText5());
		dto.setCustomTextBlock1(entity.getCustomTextBlock1());
		dto.setCustomTextBlock2(entity.getCustomTextBlock2());
		dto.setCustomTextBlock3(entity.getCustomTextBlock3());
		dto.setDateAdded(dateTimeToXmlGregCal(entity.dateAdded));

		dto.setEndDate(dateTimeToXmlGregCal(entity.endDate));

		dto.setIsDeleted(entity.isDeleted);
		dto.setIsLastJob(entity.isLastJob);
		dto.setJobOrderID(entity.jobOrder?.id);
		dto.setMigrateGUID(entity.migrateGUID);
		dto.setPlacementID(entity.placement?.id);
		dto.setSalary1(entity.salary1);
		dto.setSalary2(entity.salary2);
		dto.setSalaryType(entity.salaryType);
		dto.setStartDate(dateTimeToXmlGregCal(entity.startDate));
		dto.setTerminationReason(entity.terminationReason);
		dto.setTitle(entity.title);
		return dto;
	}

	@Override
	public CategoryDto convert(Category entity) {
		CategoryDto dto = new CategoryDto();
		dto.setCategoryID(entity.id);
		dto.setDateAdded(dateTimeToXmlGregCal(entity.dateAdded));
		dto.setDescription(entity.description);
		dto.setEnabled(entity.enabled);
		dto.setExternalID(entity.externalID);
		dto.setName(entity.name);
		dto.setOccupation(entity.occupation);
		dto.setType(entity.type);
		return dto;
	}

	@Override
	public CertificationDto convert(Certification entity) {
		CertificationDto dto = new CertificationDto();
		dto.setCertificationID(entity.id);
		dto.setDescription(entity.description);
		dto.setName(entity.name);
		return dto;
	}

	@Override
	public ClientContactDto convert(ClientContact entity) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ClientCorporationDto convert(ClientCorporation entity) {
		ClientCorporationDto clientCorporation = new ClientCorporationDto();

		clientCorporation.setAnnualRevenue(entity.annualRevenue);
		clientCorporation.setBillingContact(entity.billingContact);
		clientCorporation.setBillingFrequency(entity.billingFrequency);
		clientCorporation.setBillingPhone(entity.billingPhone);
		clientCorporation.setBusinessSectorList(entity.businessSectorList);
		clientCorporation.setClientCorporationID(entity.id);
		clientCorporation.setCompanyDescription(entity.companyDescription);
		clientCorporation.setCompanyURL(entity.companyURL);
		clientCorporation.setCompetitors(entity.competitors);
		clientCorporation.setCulture(entity.culture);
		clientCorporation.setCustomDate1(dateTimeToXmlGregCal(entity.customDate1));
		clientCorporation.setCustomDate2(dateTimeToXmlGregCal(entity.customDate2));
		clientCorporation.setCustomDate3(dateTimeToXmlGregCal(entity.customDate3));
		clientCorporation.setCustomFloat1(bigDecimalToDouble(entity.customFloat1));
		clientCorporation.setCustomFloat2(bigDecimalToDouble(entity.customFloat2));
		clientCorporation.setCustomFloat3(bigDecimalToDouble(entity.customFloat3));
		clientCorporation.setCustomInt1(entity.customInt1);
		clientCorporation.setCustomInt2(entity.customInt2);
		clientCorporation.setCustomInt3(entity.customInt3);
		clientCorporation.setCustomText1(entity.customText1);
		clientCorporation.setCustomText10(entity.customText10);
		clientCorporation.setCustomText11(entity.customText11);
		clientCorporation.setCustomText12(entity.customText12);
		clientCorporation.setCustomText13(entity.customText13);
		clientCorporation.setCustomText14(entity.customText14);
		clientCorporation.setCustomText15(entity.customText15);
		clientCorporation.setCustomText16(entity.customText16);
		clientCorporation.setCustomText17(entity.customText17);
		clientCorporation.setCustomText18(entity.customText18);
		clientCorporation.setCustomText19(entity.customText19);
		clientCorporation.setCustomText2(entity.customText2);
		clientCorporation.setCustomText20(entity.customText20);
		clientCorporation.setCustomText3(entity.customText3);
		clientCorporation.setCustomText4(entity.customText4);
		clientCorporation.setCustomText5(entity.customText5);
		clientCorporation.setCustomText6(entity.customText6);
		clientCorporation.setCustomText7(entity.customText7);
		clientCorporation.setCustomText8(entity.customText8);
		clientCorporation.setCustomText9(entity.customText9);
		clientCorporation.setCustomTextBlock1(entity.customTextBlock1);
		clientCorporation.setCustomTextBlock2(entity.customTextBlock2);
		clientCorporation.setCustomTextBlock3(entity.customTextBlock3);
		clientCorporation.setCustomTextBlock4(entity.customTextBlock4);
		clientCorporation.setCustomTextBlock5(entity.customTextBlock5);
		clientCorporation.setDateAdded(dateTimeToXmlGregCal(entity.dateAdded));
		clientCorporation.setDateFounded(dateTimeToXmlGregCal(entity.dateFounded));
		clientCorporation.setDepartmentID(entity.department?.id);
		clientCorporation.setExternalID(entity.externalID);
		clientCorporation.setFax(entity.fax);
		clientCorporation.setFeeArrangement(bigDecimalToDouble(entity.feeArrangement));
		clientCorporation.setFunding(entity.funding);
		clientCorporation.setIndustryList(entity.industryList);
		clientCorporation.setInvoiceFormat(entity.invoiceFormat);
		clientCorporation.setName(entity.name);
		clientCorporation.setNotes(entity.notes);
		clientCorporation.setNumEmployees(entity.numEmployees);
		clientCorporation.setNumOffices(entity.numOffices);
		clientCorporation.setOwnerShip(entity.ownership);
		clientCorporation.setParentClientCorporationID(entity.parentClientCorporation?.id);
		clientCorporation.setPhone(entity.phone);
		clientCorporation.setRevenue(entity.revenue);
		clientCorporation.setStatus(entity.status);
		clientCorporation.setTaxRate(entity.taxRate);
		clientCorporation.setTickerSymbol(entity.tickerSymbol);
		clientCorporation.setWorkWeekStart(entity.workWeekStart);

		Address address = new Address();
		address.setAddress1(entity.address?.address1);
		address.setAddress2(entity.address?.address2);
		address.setCity(entity.address?.city);
		address.setCountryID(entity.address?.countryID);
		address.setState(entity.address?.state);
		address.setZip(entity.address?.zip);
		clientCorporation.setAddress(address);

		AddressWithoutCountry billingAddress = new AddressWithoutCountry();
		billingAddress.setAddress1(entity.billingAddress?.address1);
		billingAddress.setAddress2(entity.billingAddress?.address2);
		billingAddress.setCity(entity.billingAddress?.city);
		billingAddress.setState(entity.billingAddress?.state);
		billingAddress.setZip(entity.billingAddress?.zip);
		clientCorporation.setBillingAddress(billingAddress);

		return clientCorporation;
	}

	@Override
	public CorporateUserDto convert(CorporateUser entity) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public CorporationDepartmentDto convert(CorporationDepartment entity) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public CountryDto convert(Country entity) {
		CountryDto dto = new CountryDto();
		dto.setCode(entity.code);
		dto.setCountryID(entity.id);
		dto.setName(entity.name);
		return dto;
	}

	@Override
	public JobOrderDto convert(JobOrder entity) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public JobSubmissionDto convert(JobSubmission entity) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public NoteDto convert(Note entity) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public NoteEntityDto convert(NoteEntity entity) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public PlacementDto convert(Placement entity) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public PlacementChangeRequestDto convert(PlacementChangeRequest entity) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public PlacementCommissionDto convert(PlacementCommission entity) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public SendoutDto convert(Sendout entity) {
		SendoutDto dto = new SendoutDto();
		dto.setCandidateID(entity.candidate?.id);
		dto.setClientContactID(entity.clientContact?.id);
		dto.setClientCorporationID(entity.clientCorporation?.id);
		dto.setDateAdded(dateTimeToXmlGregCal(entity.dateAdded));
		dto.setEmail(entity.email);
		dto.setIsRead(entity.isRead);
		dto.setJobOrderID(entity.jobOrder?.id);
		dto.setMigrateGUID(entity.migrateGUID);
		dto.setSendoutID(entity.id);
		dto.setUserID(entity.user?.id);
		return dto;
	}

	@Override
	public SkillDto convert(Skill entity) {
		SkillDto dto = new SkillDto();
		dto.setEnabled(entity.enabled);
		dto.setName(entity.name);
		dto.setSkillID(entity.id);
		return dto;
	}

	@Override
	public SpecialtyDto convert(Specialty entity) {
		SpecialtyDto dto = new SpecialtyDto();
		dto.setDateAdded(dateTimeToXmlGregCal(entity.dateAdded));
		dto.setEnabled(entity.enabled);
		dto.setName(entity.name);
		dto.setParentCategoryID(entity.parentCategory?.id);
		dto.setSpecialtyID(entity.id);
		return dto;
	}

	@Override
	public StateDto convert(State entity) {
		StateDto dto = new StateDto();
		dto.setCode(entity.code);
		dto.setCountryID(entity.country?.id);
		dto.setName(entity.name);
		dto.setStateID(entity.id);
		return dto;
	}

	@Override
	public TaskDto convert(Task entity) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public TimeUnitDto convert(TimeUnit entity) {
		TimeUnitDto dto = new TimeUnitDto();
		dto.setName(entity.name);
		dto.setTimeMarker(entity.timeMarker);
		dto.setWeekDay(entity.weekDay);
		return dto;
	}

	private XMLGregorianCalendar dateTimeToXmlGregCal(DateTime date){
		return Util.dateTimeToXmlGregorianCal(date);
	}

	private Double bigDecimalToDouble(BigDecimal value){
		return Util.bigDecimalToDouble(value);
	}
}
