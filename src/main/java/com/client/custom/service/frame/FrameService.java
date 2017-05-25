package com.client.custom.service.frame;

import java.util.Set;

import com.client.custom.model.frame.FrameData;

/**
 * Created by john.sullivan on 25/5/2017.
 */
public interface FrameService {

    FrameData getFrameData(Integer corporateUserID, String entityType, Set<Integer> entityIDs);

}
