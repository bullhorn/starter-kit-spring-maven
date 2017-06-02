package com.client.custom.service.frame.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullhornsdk.data.api.BullhornData;
import com.client.custom.model.frame.FrameData;
import com.client.custom.service.frame.FrameService;
import com.google.common.collect.Sets;

/**
 * Created by john.sullivan on 25/5/2017.
 */
@Service
public class StandardFrameService implements FrameService {

    private static final Set<String> CORPORATE_USER_FIELDS = Sets.newHashSet("name", "id", "primaryDepartment(id,name)");
    private static final Set<String> PERSON_FIELDS = Sets.newHashSet("name", "id");
    private static final Set<String> JOB_FIELDS = Sets.newHashSet("title", "id");

    private final BullhornData bullhornData;

    @Autowired
    public StandardFrameService(BullhornData bullhornData) {
        this.bullhornData = bullhornData;
    }

    @Override
    public FrameData getFrameData(Integer corporateUserID, String entityType, Set<Integer> entityIDs) {
        return null;
    }

}
