package com.client.core.base.model.helper;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import com.client.core.AppContext;
import com.client.core.ApplicationSettings;

public abstract class AbstractTriggerService {

	private final ApplicationSettings appSettings;
	private final MessageSource validationMessages;
	private final Logger log;

	public AbstractTriggerService() {
		super();
		this.appSettings = AppContext.getApplicationContext().getBean(ApplicationSettings.class);
		this.validationMessages = AppContext.getApplicationContext().getBean("messageSource", MessageSource.class);
		this.log = Logger.getLogger(getClass());
	}
	
	protected String getMessageUsingKey(String key) {
		return getMessageUsingKey(key, null);
	}
	
    protected String getMessageUsingKey(String key, Object... args) {
        try {
            return validationMessages.getMessage(key, args, Locale.US);
        } catch (NoSuchMessageException e) {
            log.error("No message with key: " + key + " exists.", e);
        }

        return "";
    }

	public ApplicationSettings getAppSettings() {
		return appSettings;
	}

	public MessageSource getValidationMessages() {
		return validationMessages;
	}

	public Logger getLog() {
		return log;
	}
}
