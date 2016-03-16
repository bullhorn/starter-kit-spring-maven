package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.job.JobSubmissionDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class JobSubmissionEntityIdHelper implements EntityIdHelper<JobSubmissionDto, Integer> {

    @Override
    public Integer getEntityId(JobSubmissionDto entity) {
        return entity.getJobSubmissionID();
    }

    private JobSubmissionEntityIdHelper() {
        super();
    }

    public static JobSubmissionEntityIdHelper instanceOf() {
        return new JobSubmissionEntityIdHelper();
    }

}
