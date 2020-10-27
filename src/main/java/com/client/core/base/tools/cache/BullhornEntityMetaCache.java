package com.client.core.base.tools.cache;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.meta.MetaData;
import com.bullhornsdk.data.model.enums.MetaParameter;
import com.client.core.base.tools.TimedCache;
import com.google.common.collect.Sets;

import java.util.Set;

public class BullhornEntityMetaCache<T extends BullhornEntity> extends TimedCache<MetaData<T>> {

    private static final Set<String> ALL_FIELDS = Sets.newHashSet("*");

    private final BullhornData bullhornData;
    private final Class<T> type;

    public BullhornEntityMetaCache(BullhornData bullhornData, Class<T> type, Integer minutesBetweenRetrievals) {
        super(minutesBetweenRetrievals);
        this.bullhornData = bullhornData;
        this.type = type;
    }

    @Override
    protected MetaData<T> retrieve() {
        return bullhornData.getMetaData(type, MetaParameter.FULL, ALL_FIELDS);
    }

}
