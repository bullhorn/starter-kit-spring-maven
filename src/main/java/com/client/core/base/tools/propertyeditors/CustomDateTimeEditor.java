package com.client.core.base.tools.propertyeditors;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

/**
 * Custom property editor for joda DateTime. Used for converting DateTime values for spring MVC
 *
 * @author magnus.palm
 *
 */
public class CustomDateTimeEditor extends PropertyEditorSupport {

    private final DateTimeFormatter customDateTimeFormatter;

    private final DateTimeFormatter iso8601DateTimeFormatter;

    private final static String iso8601Format = "yyyy-mm-dd'T'HH:MM:SS.SSS";

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
    public CustomDateTimeEditor(String formatPattern, boolean allowEmpty) {
        this.customDateTimeFormatter = DateTimeFormat.forPattern(formatPattern);
        this.iso8601DateTimeFormatter = ISODateTimeFormat.dateTime();
        this.allowEmpty = allowEmpty;
    }

    /**
     * Parse the DateTime from the given text, using the specified DateFormat.
     */
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (this.allowEmpty && !StringUtils.hasText(text)) {
            // Treat empty String as null value.
            setValue(null);
        } else {
            try {
                setValue(DateTime.parse(text, customDateTimeFormatter));
            } catch (IllegalArgumentException e) {
                setValue(DateTime.parse(text, iso8601DateTimeFormatter));
            }
        }
    }

    /**
     * Format the DateTime as String, using the specified DateFormat.
     */
    @Override
    public String getAsText() {
        DateTime value = (DateTime) getValue();
        if (value == null) {
            return "";
        }

        return customDateTimeFormatter.print(value);
    }

}
