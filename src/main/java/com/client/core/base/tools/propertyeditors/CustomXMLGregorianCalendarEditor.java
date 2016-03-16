package com.client.core.base.tools.propertyeditors;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.util.StringUtils;

import com.client.core.base.util.Util;

public class CustomXMLGregorianCalendarEditor extends PropertyEditorSupport {

	private final DateFormat dateFormat;

	private final boolean allowEmpty;

	/**
	 * Create a new CustomDateEditor instance, using the given DateFormat for parsing and rendering.
	 * <p>
	 * The "allowEmpty" parameter states if an empty String should be allowed for parsing, i.e. get interpreted as null value.
	 * Otherwise, an IllegalArgumentException gets thrown in that case.
	 * 
	 * @param dateFormat
	 *            DateFormat to use for parsing and rendering
	 * @param allowEmpty
	 *            if empty strings should be allowed
	 */
	public CustomXMLGregorianCalendarEditor(DateFormat dateFormat, boolean allowEmpty) {
		this.dateFormat = dateFormat;
		this.allowEmpty = allowEmpty;
	}

	/**
	 * Parse the Date from the given text, using the specified DateFormat.
	 */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (this.allowEmpty && !StringUtils.hasText(text)) {
			// Treat empty String as null value.
			setValue(null);
		} else {
			try {
				setValue(Util.dateToXMLGregorianCal(this.dateFormat.parse(text)));
			} catch (ParseException ex) {
				throw new IllegalArgumentException("Could not parse string to xmlgregorian calendar: " + ex.getMessage(), ex);
			}
		}
	}

	/**
	 * Format the XMLGregorianCalendar as String, using the specified DateFormat.
	 */
	@Override
	public String getAsText() {
		XMLGregorianCalendar value = (XMLGregorianCalendar) getValue();
		if(value == null){
			return "";
		}
		Date date = Util.xmlGregorianCalToDate(value);
		return (value != null ? this.dateFormat.format(date) : "");
	}

}
