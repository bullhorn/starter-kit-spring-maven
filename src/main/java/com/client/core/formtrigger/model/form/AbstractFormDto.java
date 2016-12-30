package com.client.core.formtrigger.model.form;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.AppContext;
import com.client.core.ApplicationSettings;
import com.client.core.base.util.Util;
import com.client.core.base.util.Utility;

public abstract class AbstractFormDto<T extends BullhornEntity> implements CustomDto<T> {

	private final DateTimeFormatter dateFormatYyyyMmDd1 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSSZ").withZoneUTC();
	private final DateTimeFormatter dateFormatYyyyMmDd2 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS").withZoneUTC();
	private final DateTimeFormatter dateFormatYyyyMmDd3 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SS").withZoneUTC();

	private final List<DateTimeFormatter> dateFormats;

	private final Map<String, Boolean> stringToBooleanMapping;

	protected final Logger log;
	private Map<String, String> formPopulationErrors;

	public AbstractFormDto(Logger log) {
		super();
		this.log = log;
		this.formPopulationErrors = new ConcurrentHashMap<String, String>();
		this.stringToBooleanMapping = populateStringToBooleanMap();

        ApplicationSettings appSettings = AppContext.getApplicationContext().getBean(ApplicationSettings.class);

        String applicationDateFormat = appSettings.getApplicationDateFormat();
        String applicationShortFormat = Utility.longDateFormatToShort(applicationDateFormat);

        this.dateFormats  = Arrays.asList(
            DateTimeFormat.forPattern(applicationDateFormat).withZoneUTC(),
            DateTimeFormat.forPattern(applicationShortFormat).withZoneUTC(),
            dateFormatYyyyMmDd1, dateFormatYyyyMmDd2, dateFormatYyyyMmDd3
        );
	}

	/**
	 * Will try to convert the dateString to an XMLGregorianCalendar, using a number of different date patterns.
	 * 
	 * @param dateString
	 * @return
	 */
	protected XMLGregorianCalendar stringToXMLGregorianCalendar(String dateString) {
		DateTime dateTime = stringToDateTime(dateString);
		if (dateTime == null) {
			return null;
		}
		return dateTimeToXmlGregorianCal(dateTime);

	}

	public static XMLGregorianCalendar dateTimeToXmlGregorianCal(DateTime dateTime) {
		if (dateTime == null) {
			return null;
		}

		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTimeInMillis(dateTime.toDate().getTime());
		gregorianCalendar.setTimeZone(dateTime.getZone().toTimeZone());
		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	}

	/**
	 * Will try to convert the dateString to an DateTime, using a number of different date patterns.
	 * 
	 * @param dateString
	 * @return
	 */
	protected DateTime stringToDateTime(String dateString) {
		if (StringUtils.isEmpty(dateString)) {
			return null;
		}

		dateString = dateString.trim();
		for (DateTimeFormatter format : dateFormats) {
			try {
				DateTime date = format.parseDateTime(dateString);
				return date.withZoneRetainFields(Util.defaultTimeZone());
			} catch (IllegalArgumentException e) {

				// intentionally empty
			}
		}
		log.error("Unable to parse String: " + dateString + " to DateTime");
		return null;
	}

	protected Integer getFirstIntegerInCommaSeparatedList(String commaSeparatedString) {
		if (StringUtils.isBlank(commaSeparatedString)) {
			return 0;
		}
		String integerAsString = "";
		if (StringUtils.contains(commaSeparatedString, ",")) {
			integerAsString = StringUtils.substringBefore(commaSeparatedString, ",");
		} else {
			integerAsString = commaSeparatedString;
		}

		return Utility.forceParseInteger(integerAsString);
	}

	protected Integer toInteger(String value, String fieldName) {

		if (isBlank(value)) {
			return null;
		}

		try {
			return new BigDecimal(value).intValue();
		} catch (NumberFormatException e) {
			log.error("Error setting field: " + fieldName + " with value: " + value);
			addValidationMessage(value, fieldName);
			return null;
		}
	}

	private boolean isBlank(String value) {
		return StringUtils.isBlank(value);
	}

	protected BigDecimal toBigDecimal(String value, String fieldName) {
		if (isBlank(value)) {
			return null;
		}

		try {
			return new BigDecimal(value);
		} catch (NumberFormatException e) {
			log.error("Error setting field: " + fieldName + " with value: " + value);
			addValidationMessage(value, fieldName);
			return null;
		}

	}

	protected Double toDouble(String value, String fieldName) {

		if (isBlank(value)) {
			return null;
		}
		try {
			return new BigDecimal(value).doubleValue();
		} catch (NumberFormatException e) {
			log.error("Error setting field: " + fieldName + " with value: " + value);
			addValidationMessage(value, fieldName);
			return null;
		}

	}

	protected Boolean toBoolean(String value, String fieldName) {
		if (isBlank(value)) {
			return null;
		}

		Boolean booleanValue = stringToBooleanMapping.get(value.toLowerCase().trim());
		if (booleanValue != null) {
			return booleanValue;
		} else {
			log.error("Error setting field: " + fieldName + " with value: " + value);
			addValidationMessage(value, fieldName);
			return null;
		}

	}

	protected boolean digitsOnly(String value) {
		return StringUtils.isNumeric(value);
	}

    protected static String makeString(Object value){
        if(value == null){
            return null;
        }else{
            return value.toString();
        }
    }

	private void addValidationMessage(String value, String fieldName) {
		formPopulationErrors.put(fieldName, value + " is not a valid value for field: " + fieldName);
	}

	/**
	 * This map will contain any form population errors, such as trying to populate a numeric field with String values.
	 * 
	 * The structure of the Map will be key=fieldName, value=validation message with the fieldName.
	 * 
	 * Example "customInt1":"Abc is not a valid value for field: customInt1"
	 * 
	 * @return Will return a map with any formPopulationErrors, key=fieldName, value=validation message with the fieldName.
	 */
	public Map<String, String> getFormPopulationErrors() {
		this.instantiateEntity();

		return formPopulationErrors;
	}

	private Map<String, Boolean> populateStringToBooleanMap() {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("1", Boolean.TRUE);
		map.put("yes", Boolean.TRUE);
		map.put("true", Boolean.TRUE);
		map.put("on", Boolean.TRUE);
		map.put("0", Boolean.FALSE);
		map.put("no", Boolean.FALSE);
		map.put("false", Boolean.FALSE);
		map.put("off", Boolean.FALSE);
		return map;
	}

}
