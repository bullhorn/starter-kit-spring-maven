package com.client.core.base.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.AppContext;
import com.client.core.ApplicationSettings;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.StandardRelatedEntity;
import com.client.core.base.workflow.traversing.Traverser;
import com.client.core.email.service.EmailTemplateService;
import com.client.core.email.service.Emailer;
import com.google.common.collect.Maps;
import org.apache.log4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;
import java.util.Map;
import java.util.Set;

public abstract class AbstractWorkflowAction<E extends BullhornEntity, T extends Traverser> implements WorkflowAction<E, T> {

    private final Logger log = Logger.getLogger(getClass());

    private final Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields;

    private EmailTemplateService emailTemplateService;
    private ApplicationSettings appSettings;
    private MessageSource messageSource;
    private Emailer emailer;

    public AbstractWorkflowAction(Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        this.relatedEntityFields = relatedEntityFields;
    }

    public AbstractWorkflowAction(Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields,
                                  Map<StandardRelatedEntity, Set<String>> standardFields) {
        this.relatedEntityFields = mergeFields(relatedEntityFields, standardFields);
    }

    protected Map<StandardRelatedEntity, Set<String>> getStandardEntityFields() {
        return Maps.newLinkedHashMap();
    }

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

    protected <T extends BullhornRelatedEntity> Map<BullhornRelatedEntity, Set<String>> mergeFields(Map<T, Set<String>> entityFields,
                                                                                                    Map<StandardRelatedEntity, Set<String>> standardFields) {
        Map<BullhornRelatedEntity, Set<String>> allRelatedEntities = Maps.newLinkedHashMap();

        allRelatedEntities.putAll(entityFields);
        allRelatedEntities.putAll(standardFields);

        return allRelatedEntities;
    }

    @Override
    public Map<? extends BullhornRelatedEntity, Set<String>> getRelatedEntityFields() {
        Map<BullhornRelatedEntity, Set<String>> allFields = Maps.newLinkedHashMap();

        allFields.putAll(getStandardEntityFields());
        allFields.putAll(this.relatedEntityFields);

        return allFields;
    }

    protected Logger getLog() {
        return log;
    }

}
