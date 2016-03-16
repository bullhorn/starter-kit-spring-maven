package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.job.PlacementDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class PlacementEntityIdHelper implements EntityIdHelper<PlacementDto, Integer> {

	@Override
	public Integer getEntityId(PlacementDto entity) {
		return entity.getPlacementID();
	}

	private PlacementEntityIdHelper() {
		super();
	}

	public static PlacementEntityIdHelper instanceOf() {
		return new PlacementEntityIdHelper();
	}

}
