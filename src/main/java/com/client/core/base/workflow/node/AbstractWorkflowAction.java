package com.client.core.base.workflow.node;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.AppContext;
import com.client.core.ApplicationSettings;
import com.client.core.base.workflow.traversing.Traverser;
import com.client.core.email.service.EmailTemplateService;
import com.client.core.email.service.Emailer;
import com.client.core.soap.service.BullhornAPI;

/**
 * Created by john.sullivan on 12/5/2017.
 */
public abstract class AbstractWorkflowAction<E extends BullhornEntity, T extends Traverser> implements WorkflowAction<E, T> {

    private final Logger log = Logger.getLogger(getClass());

    private EmailTemplateService emailTemplateService;
    private ApplicationSettings appSettings;
    private MessageSource messageSource;
    private BullhornAPI bullhornApi;
    private Emailer emailer;

    protected String getMessageUsingKey(String key) throws NoSuchMessageException {
        return getMessageUsingKey(key, new Object[] {});
    }

    protected String getMessageUsingKey(String key, Object[] args) throws NoSuchMessageException {
        return getMessageSource().getMessage(key, args, Locale.US);
    }

    protected MessageSource getMessageSource() {
        if(this.messageSource == null) {
            this.messageSource = AppContext.getApplicationContext().getBean("messageSource", MessageSource.class);
        }

        return messageSource;
    }

    protected EmailTemplateService getEmailTemplateService() {
        if(this.emailTemplateService == null) {
            this.emailTemplateService = AppContext.getApplicationContext().getBean(EmailTemplateService.class);
        }

        return this.emailTemplateService;
    }

    protected ApplicationSettings getAppSettings() {
        if(this.appSettings == null) {
            this.appSettings = AppContext.getApplicationContext().getBean(ApplicationSettings.class);
        }

        return this.appSettings;
    }

    protected Emailer getEmailer() {
        if(this.emailer == null) {
            this.emailer = AppContext.getApplicationContext().getBean(Emailer.class);
        }

        return emailer;
    }

    protected BullhornAPI getBullhornApi() {
        if(this.bullhornApi == null) {
            this.bullhornApi = AppContext.getApplicationContext().getBean(BullhornAPI.class);
        }

        return bullhornApi;
    }

    protected Logger getLog() {
        return log;
    }

}
