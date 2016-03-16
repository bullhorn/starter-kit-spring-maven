package com.client.matchers;

import java.io.UnsupportedEncodingException;
import org.apache.commons.lang3.StringUtils;
import org.hamcrest.Matcher;
import org.springframework.test.util.JsonPathExpectationsHelper;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * JsonP implementation of JsonPathResultMatchers.
 * 
 * It removes the callback padding from the jsonValue.
 * 
 * Example: callback({ "id" : 1, "name" : "Unassigned 2774" }) will be evaluated as: { "id" : 1, "name" : "Unassigned 2774" }
 * 
 * @author Magnus Fiore Palm
 * 
 */

public class JsonpPathResultMatchers {

	private JsonPathExpectationsHelper jsonPathHelper;

	/**
	 * Protected constructor. Use {@link MockMvcResultMatchers#jsonPath(String, Object...)} or
	 * {@link MockMvcResultMatchers#jsonPath(String, Matcher)}.
	 */
	public JsonpPathResultMatchers(String expression, Object... args) {

		this.jsonPathHelper = new JsonPathExpectationsHelper(expression, args);
	}

	/**
	 * Evaluate the JSONPath and assert the value of the content found with the given Hamcrest {@code Matcher}.
	 */
	public <T> ResultMatcher value(final Matcher<T> matcher) {
		return new ResultMatcher() {
			public void match(MvcResult result) throws Exception {
				String content = getContentWithPaddingRemoved(result);
				jsonPathHelper.assertValue(content, matcher);
			}
		};
	}

	/**
	 * Evaluate the JSONPath and assert the value of the content found.
	 */
	public ResultMatcher value(final Object expectedValue) {
		return new ResultMatcher() {
			public void match(MvcResult result) throws Exception {
				jsonPathHelper.assertValue(getContentWithPaddingRemoved(result), expectedValue);
			}
		};
	}

	/**
	 * Evaluate the JSONPath and assert that content exists.
	 */
	public ResultMatcher exists() {
		return new ResultMatcher() {
			public void match(MvcResult result) throws Exception {
				String content = getContentWithPaddingRemoved(result);
				jsonPathHelper.exists(content);
			}
		};
	}

	/**
	 * Evaluate the JSON path and assert not content was found.
	 */
	public ResultMatcher doesNotExist() {
		return new ResultMatcher() {
			public void match(MvcResult result) throws Exception {
				String content = getContentWithPaddingRemoved(result);
				jsonPathHelper.doesNotExist(content);
			}
		};
	}

	/**
	 * Evluate the JSON path and assert the content found is an array.
	 */
	public ResultMatcher isArray() {
		return new ResultMatcher() {
			public void match(MvcResult result) throws Exception {
				String content = getContentWithPaddingRemoved(result);
				jsonPathHelper.assertValueIsArray(content);
			}
		};
	}

	/**
	 * This is what makes this different from the regular {@link JsonPathResultMatchers}.
	 * 
	 * @param result
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private String getContentWithPaddingRemoved(MvcResult result) throws UnsupportedEncodingException {
		String content = result.getResponse().getContentAsString();

		content = StringUtils.substringAfter(content, "(");

		return StringUtils.substringBeforeLast(content, ")");

	}
}
