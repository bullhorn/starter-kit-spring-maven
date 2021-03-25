package com.client.core.resttrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.CandidateWorkHistoryRestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class CandidateWorkHistoryRestTriggerTraverser extends AbstractTriggerTraverser<CandidateWorkHistory, CandidateWorkHistoryRestTriggerHelper> {

	public CandidateWorkHistoryRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit,
                                                    Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new CandidateWorkHistoryRestTriggerHelper(entityID, valuesChanged, updatingUserID, relatedEntityFields), edit);
	}

}
