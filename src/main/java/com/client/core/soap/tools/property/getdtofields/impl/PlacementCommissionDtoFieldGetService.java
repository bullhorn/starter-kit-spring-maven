package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.job.PlacementCommissionDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("placementCommissionGetService")
public class PlacementCommissionDtoFieldGetService extends DtoFieldGetService<PlacementCommissionDto> {

	public PlacementCommissionDtoFieldGetService() {
		super();
	}

	@Override
	public Object retrieveField(String field, PlacementCommissionDto placementCommission, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}

		if (field.equalsIgnoreCase(COMMENTS)) {
			value = placementCommission.getComments();
		}
		else if (field.equalsIgnoreCase(COMMISSIONID)) {
			value = placementCommission.getCommissionID();
		}
		else if (field.equalsIgnoreCase(COMMISSIONPERCENTAGE)) {
			value = placementCommission.getCommissionPercentage();
		}
		else if (field.equalsIgnoreCase(DATEADDED)) {
			value = placementCommission.getDateAdded();
		}
		else if (field.equalsIgnoreCase(EXTERNALRECIPIENT)) {
			value = placementCommission.getExternalRecipient();
		}
		else if (field.equalsIgnoreCase(FLATPAYOUT)) {
			value = placementCommission.getFlatPayout();
		}
		else if (field.equalsIgnoreCase(GROSSMARGINPERCENTAGE)) {
			value = placementCommission.getGrossMarginPercentage();
		}
		else if (field.equalsIgnoreCase(HOURLYPAYOUT)) {
			value = placementCommission.getHourlyPayout();
		}
		else if (field.equalsIgnoreCase(MIGRATEGUID)) {
			value = placementCommission.getMigrateGUID();
		}
		else if (field.equalsIgnoreCase(PLACEMENTID)) {
			value = placementCommission.getPlacementID();
		}
		else if (field.equalsIgnoreCase(ROLE)) {
			value = placementCommission.getRole();
		}
		else if (field.equalsIgnoreCase(STATUS)) {
			value = placementCommission.getStatus();
		}
		else if (field.equalsIgnoreCase(USERID)) {
			value = placementCommission.getUserID();
		}	
		else {
			throw new NoSuchMethodException();
		}

		return value;
	}

	private String COMMENTS="comments";
	private String COMMISSIONID="commissionID";
	private String COMMISSIONPERCENTAGE="commissionPercentage";
	private String DATEADDED="dateAdded";
	private String EXTERNALRECIPIENT="externalRecipient";
	private String FLATPAYOUT="flatPayout";
	private String GROSSMARGINPERCENTAGE="grossMarginPercentage";
	private String HOURLYPAYOUT="hourlyPayout";
	private String MIGRATEGUID="migrateGUID";
	private String PLACEMENTID="placementID";
	private String ROLE="role";
	private String STATUS="status";
	private String USERID="userID";

}
