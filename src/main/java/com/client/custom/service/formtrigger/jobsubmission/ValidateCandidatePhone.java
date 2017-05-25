package com.client.custom.service.formtrigger.jobsubmission;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.formtrigger.workflow.node.impl.JobSubmissionFormTriggerValidator;
import com.client.core.formtrigger.workflow.traversing.JobSubmissionFormTriggerTraverser;

/**
 * Created by john.sullivan on 25/5/2017.
 */
@Service
public class ValidateCandidatePhone extends JobSubmissionFormTriggerValidator {

    private static final Pattern VALID_PHONE = Pattern.compile("\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}");

    @Override
    public void validate(JobSubmissionFormTriggerTraverser traverser) {
        Candidate candidate = traverser.getTriggerHelper().getCandidate();

        if(!VALID_PHONE.matcher(candidate.getPhone()).matches()) {
            traverser.addFormResponse("error:candidate.invalid.phone", getMessageUsingKey("candidate.invalid.phone"));
        }
    }
}
