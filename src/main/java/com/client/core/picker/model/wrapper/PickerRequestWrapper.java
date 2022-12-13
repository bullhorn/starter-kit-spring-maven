package com.client.core.picker.model.wrapper;

public interface PickerRequestWrapper {

	String getQueryString();

	Integer getStart();

	Integer getCount();

	String getAdditionalLogic();

	String getCallback();

}