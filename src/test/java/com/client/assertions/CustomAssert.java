package com.client.assertions;

import org.junit.Assert;

public class CustomAssert extends Assert {
	
	static public void assertIsNumber(String condition) {
		assertIsNumber(null, condition);
	}
	
	static public void assertIsNumber(String message, String condition) {
		if(condition == null || condition.isEmpty()) {
			fail(message);
		}
		
		try {
			Double.parseDouble(condition);
		} catch(NumberFormatException e) {
			fail(message);
		}
	}
	
	static public void assertIsInteger(String condition) {
		assertIsInteger(null, condition);
	}
	
	static public void assertIsInteger(String message, String condition) {
		if(condition == null || condition.isEmpty()) {
			fail(message);
		}
		
		try {
			Integer.parseInt(condition);
		} catch(NumberFormatException e) {
			fail(message);
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
			fail(message);
		}
		
		if(!value.toLowerCase().contains(mustContain.toLowerCase())) {
			fail(message);
		}
	}

}
