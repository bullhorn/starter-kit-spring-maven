package com.client.core.scheduledtasks.service;


import org.apache.log4j.Logger;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.AppContext;
import com.client.core.ApplicationSettings;
import com.client.core.soap.service.BullhornAPI;
import com.client.core.email.service.Emailer;

public class AbstractScheduledTaskService implements ScheduledTaskService  {

    private final Logger log = Logger.getLogger(getClass());

	private ApplicationSettings appSettings;
    private BullhornData bullhornData;
	private BullhornAPI bullhornapi;
	private Emailer emailer;

	public AbstractScheduledTaskService() {
		super();
	}

    protected Logger getLog() {
        return log;
    }

    protected ApplicationSettings getAppSettings() {
        if(this.appSettings == null) {
            this.appSettings = AppContext.getApplicationContext().getBean(ApplicationSettings.class);
        }

        return this.appSettings;
    }

    protected BullhornData getBullhornData() {
        if(this.bullhornData == null) {
            this.bullhornData = AppContext.getApplicationContext().getBean(BullhornData.class);
        }

        return bullhornData;
    }

    protected Emailer getEmailer() {
        if(this.emailer == null) {
            this.emailer = AppContext.getApplicationContext().getBean(Emailer.class);
        }

        return emailer;
    }

    protected BullhornAPI getBullhornApi() {
        if(this.bullhornapi == null) {
            this.bullhornapi = AppContext.getApplicationContext().getBean(BullhornAPI.class);
        }

        return bullhornapi;
    }
}
