package com.client.core.workers;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.concurrent.Callable;

import org.springframework.test.web.servlet.MockMvc;

import com.client.core.base.tools.web.MediaTypes;

public class DataTablesEditWorker implements Callable<Boolean> {

	private final MockMvc mockMvc;
	private final String url;
	private final Integer columnPosition;
	private final String prettyValue;
	private final String servletPath;
	private final String entityId;

	public DataTablesEditWorker(MockMvc mockMvc, String url, Integer columnPosition, String prettyValue, String servletPath, String entityId) {
		super();
		this.mockMvc = mockMvc;
		this.url = url;
		this.columnPosition = columnPosition;
		this.prettyValue = prettyValue;
		this.servletPath = servletPath;
		this.entityId = entityId;
	}

	@Override
	public Boolean call() throws Exception {
		mockMvc.perform(
				post(url).servletPath(servletPath).param("id", entityId).param("columnPosition", "" + columnPosition)
						.param("value", prettyValue)).andExpect(status().isOk())
				.andExpect(content().contentType(MediaTypes.JSON)).andExpect(content().string(equalTo(prettyValue)));

		return Boolean.TRUE;
	}

}
