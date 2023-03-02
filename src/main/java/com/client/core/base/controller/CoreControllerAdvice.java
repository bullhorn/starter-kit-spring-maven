package com.client.core.base.controller;

import com.client.ApplicationSettings;
import com.client.core.base.tools.propertyeditors.CustomBigDecimalEditor;
import com.client.core.base.tools.propertyeditors.CustomDateTimeEditor;
import lombok.extern.log4j.Log4j2;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Log4j2
@ControllerAdvice(value = { "com.client.core" })
public class CoreControllerAdvice extends ResponseEntityExceptionHandler {

    private final ApplicationSettings appSettings;

    @Autowired
    CoreControllerAdvice(ApplicationSettings applicationSettings) {
        this.appSettings = applicationSettings;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> prepareException(Exception e, WebRequest request) throws Exception {
        log.error("An error occurred, and was caught by the CoreControllerAdvice.", e);
        return handleException(e,request);
    }

    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        binder.setIgnoreInvalidFields(true);
        binder.setIgnoreUnknownFields(true);

        String applicationDateFormatString = this.appSettings.applicationDateFormat();
        SimpleDateFormat dateFormat = new SimpleDateFormat(applicationDateFormatString);
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
        binder.registerCustomEditor(Integer.class, new CustomNumberEditor(Integer.class, true));
        binder.registerCustomEditor(Boolean.class, new CustomBooleanEditor(true));
        binder.registerCustomEditor(DateTime.class, new CustomDateTimeEditor(applicationDateFormatString, true));
        binder.registerCustomEditor(BigDecimal.class, new CustomBigDecimalEditor(2, true));
    }

}
