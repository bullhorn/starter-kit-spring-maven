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
public class ValidateCandidateEmail extends JobSubmissionFormTriggerValidator {

    private static final Pattern VALID_EMAIL = Pattern.compile(".+?@.+?\\..+?");

    @Override
    public void validate(JobSubmissionFormTriggerTraverser traverser) {
        Candidate candidate = traverser.getTriggerHelper().getCandidate();

        if(!VALID_EMAIL.matcher(candidate.getEmail()).matches()) {
            traverser.addFormResponse("error:candidate.invalid.email", getMessageUsingKey("candidate.invalid.email"));
        }
    }
}
