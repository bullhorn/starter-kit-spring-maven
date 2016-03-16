package com.client.core.formtrigger.service;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

public class AbstractFormTriggerService {

	protected final MessageSource validationMessages;

	public AbstractFormTriggerService(MessageSource validationMessages) {
		super();
		this.validationMessages = validationMessages;
	}

	protected String getMessageUsingKey(String key) throws NoSuchMessageException {
        return getMessageUsingKey(key, new Object[] {});
	}
	
    protected String getMessageUsingKey(String key, Object[] args) throws NoSuchMessageException {
        return validationMessages.getMessage(key, args, Locale.US);
    }

}
