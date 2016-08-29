package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.formtrigger.model.form.impl.FormClientCorporationDto;

public class TestClientCorporationFormTriggerHelper extends
		TestFormTriggerHelper<ClientCorporationFormTriggerHelper, FormClientCorporationDto, ClientCorporation> {

	@Override
	public void scaffoldThis() {
		this.helper = testUtil.getClientCorporationFormTriggerTraverser().getTriggerHelper();
	}

}
