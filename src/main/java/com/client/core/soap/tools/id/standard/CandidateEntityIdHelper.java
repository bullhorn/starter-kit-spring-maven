package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.candidate.CandidateDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class CandidateEntityIdHelper implements EntityIdHelper<CandidateDto, Integer> {

	@Override
	public Integer getEntityId(CandidateDto entity) {
		return entity.getUserID();
	}

	private CandidateEntityIdHelper() {
		super();
	}

	public static CandidateEntityIdHelper instanceOf() {
		return new CandidateEntityIdHelper();
	}

}
