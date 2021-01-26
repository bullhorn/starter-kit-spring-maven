package com.client.core.base.model.helper;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;

import java.util.Map;
import java.util.Set;

public abstract class AbstractTriggerHelper<E extends BullhornEntity> extends AbstractHelper<E> implements TriggerHelper<E> {

	private final Class<E> type;
	private final BullhornRelatedEntity self;

	private E newEntity;
	private E oldEntity;

	public AbstractTriggerHelper(Integer updatingUserID, Class<E> type, BullhornRelatedEntity self, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.type = type;
		this.self = self;
	}

	@Override
	public E getNewEntity() {
		if (newEntity == null) {
			this.newEntity = instantiateNewEntity();
		}

		return newEntity;
	}

	protected abstract E instantiateNewEntity();

	@Override
	public E getOldEntity() {
		if (oldEntity == null) {
			this.oldEntity = findEntity(type, getNewEntity().getId(), self);
		}

		return oldEntity;
	}

}
