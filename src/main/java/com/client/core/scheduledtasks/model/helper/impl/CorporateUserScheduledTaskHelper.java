package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.PrivateLabel;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.CorporateUserRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;


public class CorporateUserScheduledTaskHelper extends AbstractScheduledTaskHelper<CorporateUser> {

	private UserType userType;
	private PrivateLabel privateLabel;

	public CorporateUserScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, CorporateUser.class, CorporateUserRelatedEntity.CORPORATE_USER, relatedEntityFields);
	}

	public CorporateUser getCorporateUser() {
        return getEntity();
    }

	public UserType getUserType() {
		if (userType == null) {
			this.userType = findEntity(UserType.class, getCorporateUser().getUserType().getId(), CorporateUserRelatedEntity.USERTYPE);
		}

		return userType;
	}

	public PrivateLabel getPrivateLabel() {
		if (privateLabel == null) {
			this.privateLabel = findEntity(PrivateLabel.class, getCorporateUser().getPrivateLabel().getId(), CorporateUserRelatedEntity.PRIVATE_LABEL);
		}

		return privateLabel;
	}

}
