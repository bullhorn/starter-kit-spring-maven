package com.client.core.base.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.ApplicationSettings;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.StandardRelatedEntity;
import com.client.core.base.workflow.traversing.Traverser;
import com.client.core.email.service.Emailer;
import com.google.common.collect.Maps;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;
import java.util.Map;
import java.util.Set;

// TODO: This class changed quite a bit getting rid of things. Make sure there's nothing missing from original file
@Log4j2
public abstract class AbstractWorkflowAction<E extends BullhornEntity, T extends Traverser> implements WorkflowAction<E, T> {

    private final Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields;

    @Autowired
    private ApplicationSettings appSettings;

    @Autowired
    private Emailer emailer;

    @Autowired
    private MessageSource messageSource;

    public AbstractWorkflowAction(Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        this.relatedEntityFields = relatedEntityFields;
    }

    protected Map<StandardRelatedEntity, Set<String>> getStandardEntityFields() {
        return Maps.newLinkedHashMap();
    }

    protected String getMessageUsingKey(String key) throws NoSuchMessageException {
        return getMessageUsingKey(key, new Object[] {});
    }

    protected String getMessageUsingKey(String key, Object[] args) throws NoSuchMessageException {
        return messageSource.getMessage(key, args, Locale.US);
    }

    @Override
    public Map<? extends BullhornRelatedEntity, Set<String>> getRelatedEntityFields() {
        Map<BullhornRelatedEntity, Set<String>> allFields = Maps.newLinkedHashMap();

        allFields.putAll(getStandardEntityFields());
        allFields.putAll(this.relatedEntityFields);

        return allFields;
    }
}
