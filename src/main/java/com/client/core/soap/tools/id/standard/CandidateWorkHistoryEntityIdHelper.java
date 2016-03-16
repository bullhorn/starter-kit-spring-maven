package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.candidate.CandidateWorkHistoryDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class CandidateWorkHistoryEntityIdHelper implements EntityIdHelper<CandidateWorkHistoryDto, Integer> {

    @Override
    public Integer getEntityId(CandidateWorkHistoryDto entity) {
        return entity.getCandidateWorkHistoryID();
    }

    private CandidateWorkHistoryEntityIdHelper() {
        super();
    }

    public static CandidateWorkHistoryEntityIdHelper instanceOf() {
        return new CandidateWorkHistoryEntityIdHelper();
    }

}
