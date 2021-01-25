package com.client.core.soap.workers;

import com.bullhorn.entity.AbstractDto;
import com.client.core.soap.service.BullhornAPI;

import java.util.concurrent.Callable;

public class EntityFindWorker<T extends AbstractDto> implements Callable<T> {

	private final Object entityID;
	private final String entityType;
	private final BullhornAPI bullhornApi;

	public EntityFindWorker(Object entityID, String entityType, BullhornAPI bullhornApi) {
		super();
		this.entityID = entityID;
		this.entityType = entityType;
		this.bullhornApi = bullhornApi;
	}

	@Override
	public T call() throws Exception {
		return bullhornApi.findEntity(entityType, entityID);
	}

}
