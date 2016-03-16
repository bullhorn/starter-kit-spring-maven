package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.user.UserTypeDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class UserTypeEntityIdHelper implements EntityIdHelper<UserTypeDto, Integer> {

    @Override
    public Integer getEntityId(UserTypeDto entity) {
        return entity.getUserTypeID();
    }

    private UserTypeEntityIdHelper() {
        super();
    }

    public static UserTypeEntityIdHelper instanceOf() {
        return new UserTypeEntityIdHelper();
    }

}
