package com.client.core.scheduledtasks.model.helper;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.client.core.base.model.helper.AbstractHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.tools.copy.KryoObjectCopyHelper;
import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public abstract class AbstractScheduledTaskHelper<E extends BullhornEntity> extends AbstractHelper<E> implements ScheduledTaskHelper<E> {

    private final CustomSubscriptionEvent event;

    private final Map<String, UpdateEntity> allEntitiesToSaveBackToBH;

    private final Class<E> type;
    private final BullhornRelatedEntity self;

    private E entity;

    public AbstractScheduledTaskHelper(CustomSubscriptionEvent event, Class<E> type, BullhornRelatedEntity self,
                                       Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(event.getUpdatingUserId(), relatedEntityFields);
        this.event = event;
        this.type = type;
        this.self = self;
        this.allEntitiesToSaveBackToBH = Maps.newHashMap();
    }

    @Override
    public E getEntity() {
        if (this.entity == null) {
            this.entity = findEntity(type, event.getEntityId(), self);
        }

        return entity;
    }

    protected void setEntity(E entity) {
        this.entity = entity;
    }

    @Override
    public CustomSubscriptionEvent getEvent() {
        return event;
    }

    @Override
    public boolean fieldWasUpdated(String... fieldsToCheck) {
        Set<String> updatedProperties = event.getUpdatedProperties();

        if (updatedProperties == null || updatedProperties.size() < 1) {
            return false;
        }

        if (fieldsToCheck == null || fieldsToCheck.length < 1) {
            return false;
        }

        for (String field : Arrays.asList(fieldsToCheck)) {
            if (updatedProperties.contains(field)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Map<String, ? extends UpdateEntity> getAllEntitiesToSave() {
        return allEntitiesToSaveBackToBH;
    }

    @Override
    public <T extends UpdateEntity> T getOneEntityToSave(T entity) {
        @SuppressWarnings("unchecked")
        T entityToSave = (T) allEntitiesToSaveBackToBH.get(entity.getClass().getSimpleName() + entity.getId());

        if (entityToSave == null) {
            entityToSave = KryoObjectCopyHelper.copy(entity);

            allEntitiesToSaveBackToBH.put(entity.getClass().getSimpleName() + entity.getId(), entityToSave);
        }

        return entityToSave;
    }

}
