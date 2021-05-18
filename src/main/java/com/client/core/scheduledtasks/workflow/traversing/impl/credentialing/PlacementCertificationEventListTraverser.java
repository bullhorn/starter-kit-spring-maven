package com.client.core.scheduledtasks.workflow.traversing.impl.credentialing;

import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.PlacementCertificationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTaskListTraverser;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PlacementCertificationEventListTraverser extends AbstractScheduledTaskListTraverser<PlacementCertificationScheduledTaskHelper> {

    public PlacementCertificationEventListTraverser(List<CustomSubscriptionEvent> events, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(events.parallelStream().map(event -> new PlacementCertificationScheduledTaskHelper(event, relatedEntityFields)).collect(Collectors.toList()));
    }

}
