package com.client.core.base.tools.propertyeditors;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestCustomBigDecimalEditor {

	private CustomBigDecimalEditor editor;

	private String validValue;

	@Parameters
	public static Collection<Object[]> validData() {
		return Arrays.asList(new Object[][] {{"23,000.00"}, {"23.00"}, {"0.00"}, {"123.00"}});
	}

	public TestCustomBigDecimalEditor(String validValue) {
		super();
		this.validValue = validValue;
	}

	@Before
	public void setup() {
		this.editor = new CustomBigDecimalEditor(2, true);
	}

	@Test
	public void testSetAsTextString() {
		editor.setAsText(validValue);

		BigDecimal value = (BigDecimal) editor.getValue();

		assertTrue(value.compareTo(new BigDecimal(removeComma(validValue))) == 0);
	}

	@Test
	public void testGetAsText() {
		
		editor.setAsText(validValue);

		String value =  editor.getAsText();

		assertTrue(value.equals(removeComma(validValue)));
	}
	
	private String removeComma(String value){
		return value.replaceAll(",", "");
	}

}
