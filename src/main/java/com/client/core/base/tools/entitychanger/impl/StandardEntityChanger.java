package com.client.core.base.tools.entitychanger.impl;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.client.core.base.util.Utility;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.ObjectUtils;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;

@Log4j2
@Service
@SuppressWarnings("unchecked")
public class StandardEntityChanger implements EntityChanger {

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
        String[] fields = field.split("\\.");
        String finalField = fields[fields.length - 1];
        Object target = Arrays.stream(fields, 0, fields.length - 1).reduce(entity, (entityOrField, nextField) -> {
            try {
                PropertyDescriptor propertyDescriptor = BeanUtils.getPropertyDescriptor(entityOrField.getClass(), nextField);
                if (propertyDescriptor == null) {
                    throw new RuntimeException("Could not find property descriptor for " + nextField);
                }
                Class<?> fieldType = propertyDescriptor.getPropertyType();
                if (propertyDescriptor.getReadMethod() == null) {
                    throw new RuntimeException("Could not keep traversing - property has no read method: " + nextField);
                }
                Object maybeValue = propertyDescriptor.getReadMethod().invoke(entityOrField);
                if (maybeValue == null) {
                    propertyDescriptor.getWriteMethod().invoke(entityOrField, fieldType.getDeclaredConstructor().newInstance());
                }
                return (T) propertyDescriptor.getReadMethod().invoke(entityOrField);
            } catch (IllegalAccessException |
                     InvocationTargetException |
                     NoSuchMethodException |
                     InstantiationException e) {
                throw new RuntimeException("Error setting property " + nextField, e);
            }
        }, (entity1, entity2) -> entity1);
        try {
            PropertyDescriptor propertyDescriptor = BeanUtils.getPropertyDescriptor(target.getClass(), finalField);
            if (propertyDescriptor == null) {
                if (entity instanceof AbstractEntity) {
                    ((AbstractEntity) entity).getAdditionalProperties().put(finalField, value);
                    return entity;
                }

                throw new RuntimeException("Could not find property descriptor for " + finalField);
            }
            Class<?> fieldType = propertyDescriptor.getPropertyType();
            if (value instanceof Map) {
                if (propertyDescriptor.getReadMethod().invoke(target) == null) {
                    propertyDescriptor.getWriteMethod().invoke(target, fieldType.getDeclaredConstructor().newInstance());
                }

                T nestedTarget = (T) propertyDescriptor.getReadMethod().invoke(target);
                ((Map<String, ?>) value).forEach((key, mapVal) -> {
                    try {
                        setField(nestedTarget, key, mapVal);
                    } catch (RuntimeException e) {
                        log.error("Error setting nested field " + key, e);
                    }
                });
            } else {
                try {
                    propertyDescriptor.getWriteMethod().invoke(target, value);
                } catch (IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
                    try {
                        if (BullhornEntity.class.isAssignableFrom(fieldType)) {
                            BullhornEntity bullhornEntity = (BullhornEntity) fieldType.getDeclaredConstructor().newInstance();
                            bullhornEntity.setId((Integer) value);
                            propertyDescriptor.getWriteMethod().invoke(target, bullhornEntity);
                        } else {
                            propertyDescriptor.getWriteMethod().invoke(target, asType(value, fieldType));
                        }
                    } catch (InstantiationException | IllegalAccessException | IllegalArgumentException |
                             InvocationTargetException | NoSuchMethodException | SecurityException ex) {
                        log.warn("Failed to cast value to type {} for field {}", fieldType.getName(), propertyDescriptor.getName(), ex);
                        if (entity instanceof AbstractEntity) {
                            ((AbstractEntity) entity).getAdditionalProperties().put(finalField, value);
                            log.warn("Saved {} to entity's additionalProperties", finalField);
                        } else {
                            log.error("Entity does not support additionalProperties so couldn't save {}", finalField);
                        }
                    }
                }
            }
        } catch (NoSuchMethodException |
                 IllegalAccessException |
                 InvocationTargetException |
                 ClassCastException |
                 InstantiationException e) {
            log.error("Error setting field " + finalField + " to value " + value + ", no property " + finalField + " on " + target.getClass().getSimpleName(), e);
        }
        return entity;
    }

    private Object getValue(Object entity, String field) {
        return Arrays.stream(field.split("\\.")).reduce(entity, (entityOrField, nextField) -> {
            try {
                PropertyDescriptor propertyDescriptor = BeanUtils.getPropertyDescriptor(entityOrField.getClass(), nextField);
                if (propertyDescriptor == null || propertyDescriptor.getReadMethod() == null) {
                    String message = propertyDescriptor == null
                            ? "Could not find a property descriptor for " + nextField
                            : "Could not find read method for property descriptor for " + nextField;
                    log.error(message);
                    return null;
                }
                return propertyDescriptor.getReadMethod().invoke(ObjectUtils.defaultIfNull(entityOrField, entityOrField.getClass().getDeclaredConstructor().newInstance()));
            } catch (InvocationTargetException | IllegalAccessException | InstantiationException |
                     NoSuchMethodException e) {
                log.error("Could not get Field " + nextField + ".", e);
                return null;
            }
        }, (entity1, entity2) -> entity1);
    }

    private <V> V asType(Object value, Class<V> type) {
        if (BigDecimal.class.equals(type)) {
            return (V) Utility.parseBigDecimal(value);
        } else if (Boolean.class.equals(type)) {
            return (V) Utility.parseBoolean(value.toString());
        } else if (String.class.equals(type)) {
            return (V) Utility.parseString(value);
        } else if (Integer.class.equals(type)) {
            return (V) Utility.parseInteger(value);
        } else if (BullhornEntity.class.isAssignableFrom(type)) {
            return (V) value;
        } else if (DateTime.class.equals(type)) {
            if (value instanceof DateTime) {
                return (V) value;
            }

            return (V) new DateTime(value);
        } else if (Address.class.equals(type)) {
            return (V) value;
        } else {
            throw new IllegalArgumentException("Cannot convert value " + value + " to type " + type.getSimpleName());
        }
    }

}
