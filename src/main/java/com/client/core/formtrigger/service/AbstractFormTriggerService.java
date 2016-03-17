package com.client.core.formtrigger.service;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import com.client.core.AppContext;

public class AbstractFormTriggerService {

	private final MessageSource validationMessages;
    private final Logger log;

    public AbstractFormTriggerService(MessageSource validationMessages) {
        this.validationMessages = validationMessages;
        this.log = Logger.getLogger(getClass());
    }

    public AbstractFormTriggerService() {
        this.validationMessages = AppContext.getApplicationContext().getBean("messageSource", MessageSource.class);
        this.log = Logger.getLogger(getClass());
    }

    protected String getMessageUsingKey(String key) throws NoSuchMessageException {
        return getMessageUsingKey(key, new Object[] {});
	}
	
    protected String getMessageUsingKey(String key, Object[] args) throws NoSuchMessageException {
        return validationMessages.getMessage(key, args, Locale.US);
    }

    protected Logger getLog() {
        return log;
    }

    protected MessageSource getValidationMessages() {
        return validationMessages;
    }

}
