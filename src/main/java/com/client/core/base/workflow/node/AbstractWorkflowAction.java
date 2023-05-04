package com.client.core.base.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.ApplicationContextProvider;
import com.client.ApplicationSettings;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.StandardRelatedEntity;
import com.client.core.base.workflow.traversing.Traverser;
import com.client.core.email.service.EmailTemplateService;
import com.client.core.email.service.Emailer;
import com.google.common.collect.Maps;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;
import java.util.Map;
import java.util.Set;

@Log4j2
public abstract class AbstractWorkflowAction<E extends BullhornEntity, T extends Traverser> implements WorkflowAction<E, T> {

    private final Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields;

    private final ApplicationSettings appSettings;

    private final Emailer emailer;

    private final EmailTemplateService emailTemplateService;

    private final MessageSource messageSource;

    public AbstractWorkflowAction(Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        this.relatedEntityFields = relatedEntityFields;
        ApplicationContext applicationContext = ApplicationContextProvider.getApplicationContext();
        appSettings = applicationContext.getBean(ApplicationSettings.class);
        emailer = applicationContext.getBean(Emailer.class);
        emailTemplateService = applicationContext.getBean(EmailTemplateService.class);
        messageSource = applicationContext.getBean(MessageSource.class);
    }

    protected Map<StandardRelatedEntity, Set<String>> getStandardEntityFields() {
        return Maps.newLinkedHashMap();
    }

    protected String getMessageUsingKey(String key) throws NoSuchMessageException {
        return getMessageUsingKey(key, new Object[] {});
    }

    protected String getMessageUsingKey(String key, Object[] args) {
        return getMessageUsingKey(key, args, Locale.US);
    }

    protected String getMessageUsingKey(String key, Object[] args, Locale locale) throws NoSuchMessageException {
        return getMessageSource().getMessage(key, args, locale);
    }

    protected String getMessageUsingKey(String key, Locale locale) {
        return getMessageUsingKey(key, new Object[]{}, locale);
    }

    protected MessageSource getMessageSource() {
        return this.messageSource;
    }

    protected EmailTemplateService getEmailTemplateService() {
        return this.emailTemplateService;
    }

    protected ApplicationSettings getAppSettings() {
        return this.appSettings;
    }

    protected Emailer getEmailer() {
        return this.emailer;
    }

    @Override
    public Map<? extends BullhornRelatedEntity, Set<String>> getRelatedEntityFields() {
        Map<BullhornRelatedEntity, Set<String>> allFields = Maps.newLinkedHashMap();

        allFields.putAll(getStandardEntityFields());
        allFields.putAll(this.relatedEntityFields);

        return allFields;
    }
}
