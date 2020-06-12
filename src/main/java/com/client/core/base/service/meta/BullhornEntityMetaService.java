package com.client.core.base.service.meta;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.meta.Field;

import java.util.List;
import java.util.Set;

public interface BullhornEntityMetaService {

    <T extends BullhornEntity> List<Field> getFields(Class<T> type);

    <T extends BullhornEntity> Set<String> getFieldNames(Class<T> type);

}
