package com.client.core.base.tools.enums;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

public enum YesNo {
    NO(0, "0", "No", false, "N"),
    YES(1, "1", "Yes", true, "Y");

    private final Integer integerValue;

    private final String value;

    private final String displayValue;

    private final Boolean booleanValue;

    private final String characterValue;

    YesNo(Integer integerValue, String value, String displayValue, Boolean booleanValue, String characterValue) {
        this.integerValue = integerValue;
        this.value = value;
        this.displayValue = displayValue;
        this.booleanValue = booleanValue;
        this.characterValue = characterValue;
    }

    public Integer integerValue() {
        return integerValue;
    }

    public String value() {
        return value;
    }

    public String displayValue() {
        return displayValue;
    }

    public Boolean booleanValue() {
        return booleanValue;
    }

    public String characterValue() {
        return characterValue;
    }

    public static YesNo fromValue(String value) {
        for (YesNo yesNo : YesNo.values()) {
            if (yesNo.value.equals(value)) {
                return yesNo;
            }
        }

        throw new IllegalArgumentException(value);
    }

    public static YesNo fromDisplayValue(String value) {
        if (value == null || value.isEmpty()) {
            return YesNo.NO;
        }

        for (YesNo yesNo : YesNo.values()) {
            if (yesNo.displayValue.equalsIgnoreCase(value)) {
                return yesNo;
            }
        }

        throw new IllegalArgumentException(value);
    }

    public static YesNo fromBooleanValue(Boolean value) {
        if (value == null) {
            return YesNo.NO;
        }

        for (YesNo yesNo : YesNo.values()) {
            if (yesNo.booleanValue.equals(value)) {
                return yesNo;
            }
        }

        return YesNo.NO;
    }

    public static String json() throws JSONException {
        return new JSONObject(map()).toString();
    }

    public static Map<String, String> map() {
        Map<String, String> map = new HashMap<String, String>();

        for (YesNo yesNo : YesNo.values()) {
            map.put(yesNo.value, yesNo.displayValue);
        }

        return map;
    }

    public static boolean isNo(String value) {
        if(StringUtils.isBlank(value)) {
            return false;
        }

        String toCheck = value.trim();

        return NO.value.equals(toCheck)
        || NO.displayValue.equalsIgnoreCase(toCheck)
        || NO.characterValue.equalsIgnoreCase(toCheck);
    }

    public static boolean isYes(String value) {
        if(StringUtils.isBlank(value)) {
            return false;
        }

        String toCheck = value.trim();

        return YES.value.equals(toCheck)
            || YES.displayValue.equalsIgnoreCase(toCheck)
            || YES.characterValue.equalsIgnoreCase(toCheck);
    }

    public boolean isNo() {
        return NO.equals(this);
    }

    public boolean isYes() {
        return YES.equals(this);
    }

    public static String displayValueFromValue(String value) {
        if (value == null || value.trim().length() == 0) {
            return "";
        }

        YesNo yesNo = fromValue(value);

        if (yesNo == null) {
            return "";
        }

        return yesNo.displayValue();
    }

}
