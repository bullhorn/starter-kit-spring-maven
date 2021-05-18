package com.client.core.scheduledtasks.workflow.node.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.standard.PlacementCertification;
import com.client.core.base.model.relatedentity.credentialing.PlacementCertificationRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.PlacementCertificationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventListTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.PlacementCertificationEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class PlacementCertificationEventListTask extends AbstractEventListTask<PlacementCertification, PlacementCertificationScheduledTaskHelper, PlacementCertificationEventListTraverser> {

    public PlacementCertificationEventListTask(Integer order, Map<PlacementCertificationRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public PlacementCertificationEventListTask(Map<PlacementCertificationRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
