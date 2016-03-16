package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.client.ClientContactDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class ClientContactEntityIdHelper implements EntityIdHelper<ClientContactDto, Integer> {

    @Override
    public Integer getEntityId(ClientContactDto entity) {
        return entity.getUserID();
    }

    private ClientContactEntityIdHelper() {
        super();
    }

    public static ClientContactEntityIdHelper instanceOf() {
        return new ClientContactEntityIdHelper();
    }

}
