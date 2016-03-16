package com.client.core;

import org.springframework.context.ApplicationContext;

public class AppContext {
	
	private static ApplicationContext ctx = null;

	public static ApplicationContext getApplicationContext() {
		return ctx;
	}

	public static void setApplicationContext(ApplicationContext ctx) {
		AppContext.ctx = ctx;
	}

}
