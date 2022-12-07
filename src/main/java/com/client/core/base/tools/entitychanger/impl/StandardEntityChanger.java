package com.client.core.base.tools.entitychanger.impl;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.client.core.base.util.Utility;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;

@Log4j2
@Service
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
                Class<?> fieldType = propertyDescriptor.getPropertyType();
                Object maybeValue = propertyDescriptor.getReadMethod().invoke(entityOrField);
                if (maybeValue == null) {
                    propertyDescriptor.getWriteMethod().invoke(entityOrField, fieldType.getDeclaredConstructor().newInstance());
                }
                return (T) propertyDescriptor.getReadMethod().invoke(entityOrField);
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException |
                     InstantiationException e) {
                throw new RuntimeException(e);
            }
        }, (entity1, entity2) -> entity1);
        try {
            PropertyDescriptor propertyDescriptor = BeanUtils.getPropertyDescriptor(target.getClass(), finalField);
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
                    if (DateTime.class.equals(fieldType)) {
                        propertyDescriptor.getWriteMethod().invoke(target, asType(value, DateTime.class));
                    } else if (BullhornEntity.class.isAssignableFrom(fieldType)) {
                        BullhornEntity bullhornEntity = (BullhornEntity) fieldType.getDeclaredConstructor().newInstance();
                        bullhornEntity.setId((Integer) value);
                        propertyDescriptor.getWriteMethod().invoke(target, bullhornEntity);
                    } else if (Integer.class.equals(fieldType)) {
                        propertyDescriptor.getWriteMethod().invoke(target, asType(value, Integer.class));
                    } else if (BigDecimal.class.equals(fieldType)) {
                        propertyDescriptor.getWriteMethod().invoke(target, asType(value, BigDecimal.class));
                    } else if (Boolean.class.equals(fieldType)) {
                        propertyDescriptor.getWriteMethod().invoke(target, asType(value, Boolean.class));
                    } else {
                        log.error("Error setting field " + finalField + " to value " + value, e);
                    }
                }
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException |
                 InstantiationException e) {
            log.error("Error setting field " + finalField + " to value " + value + ", no property " + finalField + " on " + target.getClass().getSimpleName(), e);
        }
        return entity;
    }

    private Object getValue(Object entity, String field) {
        return Arrays.stream(field.split("\\.")).reduce(entity, (entityOrField, nextField) -> {
            try {
                PropertyDescriptor propertyDescriptor = BeanUtils.getPropertyDescriptor(entityOrField.getClass(), nextField);
                return propertyDescriptor.getReadMethod().invoke(ObjectUtils.defaultIfNull(entityOrField, entityOrField.getClass().getDeclaredConstructor().newInstance()));
            } catch (InvocationTargetException | IllegalAccessException | InstantiationException |
                     NoSuchMethodException e) {
                log.error("Could not get Field " + nextField + ".", e);
                return null;
            }
        }, (entity1, entity2) -> entity1);
    }

    private String getterMethodName(String fieldName) {
        return "get" + StringUtils.capitalize(fieldName);
    }

    private <V> V asType(Object value, Class<V> type) {
        if (BigDecimal.class.equals(type)) {
            return (V) Utility.parseBigDecimal(value);
        } else if (Boolean.class.equals(type)) {
            return (V) Utility.parseBoolean((String) value);
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
