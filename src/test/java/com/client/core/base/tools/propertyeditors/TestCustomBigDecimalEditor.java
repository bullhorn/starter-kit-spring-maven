package com.client.core.base.tools.propertyeditors;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.Arguments;
import org.mockito.junit.jupiter.MockitoExtension;

// TODO: Update 'MockitoExtension.class' to 'SpringExtension.class' once Spring Boot is added
@ExtendWith(MockitoExtension.class)
public class TestCustomBigDecimalEditor {

	private CustomBigDecimalEditor editor;

	private String validValue;

	static Stream<Arguments> validData() {
		return Stream.of(
				Arguments.of("23,000.00"),
				Arguments.of("23.00"),
				Arguments.of("0.00"),
				Arguments.of("123.00")
		);
	}

	public TestCustomBigDecimalEditor(String validValue) {
		super();
		this.validValue = validValue;
	}

	@BeforeEach
	public void setup() {
		this.editor = new CustomBigDecimalEditor(2, true);
	}

	@Test
	public void testSetAsTextString() {
		editor.setAsText(validValue);

		BigDecimal value = (BigDecimal) editor.getValue();

		Assertions.assertTrue(value.compareTo(new BigDecimal(removeComma(validValue))) == 0);
	}

	@Test
	public void testGetAsText() {

		editor.setAsText(validValue);

		String value =  editor.getAsText();

		Assertions.assertTrue(value.equals(removeComma(validValue)));
	}

	private String removeComma(String value){
		return value.replaceAll(",", "");
	}

}
