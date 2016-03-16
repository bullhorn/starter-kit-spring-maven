package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.job.JobOrderDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class JobOrderEntityIdHelper implements EntityIdHelper<JobOrderDto, Integer> {

	@Override
	public Integer getEntityId(JobOrderDto entity) {
		return entity.getJobOrderID();
	}

	private JobOrderEntityIdHelper() {
		super();
	}

	public static JobOrderEntityIdHelper instanceOf() {
		return new JobOrderEntityIdHelper();
	}

}
