package com.client.custom.service.formscript.joborder.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.client.custom.service.formscript.joborder.JobOrderFormScriptService;
import com.google.common.collect.Sets;

/**
 * Created by john.sullivan on 25/5/2017.
 */
@Service
public class StandardJobOrderFormScriptService implements JobOrderFormScriptService {

    private static final Set<String> ID = Sets.newHashSet("id");

    private final BullhornData bullhornData;

    @Autowired
    public StandardJobOrderFormScriptService(BullhornData bullhornData) {
        this.bullhornData = bullhornData;
    }

    @Override
    public Boolean jobHasApprovedPlacement(Integer jobOrderID) {
        String where = new StringBuilder("jobOrder.id = ").append(jobOrderID)
                .append(" AND status='Approved'").toString();

        QueryParams params = ParamFactory.queryParams();
        params.setCount(1);

        return !bullhornData.queryForList(Placement.class, where, ID, params).isEmpty();
    }
}
