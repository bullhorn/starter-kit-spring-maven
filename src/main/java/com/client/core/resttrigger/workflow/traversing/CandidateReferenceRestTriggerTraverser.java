package com.client.core.resttrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.CandidateReferenceRestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class CandidateReferenceRestTriggerTraverser extends AbstractTriggerTraverser<CandidateReference, CandidateReferenceRestTriggerHelper> {

	public CandidateReferenceRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit,
                                                  Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new CandidateReferenceRestTriggerHelper(entityID, valuesChanged, updatingUserID, relatedEntityFields), edit);
	}

}
