package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.candidate.SendoutDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class SendoutEntityIdHelper implements EntityIdHelper<SendoutDto, Integer> {

    @Override
    public Integer getEntityId(SendoutDto entity) {
        return entity.getSendoutID();
    }

    private SendoutEntityIdHelper() {
        super();
    }

    public static SendoutEntityIdHelper instanceOf() {
        return new SendoutEntityIdHelper();
    }

}
