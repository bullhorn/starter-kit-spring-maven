package com.client.assertions;

import org.junit.jupiter.api.Assertions;

public class CustomAssert extends Assertions {

	static public void assertIsNumber(String condition) {
		assertIsNumber(null, condition);
	}

	static public void assertIsNumber(String message, String condition) {
		if(condition == null || condition.isEmpty()) {
			Assertions.fail(message);
		}

		try {
			Double.parseDouble(condition);
		} catch(NumberFormatException e) {
			Assertions.fail(message);
		}
	}

	static public void assertIsInteger(String condition) {
		assertIsInteger(null, condition);
	}

	static public void assertIsInteger(String message, String condition) {
		if(condition == null || condition.isEmpty()) {
			Assertions.fail(message);
		}

		try {
			Integer.parseInt(condition);
		} catch(NumberFormatException e) {
			Assertions.fail(message);
		}
	}

	static public void assertContainsStringNoCase(String value, String mustContain) {
		assertContainsStringNoCase(null, value, mustContain);
	}

	static public void assertContainsStringNoCase(String message, String value, String mustContain) {
		if(value == null && mustContain == null) {
			return;
		} else if(value != null && value.isEmpty() && mustContain != null && mustContain.isEmpty()) {
			return;
		} else if(value == null || value.isEmpty()) {
			Assertions.fail(message);
		}

		if(!value.toLowerCase().contains(mustContain.toLowerCase())) {
			Assertions.fail(message);
		}
	}

}
