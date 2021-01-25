package com.client.core.resttrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.CandidateRestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class CandidateRestTriggerTraverser extends AbstractTriggerTraverser<Candidate, CandidateRestTriggerHelper> {

	public CandidateRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit,
										 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new CandidateRestTriggerHelper(entityID, valuesChanged, updatingUserID, relatedEntityFields), edit);
	}

}
