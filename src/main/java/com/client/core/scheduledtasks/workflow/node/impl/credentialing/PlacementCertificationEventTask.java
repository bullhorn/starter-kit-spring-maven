package com.client.core.scheduledtasks.workflow.node.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.standard.PlacementCertification;
import com.client.core.base.model.relatedentity.credentialing.PlacementCertificationRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.PlacementCertificationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.PlacementCertificationEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class PlacementCertificationEventTask extends AbstractEventTask<PlacementCertification, PlacementCertificationScheduledTaskHelper, PlacementCertificationEventTraverser> {

    public PlacementCertificationEventTask(Integer order, Map<PlacementCertificationRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public PlacementCertificationEventTask(Map<PlacementCertificationRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
