package com.client.core.resttrigger.model.form;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

public abstract class RestFormEntity<T extends BullhornEntity> {

    public RestFormEntity() {
        super();
    }

    public abstract T create();

}
