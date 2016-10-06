package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

/**
 * Contains all the data needed to handle scheduled tasks automation. Once a  has been fetched using the BH api it will be
 * stored in this Traverser for subsequent automation work.
 * 
 * The allsToSaveBackToBH map will contain deep copies of relevant dtos that should be saved back to BH. The copies will be
 * updated according to task logic, while the original dtos will NOT be updated so that subsequent logic will still be made on
 * original values.
 * 
 * Once all automation work has been done the dtos that need saving will be saved only once. In this way keeping the api calls to
 * a minimum by saving each dto only once, even though multiple tasks might have updated different fields on the same dto.
 * 
 * @author magnus.palm
 * 
 * @param <T>
 */
public class CorporateUserScheduledTaskHelper extends AbstractScheduledTaskHelper {

	private CorporateUser corporateUser;

	public CorporateUserScheduledTaskHelper(CustomSubscriptionEvent event) {
		super(event);

	}

	public CorporateUser getCorporateUser() {
		if (corporateUser == null) {
			setCorporateUser(findCorporateUser(getEvent().getEntityId()));
		}
		return corporateUser;
	}

	public void setCorporateUser(CorporateUser corporateUser) {
		this.corporateUser = corporateUser;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		result.append(this.getClass().getName() + " Object {" + NEW_LINE);
		result.append(" corporateUser: " + corporateUser + NEW_LINE);
		result.append("}");
		return result.toString();

	}

}
