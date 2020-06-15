package com.client.core.base.tools.meta;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.google.common.collect.Sets;

import java.util.Set;
import java.util.stream.Stream;

public enum BullhornEntityMetaExcludedFields {
    CANDIDATE(Candidate.class, Sets.newHashSet())
    ;

    private final Class<? extends BullhornEntity> type;
    private final Set<String> excludedFields;

    BullhornEntityMetaExcludedFields(Class<? extends BullhornEntity> type, Set<String> excludedFields) {
        this.type = type;
        this.excludedFields = excludedFields;
    }

    public static Boolean isExcludedField(Class<? extends BullhornEntity> type, String excludedField) {
        return Stream.of(BullhornEntityMetaExcludedFields.values()).parallel().filter(bullhornEntityMetaExcludedFields -> {
            return bullhornEntityMetaExcludedFields.type.equals(type);
        }).findAny().map(bullhornEntityMetaExcludedFields -> {
            return bullhornEntityMetaExcludedFields.excludedFields;
        }).map(excludedFields -> {
            return excludedFields.contains(excludedField);
        }).orElse(false);
    }

    public static Boolean isNotExcludedField(Class<? extends BullhornEntity> type, String excludedField) {
        return !isExcludedField(type, excludedField);
    }

}
