package com.client.core.base.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import com.bullhorn.apiservice.ApiService;
import com.bullhorn.apiservice.result.ApiFindResult;
import com.bullhorn.entity.user.CorporateUserDto;

public class Util {

	private static final int MILLISECSPERDAY = (1000 * 60 * 60 * 24);

	public static DateTimeZone defaultTimeZone() {
		return DateTimeZone.forID("EST5EDT");
	}

	// ------------------------------------Dates Manipulation-------------------------------------------
	/**
	 * returns date time in patterns from SimpleDateFormat "yyyy.MM.dd G 'at' HH:mm:ss z" 2001.07.04 AD at 12:08:56 PDT "EEE, MMM d, ''yy"
	 * Wed, Jul 4, '01 "h:mm a" 12:08 PM "hh 'o''clock' a, zzzz" 12 o'clock PM, Pacific Daylight Time "K:mm a, z" 0:08 PM, PDT
	 * "yyyyy.MMMMM.dd GGG hh:mm aaa" 02001.July.04 AD 12:08 PM "EEE, d MMM yyyy HH:mm:ss Z" Wed, 4 Jul 2001 12:08:56 -0700 "yyMMddHHmmssZ"
	 * 010704120856-0700
	 * 
	 * util.getDateTime("yyyy-MM-dd", Date)
	 * 
	 * @param pattern
	 * @param aDate
	 * @return
	 */
	public static String getDateTimeFromSQL(String pattern, java.sql.Date aDate) {
		if (aDate == null) {
			return "";
		}
		return new SimpleDateFormat(pattern).format(aDate);
	}

	/**
	 * Converts a XMLGregorianCalendar to a local date time of type Date.
	 * 
	 * Use this when converting from XMLGregorianCalendar in order to get correct date comparison handling.
	 * 
	 * @param xmlCal
	 * @return
	 */
	public static Date xmlGregorianCalendarToLocalDate(XMLGregorianCalendar xmlCal) {

		return new DateTime(xmlCal.toString(), defaultTimeZone()).toLocalDateTime().toDate();
	}

	/**
	 * 'true', 'on','yes' or '1' (case insensitive) will return true. Otherwise, false is returned.
	 * 
	 * @param value
	 * @return
	 */
	public static Boolean convertToBoolean(Object value) {
		if (value == null) {
			return false;
		}
		String booleanString = value.toString();
		if ("1".equals(booleanString)) {
			return true;
		}
		if ("0".equals(booleanString)) {
			return false;
		}

		return BooleanUtils.toBoolean(booleanString);

	}

	/**
	 * returns date time in patterns from SimpleDateFormat "yyyy.MM.dd G 'at' HH:mm:ss z" 2001.07.04 AD at 12:08:56 PDT "EEE, MMM d, ''yy"
	 * Wed, Jul 4, '01 "h:mm a" 12:08 PM "hh 'o''clock' a, zzzz" 12 o'clock PM, Pacific Daylight Time "K:mm a, z" 0:08 PM, PDT
	 * "yyyyy.MMMMM.dd GGG hh:mm aaa" 02001.July.04 AD 12:08 PM "EEE, d MMM yyyy HH:mm:ss Z" Wed, 4 Jul 2001 12:08:56 -0700 "yyMMddHHmmssZ"
	 * 010704120856-0700
	 * 
	 * @param pattern
	 * @param aDate
	 * @return
	 */
	public static String getDateTime(String pattern, java.util.Date aDate) {
		if (aDate == null) {
			return "";
		}
		return new SimpleDateFormat(pattern).format(aDate);
	}

	public static String getDateTime(String pattern, java.util.Calendar aDate) {
		if (aDate == null) {
			return "";
		}
		return new SimpleDateFormat(pattern).format(aDate);
	}

	public static String getDateTime(String pattern, java.sql.Date aDate) {
		if (aDate == null) {
			return "";
		}
		return new SimpleDateFormat(pattern).format(aDate);
	}

	/**
	 * Returns today based on time zone; defaults timeZone to "EST5EDT" if null passed in.
	 * 
	 * @param timeZone
	 *            a valid time zone, if null then deftaults to "EST5EDT";
	 * @return
	 */
	public static Date getCurrentDateUsingTimeZone(String timeZone) {
		try {
			// default to "EST5EDT"
			if (timeZone == null) {
				timeZone = "EST5EDT";
			}

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
			dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));

			SimpleDateFormat dateFormatLocal = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");

			String dateString = dateFormat.format(new Date());
			return dateFormatLocal.parse(dateString);
		} catch (ParseException ex) {
			System.out.println("Unable to parse string");
		} catch (Exception ex) {
			System.out.println("Time zone passed in to getESTCurrentDateUsingTimeZone is not correct");
		}
		return null;
	}

	/**
	 * Returns today based on time zone; defaults timeZone to "EST5EDT" if null passed in.
	 * 
	 * @param timeZone
	 *            a valid time zone, if null then deftaults to "EST5EDT";
	 * @return today's date in DateTime for the passed in timeZone
	 */
	public static DateTime nowUsingTimeZone(DateTimeZone timeZone) {

		// default to "EST5EDT"
		if (timeZone == null) {
			timeZone = defaultTimeZone();
		}

		return new DateTime(timeZone);
	}

	/**
	 * Returns a DateTime with the current time in EST but with the DateTimeZone.UTC, use this to populate a date in a BullhornEntity when
	 * wanting todays date.
	 * 
	 * @return The current DateTime in EST with the DateTimeZone set to UTC.
	 */
	public static DateTime nowInESTWithUTCTimeZone() {
		DateTime now = nowUsingTimeZone(null);
		return now.withZoneRetainFields(DateTimeZone.UTC);
	}
	
	


	/**
	 * 
	 * @param date
	 * @return
	 */
	public static java.sql.Date getSqlDateObj(java.util.Date date) {
		java.sql.Date sqlDate = null;
		if (date != null) {
			sqlDate = new java.sql.Date(date.getTime());
		}
		return sqlDate;
	}

	/**
	 * 
	 * @param dateStr
	 * @return
	 */
	public static Date stringToDate(String dateStr) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dateObj = null;
		try {
			dateObj = df.parse(dateStr);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateObj;
	}

	/**
	 * Returns a Date object from a string with format 1/1/2010 Month 1-12
	 * 
	 * @param date
	 * @return Date object
	 */
	public static java.sql.Date stringToSqlDate(String date) {
		return new java.sql.Date(stringToCalendar(date).getTime().getTime());
	}

	public static Calendar stringToCalendar(String date) {
		String[] dateStr = date.split("/");
		int month = Integer.parseInt(dateStr[0]);
		int day = Integer.parseInt(dateStr[1]);
		int year = Integer.parseInt(dateStr[2]);
		Calendar cal = Calendar.getInstance();
		// Note January is 0
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.YEAR, year);
		// cal.set(Calendar.HOUR, 0);
		// cal.set(Calendar.MINUTE, 0);
		// cal.set(Calendar.SECOND,0);
		// cal.set(Calendar.MILLISECOND,0);
		return cal;
	}

	public static java.util.Date stringToUtilDate(String date) {
		String[] dateStr = date.split("/");
		int month = Integer.parseInt(dateStr[0]);
		int day = Integer.parseInt(dateStr[1]);
		int year = Integer.parseInt(dateStr[2]);
		Calendar cal = Calendar.getInstance();
		// January is 0
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.YEAR, year);
		// cal.set(Calendar.HOUR, 0);
		// cal.set(Calendar.MINUTE, 0);
		// cal.set(Calendar.SECOND,0);
		// cal.set(Calendar.MILLISECOND,0);
		return new java.util.Date(cal.getTime().getTime());
	}

	/**
	 * Returns a Date object from a string with format 1/1/2010
	 * 
	 * @param date
	 * @return Date object
	 */
	public static java.sql.Date getSQLDate(Calendar cal) {
		return new java.sql.Date(cal.getTime().getTime());
	}

	/**
	 * 
	 * @param cal
	 * @return
	 */
	public static java.sql.Timestamp getTimeStamp(Calendar cal) {
		return new java.sql.Timestamp(cal.getTime().getTime());
	}

	/**
	 * 
	 * @param timeStamp
	 * @return
	 */
	public static java.util.Calendar getCal(java.sql.Timestamp timeStamp) {
		if (timeStamp == null) {
			return null;
		}
		java.util.Calendar cal = Calendar.getInstance();
		java.util.Date date = new Date(timeStamp.getTime());
		cal.setTime(date);
		return cal;
	}

	/**
	 * 
	 * @param inDate
	 * @return
	 */
	public static boolean isValidDate(String inDate) {

		if (inDate == null)
			return false;

		// set the format to use as a constructor argument
		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

		dateFormat.setLenient(false);

		try {
			// parse the inDate parameter
			dateFormat.parse(inDate.trim());
		} catch (ParseException pe) {
			return false;
		}
		return true;
	}

	/**
	 * Takes an object and return it's toString value, special handling for Date and XMLGregorianCalendar as these are converted using the
	 * passed in dateFormat
	 * 
	 * @param displayValue
	 * @param dateFormat
	 * @return a string representation of the displayValue
	 */
	public static String prepareDisplayValue(Object displayValue, String dateFormat) {

		if (displayValue == null) {
			return "";
		}
		if (displayValue instanceof Date) {
			return prepareDateDisplayValue((Date) displayValue, dateFormat);

		}

		if (displayValue instanceof XMLGregorianCalendar) {
			XMLGregorianCalendar xmlGregorianCalendar = (XMLGregorianCalendar) displayValue;
			return prepareDateDisplayValue(Util.xmlGregorianCalToDate(xmlGregorianCalendar), dateFormat);
		}

		if (displayValue instanceof DateTime) {
			return prepareDateDisplayValue(((DateTime) displayValue).toDate(), dateFormat);

		}

		if (displayValue instanceof BigDecimal) {
			BigDecimal bigDecimal = (BigDecimal) displayValue;
			bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
			String returnThis = bigDecimal.toPlainString();
			return returnThis;
		}

		return displayValue.toString();
	}

	private static String prepareDateDisplayValue(Date date, String dateFormat) {
		return new SimpleDateFormat(dateFormat).format(date);
	}

	/**
	 * 
	 * @return
	 */
	public static XMLGregorianCalendar getXMLGregoCurrDateTime() {

		try {
			GregorianCalendar gc = new GregorianCalendar();
			DatatypeFactory dtf;
			dtf = DatatypeFactory.newInstance();
			return dtf.newXMLGregorianCalendar(gc);

		} catch (DatatypeConfigurationException e) {
			return null;
		}
	}

	public static GregorianCalendar strDateToGregorianCal(String aDate, boolean usDateStd) {

		String[] dateStr = aDate.split("/");
		int month = Integer.parseInt(dateStr[0]);
		int day = Integer.parseInt(dateStr[1]);
		if (usDateStd == false) {
			month = Integer.parseInt(dateStr[1]);
			day = Integer.parseInt(dateStr[0]);
		}
		int year = Integer.parseInt(dateStr[2]);
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(GregorianCalendar.DAY_OF_MONTH, day);
		gc.set(GregorianCalendar.MONTH, month - 1);
		gc.set(GregorianCalendar.YEAR, year);
		return gc;
	}

	public static XMLGregorianCalendar today() {
		DatatypeFactory dtf = null;
		try {
			dtf = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		GregorianCalendar gc = new GregorianCalendar();
		return dtf.newXMLGregorianCalendar(gc);
	}

	public static XMLGregorianCalendar addDays(XMLGregorianCalendar xgc, int numOfDays) {
		if (xgc == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(xgc.toGregorianCalendar().getTime());
		cal.add(Calendar.DAY_OF_MONTH, numOfDays);
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(cal.getTime());
		DatatypeFactory dtf = null;
		try {
			dtf = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}

		return dtf.newXMLGregorianCalendar(gc);
	}

	public static XMLGregorianCalendar gregCalToXmlGregCal(GregorianCalendar gc) {
		DatatypeFactory dtf = null;
		try {
			dtf = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}

		return dtf.newXMLGregorianCalendar(gc);
	}

	public static String xmlGregCalToStringM2(String separator, XMLGregorianCalendar xmlGc) {
		String dateStr = xmlGc.getMonth() + separator + xmlGc.getDay() + separator + xmlGc.getYear();
		return dateStr;
	}

	/**
	 * Define pattern like "MM/dd/yyyy", etc
	 * 
	 * @param pattern
	 * @param xmlGc
	 * @return
	 */
	public static String xmlGregCalToString(String pattern, XMLGregorianCalendar xmlGc) {
		Date d = xmlGc.toGregorianCalendar().getTime();
		// String a = getDateTime("MM/dd/yyyy", d);
		return getDateTime(pattern, d);
	}

	/**
	 * 
	 * @param aDate
	 * @return
	 */
	public static XMLGregorianCalendar dateToXMLGregorianCal(Date aDate) {
		if (aDate == null) {
			return null;
		}

		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(aDate);
		XMLGregorianCalendar xmlGregCal;
		xmlGregCal = null;
		try {
			xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xmlGregCal;
	}

	/**
	 * 
	 * @param xmlGregCal
	 * @return
	 */
	public static Date xmlGregorianCalToDate(XMLGregorianCalendar xmlGregCal) {
		return xmlGregCal.toGregorianCalendar().getTime();
	}

	/**
	 * Define pattern like "MM/dd/yyyy", etc
	 * 
	 * @param pattern
	 * @param xmlGc
	 * @return
	 */
	public static String calendarToString(String pattern, Calendar cal) {
		Date d = cal.getTime();
		// String a = getDateTime("MM/dd/yyyy", d);
		return getDateTime(pattern, d);
	}

	/**
	 * 
	 * @param dateBegin
	 * @param dateEnd
	 * @return
	 */
	public static int calculateWeekDaysInRangeInclusive(GregorianCalendar dateBegin, GregorianCalendar dateEnd) {
		// subtract day from start so start day is counted
		dateBegin.add(Calendar.DAY_OF_MONTH, -1);

		return calculateWeekDaysInRange(dateBegin, dateEnd);
	}

	/**
	 * 
	 * @param dateBegin
	 * @param dateEnd
	 * @return
	 */
	public static int calculateWeekDaysInRange(GregorianCalendar dateBegin, GregorianCalendar dateEnd) {
		long endL = dateEnd.getTimeInMillis() + dateEnd.getTimeZone().getOffset(dateEnd.getTimeInMillis());
		long startL = dateBegin.getTimeInMillis() + dateBegin.getTimeZone().getOffset(dateBegin.getTimeInMillis());

		int startDay = dateBegin.get(GregorianCalendar.DAY_OF_WEEK);
		int endDay = dateEnd.get(GregorianCalendar.DAY_OF_WEEK);

		int dayDifferenceDays = (int) ((endL - startL) / MILLISECSPERDAY);
		int wholeWeeks = dayDifferenceDays / 7;
		int daysLeft = dayDifferenceDays % 7;
		int nonBusDays = wholeWeeks * 2;

		if (daysLeft > 0) {
			if (endDay == 7 || startDay == 7) {
				nonBusDays += 1;
			} else if (startDay > endDay) {
				nonBusDays += 2;
			}
		}

		int dayDifference = dayDifferenceDays - nonBusDays;

		return dayDifference;
	}

	public String convertStreamToString(InputStream is) throws IOException {

		if (is != null) {
			Writer writer = new StringWriter();
			char[] buffer = new char[1024];
			try {
				Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				int n;
				while ((n = reader.read(buffer)) != -1) {
					writer.write(buffer, 0, n);
				}
			} finally {
				is.close();
			}
			return writer.toString();
		} else {
			return "";
		}
	}

	public String readFileAsString(String filePath) throws java.io.IOException {
		StringBuffer fileData = new StringBuffer(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		char[] buf = new char[1024];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}

		reader.close();
		return fileData.toString();
	}

	public void writeFile(String contents, String filePath) {
		try {

			FileWriter fstream = new FileWriter(filePath);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(contents);
			out.close();

		} catch (Exception e) {

		}
	}

	@SuppressWarnings("unchecked")
	public HashMap reflect(Object obj) {

		HashMap map = new HashMap();
		Class classObj = obj.getClass();
		Method[] methods = classObj.getMethods();
		for (int i = 0; i < methods.length; i++) {
			String methodName = methods[i].getName();
			String returnString = methods[i].getReturnType().getName();
			Class[] parameterTypes = methods[i].getParameterTypes();
			for (int k = 0; k < parameterTypes.length; k++) {
				String parameterName = parameterTypes[k].getName();
			}
			try {
				Object valueObject = methods[i].invoke(obj, (Object[]) null);
				if (methodName.startsWith("get") && !methodName.equalsIgnoreCase("getClass")) {
					map.put(methodName, valueObject.toString());
				}
			} catch (Exception e) {

			}
		}
		return map;
	}

	// **********************************************Numbers**********************************************
	public static boolean isNumeric(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)) && !".".equalsIgnoreCase(Character.toString(str.charAt(i))))
				return false;
		}
		return true;
	}

	// *******************************************Strings***************************************************
	/**
	 * To increase performance instead of using String.replaceAll class, use Pattern class
	 * 
	 * @param pattern
	 * @param in
	 * @param withThis
	 * @return
	 */
	public String replace(String in, String withThis, String pattern) {

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(in);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, withThis);
		}
		m.appendTail(sb);
		return sb.toString();
	}

	// **********************************************Other**************************************************
	/**
	 * Convenience function to ignore nulls.
	 * 
	 * @param in
	 * @return
	 */
	public static String get(Object in) {
		if (in == null) {
			return "";
		}
		return in.toString();
	}

	public static boolean isGetter(Method method) {
		if (!method.getName().startsWith("get"))
			return false;
		if (method.getParameterTypes().length != 0)
			return false;
		if (void.class.equals(method.getReturnType()))
			return false;
		return true;
	}

	public static boolean isSetter(Method method) {
		if (!method.getName().startsWith("set"))
			return false;
		if (method.getParameterTypes().length != 1)
			return false;
		return true;
	}

	// *************************************************DH API calls **********************************************
	public static CorporateUserDto getCorporateUser(Integer iUserID, ApiService service, String currSession) {

		CorporateUserDto corporateUser = null;
		try {
			ApiFindResult findResult = service.find(currSession, "CorporateUser", iUserID);
			corporateUser = (CorporateUserDto) findResult.getDto();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return corporateUser;
	}

	/**
	 * Converts a String[] to a String separated by the passed in separator. Returns null if the array passed in is null
	 * 
	 * @param a
	 *            , an Array of Strings
	 * @param separator
	 * @return a separator separated String
	 */
	public static String arrayToString(String[] a, String separator) {
		StringBuilder result = new StringBuilder();
		if (a == null) {
			return null;
		}
		if (a.length > 0) {
			result.append(a[0]);
			for (int i = 1; i < a.length; i++) {
				result.append(separator);
				result.append(a[i]);
			}
		}
		return result.toString();
	}

	public static <T> String listToString(List<T> list, String separator) {
		return "";
	}

	public static String convertToJquiDateFormat(String javaSimpleDateFormat) {
		// Year
		if (javaSimpleDateFormat.contains("yyyy")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replaceAll("yyyy", "yy");
		} else {
			javaSimpleDateFormat = javaSimpleDateFormat.replaceAll("yy", "y");
		}
		// Month
		if (javaSimpleDateFormat.contains("MMMM")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("MMMM", "MM");
		} else if (javaSimpleDateFormat.contains("MMM")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("MMM", "M");
		} else if (javaSimpleDateFormat.contains("MM")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("MM", "mm");
		} else if (javaSimpleDateFormat.contains("M")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("M", "m");
		}

		// Day
		if (javaSimpleDateFormat.contains("DD")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("DD", "oo");
		} else if (javaSimpleDateFormat.contains("D")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("D", "o");
		}

		// Day of month

		if (javaSimpleDateFormat.contains("EEEE")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("EEEE", "DD");
		} else if (javaSimpleDateFormat.contains("EEE")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("EEE", "D");
		}

		return javaSimpleDateFormat;
	}

	public static String convertToBootstrapDateFormat(String javaSimpleDateFormat) {

		// Month
		if (javaSimpleDateFormat.contains("MMMM")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("MMMM", "MM");
		} else if (javaSimpleDateFormat.contains("MMM")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("MMM", "M");
		} else if (javaSimpleDateFormat.contains("MM")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("MM", "mm");
		}

		// Day
		if (javaSimpleDateFormat.contains("DD")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("DD", "dd");
		} else if (javaSimpleDateFormat.contains("D")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("D", "d");
		}

		// Day of month

		if (javaSimpleDateFormat.contains("EEEE")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("EEEE", "DD");
		} else if (javaSimpleDateFormat.contains("EEE")) {
			javaSimpleDateFormat = javaSimpleDateFormat.replace("EEE", "D");
		}

		return javaSimpleDateFormat;
	}

	/**
	 * Checks if a string (value) is equal to at least one of the values in a comma separated string.
	 * 
	 * @param value
	 *            The text value that should be evaluated
	 * @param commaSeparatedList
	 *            A comma separated string with all possible values
	 * @return true if any of the values in commaSeparatedList match the value
	 */
	public static boolean inList(String value, String commaSeparatedList) {
		boolean match = false;
		if ((commaSeparatedList == null || commaSeparatedList.trim().length() == 0) || (value == null || value.trim().length() == 0)) {
			return match;
		}

		// Convert the csv string to a list of strings
		List<String> allValuesToCheck = Arrays.asList(commaSeparatedList.split(","));
		// check if value is equal to any of the values in the list

		for (String s : allValuesToCheck) {
			if (value.trim().equalsIgnoreCase(s.trim())) {
				match = true;
				break;
			}
		}

		return match;
	}

	/**
	 * Checks if a string (value) contains at least one of the values in a comma separated string.
	 * 
	 * @param value
	 *            The text value that should be evaluated
	 * @param commaSeparatedList
	 *            A comma separated string with all possible values
	 * @return true if the value contains any of the values in the commaSeparatedList
	 */
	public static boolean valueContainsAtLeastOneValueInList(String value, String commaSeparatedList) {
		boolean match = false;
		if ((commaSeparatedList == null || commaSeparatedList.trim().length() == 0) || (value == null || value.trim().length() == 0)) {
			return match;
		}

		// Convert the csv string to a list of strings
		List<String> allValuesToCheck = Arrays.asList(commaSeparatedList.split(","));
		// check if value is equal to any of the values in the list

		for (String s : allValuesToCheck) {
			if (value.trim().toLowerCase().contains(s.trim().toLowerCase())) {
				match = true;
				break;
			}
		}

		return match;
	}

	/**
	 * Prints the request parameters
	 * 
	 * @author William Cornejo
	 * @param req
	 *            The Http request
	 */
	public static void printParameters(HttpServletRequest req) {
		@SuppressWarnings("unchecked")
		Enumeration<String> enumeration = req.getParameterNames();

		while (enumeration.hasMoreElements()) {
			String paramName = enumeration.nextElement().toString();
			String paramValue = req.getParameter(paramName);
			System.out.println("Element : " + paramName + " ------ value : " + paramValue);
		}
		System.out.println(" ------\n ");
	}

	/**
	 * Returns the Parameter values in a Map<String,String>
	 * 
	 * @param req
	 * @return all the parameters as paramName:paramValue
	 */
	public static Map<String, String> convertParameterMap(HttpServletRequest req) {

		Map<String, String> convertedMap = new LinkedHashMap<String, String>();
		@SuppressWarnings("unchecked")
		Enumeration<String> enumeration = req.getParameterNames();

		while (enumeration.hasMoreElements()) {
			String paramName = enumeration.nextElement().toString();
			String paramValue = req.getParameter(paramName);
			convertedMap.put(paramName, paramValue);

		}
		return convertedMap;
	}

	/**
	 * Builds a string faster by the user of the Builders
	 * 
	 * @author William Cornejo
	 * @param objects
	 *            THe Objects
	 * @return A string with all the objects
	 */
	public static String buildString(Object... objects) {
		StringBuilder msg = new StringBuilder();
		for (Object o : objects) {
			msg.append(o.toString());
		}
		return msg.toString();
	}

	/**
	 * Compare of two objects are the same. Currently checks String, Integer and Long objects only
	 * 
	 * @author William Cornejo
	 * @param a
	 * @param b
	 * @return true if a == b.
	 */
	public static boolean areEqual(Object a, Object b) {

		if (a == null && b == null) {
			return true;
		} else if (a instanceof String && b instanceof String) {
			String as = (String) a;
			String bs = (String) b;
			return as.equalsIgnoreCase(bs);
		} else if (a instanceof Integer & b instanceof Integer) {
			return a == b;
		} else if (a instanceof Long && b instanceof Long) {
			return a == b;
		}

		return false;

	}

	/**
	 * Gets the field in correct format, changing the null for empty strings
	 * 
	 * @author William Cornejo
	 * @param field
	 * @return The string if not empty, otherwhise an empty string
	 */
	public static String getField(Object field) {
		if (field == null) {
			return "";
		} else {
			if (field instanceof Date) {
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
				return sdf.format((Date) field);
			} else {
				return field.toString();
			}
		}
	}

	/**
	 * Builds the Div, if needed
	 * 
	 * @author William Cornejo
	 * @param idPrefix
	 *            The prefix
	 * @param idSufix
	 *            The sufix
	 * @param field
	 *            The field
	 * @return A string with DIV well formed
	 */
	public static String buildDiv(String idPrefix, Object idSufix, Object field) {
		StringBuilder dateUpdated = new StringBuilder("<div id='").append(idPrefix).append(idSufix).append("' >").append(getField(field))
				.append("</div>");
		return dateUpdated.toString();
	}

	/**
	 * Builds the Div, if needed
	 * 
	 * @author William Cornejo
	 * @param idPrefix
	 *            The prefix
	 * @param idSufix
	 *            The sufix
	 * @param field
	 *            The field
	 * @return A string with DIV well formed
	 */
	public static String buildInputText(String idPrefix, Object idSufix, Object value) {
		StringBuilder result = new StringBuilder("<input type='text' name='").append(idPrefix).append(idSufix).append("'");
		result.append(" id='").append(idPrefix).append(idSufix).append("'").append(" value='").append(getField(value)).append("' />");
		return result.toString();
	}

	/**
	 * Creates the input text
	 * 
	 * @author William Cornejo
	 * @param onclick
	 *            The onclick js function
	 * @param value
	 *            The value
	 * @return The input text html string
	 */
	public static String buildButton(String onclick, String value) {
		StringBuilder result = new StringBuilder("<button type='button' onclick='").append(onclick).append("' >").append(value)
				.append("</button>");
		return result.toString();
	}

	/**
	 * Get the error field in the correct format
	 * 
	 * @author William Cornejo
	 * @param code
	 *            the code
	 * @return the last part of the string
	 */
	public static String getErrorField(String code) {
		String field[] = code.split("\\.");
		if (field.length > 1) {
			return field[1];
		} else {
			return null;
		}
	}

	public static String getGetterMethodFromFieldName(String fieldName) {
		if (fieldName.length() > 0) {
			return "get" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);
		}
		return null;

	}

	public static List<Object> csvToListOfObjects(String text) {

		return stringToListOfObjects(text, ",");
	}

	public static List<Integer> csvToListOfIntegers(String text) {

		return stringToListOfIntegers(text, ",");
	}

	public static List<Object> stringToListOfObjects(String text, String separator) {
		List<Object> returnList = new ArrayList<Object>();
		if (text == null || text.trim().isEmpty()) {
			return returnList;
		}

		String[] arr = text.split(separator);

		List<String> stringList = Arrays.asList(arr);

		for (String shouldBeInteger : stringList) {
			if (StringUtils.isNumeric(shouldBeInteger)) {
				returnList.add(Integer.valueOf(shouldBeInteger));
			}
		}

		return returnList;

	}

	public static List<Integer> stringToListOfIntegers(String text, String separator) {
		List<Integer> returnList = new ArrayList<Integer>();
		if (text == null || text.trim().isEmpty()) {
			return returnList;
		}

		String[] arr = text.split(separator);

		List<String> stringList = Arrays.asList(arr);

		for (String shouldBeInteger : stringList) {
			if (StringUtils.isNumeric(shouldBeInteger)) {
				returnList.add(Integer.valueOf(shouldBeInteger));
			}
		}

		return returnList;

	}

	/**
	 * Returns a url encoded string.
	 * 
	 * @param map
	 * @return
	 */
	public static String mapToString(Map<String, String> map) {
		StringBuilder stringBuilder = new StringBuilder();

		for (String key : map.keySet()) {
			if (stringBuilder.length() > 0) {
				stringBuilder.append("&");
			}
			String value = map.get(key);
			try {
				stringBuilder.append((key != null ? URLEncoder.encode(key, "UTF-8") : ""));
				stringBuilder.append("=");
				stringBuilder.append(value != null ? URLEncoder.encode(value, "UTF-8") : "");
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException("This method requires UTF-8 encoding support", e);
			}
		}

		return stringBuilder.toString();
	}

	/**
	 * 
	 * @param aDate
	 * @return
	 */
	public static XMLGregorianCalendar dateTimeToXmlGregorianCal(DateTime dateTime) {
		if (dateTime == null) {
			return null;
		}

		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTimeInMillis(dateTime.toLocalDateTime().toDate().getTime());

		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	}

	public static Double bigDecimalToDouble(BigDecimal bigDecimal) {
		if (bigDecimal == null) {
			return null;
		}

		return bigDecimal.doubleValue();
	}

	public static boolean isNumbersOnly(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)))
				return false;
		}
		return true;
	}

	/**
	 * Returns true if value is either null or BigDecimal.ZERO
	 * 
	 * @param value
	 * @return
	 */
	public static boolean nullOrZero(BigDecimal value) {
		if (value == null) {
			return true;
		}
		if (BigDecimal.ZERO.compareTo(value) == 0) {
			return true;
		}
		return false;
	}

}