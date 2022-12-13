package com.client.core.picker.service;


import com.bullhornsdk.data.model.response.list.ListWrapper;
import com.client.core.picker.model.view.JsonIdName;
import com.client.core.picker.model.wrapper.PickerRequestWrapper;

public interface PickerService<T extends JsonIdName> {
	
	public ListWrapper<T> getInitialValue(PickerRequestWrapper wrapper);
	
	public ListWrapper<T> getData(PickerRequestWrapper wrapper);

}
