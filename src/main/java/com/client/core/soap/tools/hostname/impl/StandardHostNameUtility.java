package com.client.core.soap.tools.hostname.impl;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.core.soap.service.BullhornAPI;
import com.client.core.soap.tools.hostname.HostNameUtility;

@Service
public class StandardHostNameUtility implements HostNameUtility {

    private static final Integer REFRESH_HOURS = 24;

    private final BullhornAPI bullhornAPI;

    private DateTime lastRetrievalDate;
    private String hostName;

    @Autowired
    public StandardHostNameUtility(BullhornAPI bullhornAPI) {
        this.bullhornAPI = bullhornAPI;
    }

    @Override
    public String getHostName() {
        if(this.lastRetrievalDate == null || this.lastRetrievalDate.compareTo(DateTime.now().minusHours(REFRESH_HOURS)) < 0){
            this.lastRetrievalDate = DateTime.now();
            this.hostName = bullhornAPI.getHostName();
        }

        return this.hostName;
    }
}
