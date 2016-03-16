package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.client.ClientCorporationDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class ClientCorporationEntityIdHelper implements EntityIdHelper<ClientCorporationDto, Integer> {

    @Override
    public Integer getEntityId(ClientCorporationDto entity) {
        return entity.getClientCorporationID();
    }

    private ClientCorporationEntityIdHelper() {
        super();
    }

    public static ClientCorporationEntityIdHelper instanceOf() {
        return new ClientCorporationEntityIdHelper();
    }

}
