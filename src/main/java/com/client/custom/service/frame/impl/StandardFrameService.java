package com.client.custom.service.frame.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bullhornsdk.data.exception.RestApiException;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.google.common.collect.Maps;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
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
    private final Logger logger = Logger.getLogger(StandardFrameService.class);

    @Autowired
    public StandardFrameService(BullhornData bullhornData) {
        this.bullhornData = bullhornData;
    }

    @Override
    public FrameData getFrameData(Integer corporateUserID, String entityType, Set<Integer> entityIDs) {

        FrameData frameData = new FrameData();

        try {
            CorporateUser corporateUser = bullhornData.findEntity(CorporateUser.class, corporateUserID, CORPORATE_USER_FIELDS);
            frameData.setCorporateUserID(corporateUserID);
            frameData.setCorporateUserName(corporateUser.getName());
            frameData.setCorporateUserPrimaryDepartment(corporateUser.getPrimaryDepartment().getName());

            String where = "id IN (" + StringUtils.join(entityIDs, ",") + ")";

            QueryParams queryParams = ParamFactory.queryParams();
            queryParams.setCount(500);

            List<JobOrder> jobs = bullhornData.queryForList(JobOrder.class, where, JOB_FIELDS, queryParams);

            Map<Integer, String> nameIdMap = Maps.newHashMap();

            jobs.stream().forEach(a -> {
                nameIdMap.put(a.getId(), a.getTitle());
            });

            frameData.setEntityType("JobOrder");
            frameData.setNameIdMap(nameIdMap);
        } catch(RestApiException e) {
            logger.error(e.getMessage(), e);
        }

        return frameData;
    }

}
