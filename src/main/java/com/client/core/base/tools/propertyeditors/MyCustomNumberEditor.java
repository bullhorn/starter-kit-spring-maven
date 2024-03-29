package com.client.core.base.tools.propertyeditors;

import org.apache.commons.lang3.math.NumberUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.util.StringUtils;

/**
 * Defaults a field to null if we are trying to set a number with a value that is not a number
 *
 * @author Magnus Fiore Palm
 *
 */
public class MyCustomNumberEditor extends CustomNumberEditor {

	private final Logger log = LogManager.getLogger(getClass());

	public MyCustomNumberEditor(Class<? extends Number> numberClass) throws IllegalArgumentException {
		super(numberClass, true);

	}

	/**
	 * Parse the Number from the given text, using the specified NumberFormat.
	 */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		if (NumberUtils.isCreatable(text) || !StringUtils.hasText(text)) {
			super.setAsText(text);
		} else {
			log.error("Attempting to set a number field using the non-numeric value:" + text);
		}

	}

}
