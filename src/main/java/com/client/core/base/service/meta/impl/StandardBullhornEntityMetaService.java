package com.client.core.base.service.meta.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.meta.Field;
import com.client.core.ApplicationSettings;
import com.client.core.base.service.meta.BullhornEntityMetaService;
import com.client.core.base.tools.cache.BullhornEntityMetaCache;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StandardBullhornEntityMetaService implements BullhornEntityMetaService {

    private final Map<Class<? extends BullhornEntity>, BullhornEntityMetaCache<?>> cacheMap = Maps.newLinkedHashMap();

    private final ApplicationSettings applicationSettings;
    private final BullhornData bullhornData;

    @Autowired
    public StandardBullhornEntityMetaService(ApplicationSettings applicationSettings, BullhornData bullhornData) {
        this.applicationSettings = applicationSettings;
        this.bullhornData = bullhornData;
    }

    @Override
    public <T extends BullhornEntity> List<Field> getFields(Class<T> type) {
        if (!cacheMap.containsKey(type)) {
            cacheMap.put(type, new BullhornEntityMetaCache<>(bullhornData, type, applicationSettings.getMetaCacheMinutes()));
        }

        return cacheMap.get(type).get().getFields();
    }

    @Override
    public <T extends BullhornEntity> Set<String> getFieldNames(Class<T> type) {
        return getFields(type).parallelStream().map(Field::getName).collect(Collectors.toSet());
    }

}
