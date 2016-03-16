package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.candidate.CandidateEducationDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class CandidateEducationEntityIdHelper implements EntityIdHelper<CandidateEducationDto, Integer> {

    @Override
    public Integer getEntityId(CandidateEducationDto entity) {
        return entity.getCandidateEducationID();
    }

    private CandidateEducationEntityIdHelper() {
        super();
    }

    public static CandidateEducationEntityIdHelper instanceOf() {
        return new CandidateEducationEntityIdHelper();
    }

}
