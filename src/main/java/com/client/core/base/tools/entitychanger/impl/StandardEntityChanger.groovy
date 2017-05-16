package com.client.core.base.tools.entitychanger

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity
import com.client.core.base.util.Utility
import org.apache.log4j.Logger
import org.joda.time.DateTime
import org.springframework.stereotype.Service
/**
 * Created by hiqbal on 12/15/2015.
 */
@Service
class StandardEntityChanger implements EntityChanger {

    private final Logger log = Logger.getLogger(getClass());

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
        def target = entity;

        List<String> fields = field.tokenize('.');

        String finalField = fields.get(fields.size()-1);

        fields.subList(0, fields.size() - 1).inject(entity, { entityOrField, nextField ->
            if(entityOrField."$nextField" == null) {
                MetaProperty property = target.getMetaClass().getMetaProperty(nextField);

                entityOrField."$nextField" = property.type.newInstance();
            }

            target = entityOrField."$nextField";
        });

        if(value instanceof Map) {
            if(target."$finalField" == null) {
                MetaProperty property = target.getMetaClass().getMetaProperty(finalField);

                target."$finalField" = property.type.newInstance();
            }

            def nestedTarget = target."$finalField";

            value.forEach({ key, nextValue ->
                try {
                    this.setField(nestedTarget, key, nextValue);
                } catch(MissingPropertyException e) {
                    log.error("Error setting nested field "+e.getProperty(), e);
                }
            });
        } else {
            try {
                target."$finalField" = value
            } catch(RuntimeException e) {
                MetaProperty property = target.getMetaClass().getMetaProperty(finalField);

                if(property) {
                    if (DateTime.class.equals(property.type)) {
                        target."$finalField" = asType(value, DateTime.class);
                    } else if (BullhornEntity.class.isAssignableFrom(property.type)) {
                        target."$finalField" = property.type.newInstance();
                        target."$finalField".id = value;
                    }
                }
            }
        }

        return entity;
    }

    private Object getValue(Object entity, String field) {
        return field.tokenize('.').inject(entity, { entityOrField, nextField ->
            return entityOrField?."$nextField";
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
        } else if(DateTime.class.equals(type)) {
            if(type instanceof DateTime) {
                return (V) value;
            }

            return new DateTime(value);
        } else {
            throw new IllegalArgumentException("Cannot convert value ${value} to type ${type.getSimpleName()}")
        }
    }

}