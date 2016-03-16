package com.client.core.formtrigger.model.form;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.formtrigger.model.form.impl.FormCandidateDto;

public class TestAbstractFormDto {

	private FormCandidateDto candidate;

	String dateString;

	@Before
	public void setup() {
		this.candidate = new FormCandidateDto();
	}

	@Test
	public void testDateParsing_dateFormatStandardUS() {

		this.dateString = "08/21/2014";
		XMLGregorianCalendar date = candidate.stringToXMLGregorianCalendar(dateString);
		runAssertions(date);

	}

	@Test
	public void testDateParsing_dateFormatYyyyMmDd1() {

		this.dateString = "2014-08-21 08:44:07.233Z";

		XMLGregorianCalendar date = candidate.stringToXMLGregorianCalendar(dateString);

		runAssertions(date);

	}

	private void runAssertions(XMLGregorianCalendar date) {
		assertNotNull(date);

	}

	@Test
	public void testDateParsing_dateFormatYyyyMmDd2() {

		this.dateString = "2014-08-21 08:44:07.233";

		XMLGregorianCalendar date = candidate.stringToXMLGregorianCalendar(dateString);

		runAssertions(date);

	}

	@Test
	public void testDateParsing_dateFormatYyyyMmDd3() {

		this.dateString = "2014-08-21 06:28:08.52";
		XMLGregorianCalendar date = candidate.stringToXMLGregorianCalendar(dateString);
		runAssertions(date);

	}

	@Test
	public void formDateStringToXmlDateOnFormDto() {
		this.dateString = "08/21/2014";
		this.candidate.setCustomDate1(dateString);
		DateTime date = candidate.stringToDateTime(dateString);
		Candidate candidateEntity = candidate.instantiateEntity();
		assertTrue(candidateEntity.getCustomDate1().equals(date));

	}

	@Test
	public void formDateStringToXml_badFormat() {
		this.dateString = "0348/21/23443014";
		XMLGregorianCalendar date = candidate.stringToXMLGregorianCalendar(dateString);

		assertNull(date);

	}

	@Test
	public void formDateStringToXml_badFormatNull() {

		XMLGregorianCalendar date = candidate.stringToXMLGregorianCalendar(null);

		assertNull(date);

	}

	@Test
	public void testGetFirstIntegerInCommaSeparatedList() {
		Integer value = candidate.getFirstIntegerInCommaSeparatedList("34,45,56");
		assertTrue(value.equals(34));

	}

	@Test
	public void testGetFirstIntegerInCommaSeparatedList_notValid() {
		Integer value = candidate.getFirstIntegerInCommaSeparatedList("3B4,45,56");
		assertTrue(value.equals(0));

	}

	@Test
	public void testGetFirstIntegerInCommaSeparatedList_notValidNull() {
		Integer value = candidate.getFirstIntegerInCommaSeparatedList(null);
		assertTrue(value.equals(0));

	}

	@Test
	public void testToInteger1() {
		Integer aValue = 11;
		Integer value = candidate.toInteger("" + aValue, "test");
		assertTrue(aValue.equals(value));
	}

	@Test
	public void testToInteger2() {

		Integer value = candidate.toInteger("1.1", "test");
		assertTrue(value == 1);
	}

	@Test
	public void testToInteger3() {

		Integer value = candidate.toInteger("ad", "test");
		assertTrue(value == null);

		Map<String, String> formErrors = candidate.getFormPopulationErrors();
		assertNotNull(formErrors.get("test"));
	}

	@Test
	public void testToInteger4() {
		Integer aValue = 0;
		Integer value = candidate.toInteger("-0.58", "test");
		assertTrue(value != null);
		assertTrue(aValue.equals(value));

	}

	@Test
	public void testToInteger5() {
		Integer aValue = -58;
		Integer value = candidate.toInteger("-58", "test");
		assertTrue(value != null);
		assertTrue(aValue.equals(value));

	}

	@Test
	public void testToBigDecimal1() {

		BigDecimal value = candidate.toBigDecimal("11", "test");
		assertTrue(value.compareTo(new BigDecimal("11")) == 0);
	}

	@Test
	public void testToBigDecimal2() {

		BigDecimal value = candidate.toBigDecimal("1.1", "test");
		assertTrue(value.compareTo(new BigDecimal("1.1")) == 0);
	}

	@Test
	public void testToBigDecimal3() {

		BigDecimal value = candidate.toBigDecimal("ad", "test");
		assertTrue(value == null);
		Map<String, String> formErrors = candidate.getFormPopulationErrors();
		assertNotNull(formErrors.get("test"));
	}

	@Test
	public void testToDouble1() {

		Double value = candidate.toDouble("11", "test");
		assertTrue(value.compareTo(new Double("11")) == 0);
	}

	@Test
	public void testToDouble2() {

		Double value = candidate.toDouble("1.1", "test");
		assertTrue(value.compareTo(new Double("1.1")) == 0);
	}

	@Test
	public void testToDouble3() {

		Double value = candidate.toDouble("ad", "test");
		assertTrue(value == null);
		Map<String, String> formErrors = candidate.getFormPopulationErrors();
		assertNotNull(formErrors.get("test"));
	}

	@Test
	public void testToBoolean1() {
		assertTrue(candidate.toBoolean("1", "test"));
		assertTrue(candidate.toBoolean("true", "test"));
		assertTrue(candidate.toBoolean("yes", "test"));
		assertTrue(candidate.toBoolean("on", "test"));

	}

	@Test
	public void testToBoolean2() {
		assertFalse(candidate.toBoolean("0", "test"));
		assertFalse(candidate.toBoolean("false", "test"));
		assertFalse(candidate.toBoolean("no", "test"));
		assertFalse(candidate.toBoolean("off", "test"));

	}

	@Test
	public void testToBoolean3() {
		assertNull(candidate.toBoolean("asdfsadf", "test"));
		Map<String, String> formErrors = candidate.getFormPopulationErrors();
		assertNotNull(formErrors.get("test"));

	}

}
