package com.client.custom.service.formtrigger.placement;

import com.client.core.formtrigger.workflow.node.impl.PlacementFormTriggerValidator;
import com.client.core.formtrigger.workflow.traversing.PlacementFormTriggerTraverser;
import org.springframework.stereotype.Service;

@Service
public class ValidateSalary extends PlacementFormTriggerValidator {

	@Override
	public void validate(PlacementFormTriggerTraverser traverser) {
		//business logic
	}

}
