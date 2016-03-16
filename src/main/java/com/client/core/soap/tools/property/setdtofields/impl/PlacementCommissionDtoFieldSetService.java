package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.job.PlacementCommissionDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("placementCommissionSetService")
public class PlacementCommissionDtoFieldSetService extends DtoFieldSetService<PlacementCommissionDto> {

	public PlacementCommissionDtoFieldSetService() {
		super();
	}

	@Override
	public PlacementCommissionDto changeDto(PlacementCommissionDto placementCommission, Map<String, String> fieldValues, String dateFormat, Boolean isDotPrefixed) {

		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}

			if(field.equalsIgnoreCase(COMMENTS)) {

				placementCommission.setComments(value);

			} else if(field.equalsIgnoreCase(COMMISSIONID)) {

				placementCommission.setCommissionID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(COMMISSIONPERCENTAGE)) {

				placementCommission.setCommissionPercentage(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(DATEADDED)) {

				placementCommission.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(EXTERNALRECIPIENT)) {

				placementCommission.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(FLATPAYOUT)) {

				placementCommission.setFlatPayout(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(GROSSMARGINPERCENTAGE)) {

				placementCommission.setGrossMarginPercentage(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(HOURLYPAYOUT)) {

				placementCommission.setHourlyPayout(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(MIGRATEGUID)) {

				placementCommission.setMigrateGUID(value);

			} else if(field.equalsIgnoreCase(PLACEMENTID)) {

				placementCommission.setPlacementID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(ROLE)) {

				placementCommission.setRole(value);

			} else if(field.equalsIgnoreCase(STATUS)) {

				placementCommission.setStatus(value);

			} else if(field.equalsIgnoreCase(USERID)) {

				placementCommission.setUserID(Utility.forceParseInteger(value));

			}

		}

		return placementCommission;
	}

	private String COMMENTS="comments";
	private String COMMISSIONID="commissionID";
	private String COMMISSIONPERCENTAGE="commissionPercentage";
	private String DATEADDED="dateAdded";
	private String EXTERNALRECIPIENT="dateAdded";
	private String FLATPAYOUT="flatPayout";
	private String GROSSMARGINPERCENTAGE="grossMarginPercentage";
	private String HOURLYPAYOUT="hourlyPayout";
	private String MIGRATEGUID="migrateGUID";
	private String PLACEMENTID="placementID";
	private String ROLE="role";
	private String STATUS="status";
	private String USERID="userID";

}
