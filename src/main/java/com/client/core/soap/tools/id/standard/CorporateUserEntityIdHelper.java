package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.user.CorporateUserDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class CorporateUserEntityIdHelper implements EntityIdHelper<CorporateUserDto, Integer> {

    @Override
    public Integer getEntityId(CorporateUserDto entity) {
        return entity.getUserID();
    }

    private CorporateUserEntityIdHelper() {
        super();
    }

    public static CorporateUserEntityIdHelper instanceOf() {
        return new CorporateUserEntityIdHelper();
    }

}
