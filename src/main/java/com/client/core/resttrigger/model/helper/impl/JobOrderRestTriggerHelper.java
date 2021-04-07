package com.client.core.resttrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.helper.impl.JobOrderTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.JobOrderRelatedEntity;
import com.client.core.base.util.TriggerUtil;
import com.client.core.resttrigger.model.helper.RestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class JobOrderRestTriggerHelper extends JobOrderTriggerHelper implements RestTriggerHelper<JobOrder> {

	private final Integer entityID;
	private final Map<String, Object> valuesChanged;

	public JobOrderRestTriggerHelper(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID,
									 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.entityID = entityID;
		this.valuesChanged = valuesChanged;
	}

	@Override
	public Set<String> getPopulatedFields() {
		return valuesChanged.keySet();
	}

	@Override
	public Integer getEntityID() {
		return entityID;
	}

	@Override
	public Map<String, Object> getValuesChanged() {
		return valuesChanged;
	}

	@Override
	protected JobOrder instantiateNewEntity() {
		return TriggerUtil.populateEntity(entityID, JobOrder.class, valuesChanged, JobOrder::new, getFields(JobOrderRelatedEntity.JOB_ORDER));
	}
}
