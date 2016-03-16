package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.job.PlacementCommissionDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class PlacementCommissionEntityIdHelper implements EntityIdHelper<PlacementCommissionDto, Integer> {

    @Override
    public Integer getEntityId(PlacementCommissionDto entity) {
        return entity.getCommissionID();
    }

    private PlacementCommissionEntityIdHelper() {
        super();
    }

    public static PlacementCommissionEntityIdHelper instanceOf() {
        return new PlacementCommissionEntityIdHelper();
    }

}
