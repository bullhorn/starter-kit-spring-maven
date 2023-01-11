package com.client.core.base.tools.web;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionResolver extends SimpleMappingExceptionResolver {

    private final Logger log = Logger .getLogger(getClass());

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		log.error("An Exception has occured in the application", ex);
		log.error(ex.getMessage());

		response.setStatus(HttpStatus.BAD_REQUEST.value());

		return super.doResolveException(request, response, handler, ex);
	}

}
