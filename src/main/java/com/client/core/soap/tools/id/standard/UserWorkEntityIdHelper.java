package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.userwork.UserWorkDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class UserWorkEntityIdHelper implements EntityIdHelper<UserWorkDto, Integer> {

    @Override
    public Integer getEntityId(UserWorkDto entity) {
        return entity.getUserWorkID();
    }

    private UserWorkEntityIdHelper() {
        super();
    }

    public static UserWorkEntityIdHelper instanceOf() {
        return new UserWorkEntityIdHelper();
    }

}
