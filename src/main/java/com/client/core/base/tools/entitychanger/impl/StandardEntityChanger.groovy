package com.client.core.base.tools.entitychanger.impl

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity
import com.client.core.base.tools.entitychanger.EntityChanger
import com.client.core.base.util.Utility
import org.springframework.stereotype.Service

/**
 * Created by hiqbal on 12/15/2015.
 */
@Service
class StandardEntityChanger implements EntityChanger {

    public StandardEntityChanger() {
    }

    @Override
    public <T, V> V retrieveField(T entity, String field, Class<V> type) {
        Object value = retrieveField(entity, field);

        return asType(value, type);
    }

    @Override
    public <T> Object retrieveField(T entity, String field) {
        return getValue(entity, field);
    }

    @Override
    public <T> T setField(T entity, String field, Object value) {
        Object currentValue = getValue(entity, field);

        def target = entity;

        List<String> fields = field.tokenize('.');

        String finalField = fields.get(fields.size()-1);

        fields.subList(0, fields.size() - 1).inject(entity, { entityOrField, nextField ->
            target = entityOrField."$nextField";
        });

        target."$finalField" = value;

        return entity;
    }

    private Object getValue(Object entity, String field) {
        return field.tokenize('.').inject(entity, { entityOrField, nextField ->
            return entityOrField."$nextField";
        });
    }

    private <V> V asType(Object value, Class<V> type) {
        if(BigDecimal.class.equals(type)) {
            return (V) Utility.parseBigDecimal(value);
        } else if(Boolean.class.equals(type)) {
            return (V) Utility.parseBoolean(value);
        } else if(String.class.equals(type)) {
            return (V) Utility.parseString(value);
        } else if(Integer.class.equals(type)) {
            return (V) Utility.parseInteger(value);
        } else if(BullhornEntity.class.isAssignableFrom(type)) {
            return (V) value;
        } else {
            throw new IllegalArgumentException("Cannot convert value ${value} to type ${type.getSimpleName()}")
        }
    }

}
