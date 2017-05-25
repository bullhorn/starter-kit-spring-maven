package com.client.custom.service.resttrigger.candidate;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.client.core.resttrigger.workflow.node.impl.CandidateRestTriggerValidator;
import com.client.core.resttrigger.workflow.traversing.CandidateRestTriggerTraverser;

/**
 * Created by john.sullivan on 25/5/2017.
 */
@Service
public class ValidateAndFormatCandidatePhone extends CandidateRestTriggerValidator {

    private static final Pattern NON_NUMERIC = Pattern.compile("[^\\d.]");

    @Override
    public void validate(CandidateRestTriggerTraverser traverser) {
        String phone = traverser.getTriggerHelper().getNewEntity().getPhone();

        String onlyNumbers = NON_NUMERIC.matcher(phone).replaceAll("");

        if(onlyNumbers.length() == 10) {
            String formatted = new StringBuilder("(")
                    .append(onlyNumbers.substring(0, 3))
                    .append(") ")
                    .append(onlyNumbers.substring(3, 6))
                    .append("-")
                    .append(onlyNumbers.substring(6)).toString();

            traverser.addFormResponse("returnvalue:phone", formatted);
            traverser.addFormResponse("returnvalue:candidate_phone", formatted);
        } else {
            traverser.addFormResponse("error:candidate.invalid.phone.digits", getMessageUsingKey("candidate.invalid.phone.digits"));
        }
    }

}
