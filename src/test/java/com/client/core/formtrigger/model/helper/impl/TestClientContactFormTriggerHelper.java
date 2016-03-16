package com.client.core.formtrigger.model.helper.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.formtrigger.model.form.impl.FormClientContactDto;

public class TestClientContactFormTriggerHelper extends
		TestFormTriggerHelper<ClientContactFormTriggerHelper, FormClientContactDto, ClientContact> {

	@Override
	public void scaffoldThis() {
		this.helper = testUtil.getClientContactValidationTraverser().getFormTriggerHelper();
	}

	@Test
	public void testGetClientCorporation() {
		assertNotNull(helper.getClientCorporation().getId());
	}

}
