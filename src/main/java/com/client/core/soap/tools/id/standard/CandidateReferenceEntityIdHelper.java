package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.candidate.CandidateReferenceDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class CandidateReferenceEntityIdHelper implements EntityIdHelper<CandidateReferenceDto, Integer> {

	@Override
	public Integer getEntityId(CandidateReferenceDto entity) {
		return entity.getCandidateReferenceID();
	}

	private CandidateReferenceEntityIdHelper() {
		super();
	}

	public static CandidateReferenceEntityIdHelper instanceOf() {
		return new CandidateReferenceEntityIdHelper();
	}

}
