package com.client.core.resttrigger.workflow.traversing;

import java.util.Map;
import java.util.Set;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.model.fields.RelatedTriggerEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.CandidateRestTriggerHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class CandidateRestTriggerTraverser extends AbstractTriggerTraverser<Candidate, CandidateRestTriggerHelper> {

	public CandidateRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit,
										 BullhornData bullhornData, Map<? extends RelatedTriggerEntity, Set<String>> triggerEntityFields) {
		super(new CandidateRestTriggerHelper(entityID, valuesChanged, updatingUserID, bullhornData, triggerEntityFields), edit);
	}

}
