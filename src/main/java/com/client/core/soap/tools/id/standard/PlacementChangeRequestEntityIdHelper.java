package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.job.PlacementChangeRequestDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class PlacementChangeRequestEntityIdHelper implements EntityIdHelper<PlacementChangeRequestDto, Integer> {

    @Override
    public Integer getEntityId(PlacementChangeRequestDto entity) {
        return entity.getPlacementChangeRequestID();
    }

    private PlacementChangeRequestEntityIdHelper() {
        super();
    }

    public static PlacementChangeRequestEntityIdHelper instanceOf() {
        return new PlacementChangeRequestEntityIdHelper();
    }

}
