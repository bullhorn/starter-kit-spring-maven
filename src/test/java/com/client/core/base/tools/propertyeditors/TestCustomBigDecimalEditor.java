package com.client.core.base.tools.propertyeditors;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
public class TestCustomBigDecimalEditor {

	private CustomBigDecimalEditor editor;

	public TestCustomBigDecimalEditor() {
		super();
	}

	static Stream<String> validData() {
		return Stream.of("23,000.00", "23.00", "0.00", "123.00");
	}

	@BeforeEach
	public void setup() {
		this.editor = new CustomBigDecimalEditor(2, true);
	}

	@ParameterizedTest
	@MethodSource("validData")
	public void testSetAsTextString(String validValue) {

		editor.setAsText(validValue);

		BigDecimal value = (BigDecimal) editor.getValue();

		Assertions.assertTrue(value.compareTo(new BigDecimal(removeComma(validValue))) == 0);
	}

	@ParameterizedTest
	@MethodSource("validData")
	public void testGetAsText(String validValue) {

		editor.setAsText(validValue);

		String value =  editor.getAsText();

		Assertions.assertTrue(value.equals(removeComma(validValue)));
	}

	private String removeComma(String value){
		return value.replaceAll(",", "");
	}

}
