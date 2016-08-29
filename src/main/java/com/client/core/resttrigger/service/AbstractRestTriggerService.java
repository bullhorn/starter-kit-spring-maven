package com.client.core.resttrigger.service;

import java.util.stream.Stream;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.helper.AbstractTriggerService;
import com.client.core.resttrigger.model.helper.RestTriggerHelper;

public abstract class AbstractRestTriggerService extends AbstractTriggerService {

	public AbstractRestTriggerService() {
		super();
	}

	protected <E extends BullhornEntity, H extends RestTriggerHelper<E>> Boolean fieldWasUpdated(H helper, String... fields) {
		return Stream.of(fields).anyMatch( field -> {
			return helper.getPopulatedFields().contains(field);
		});
	}

}
