package com.client.core.base.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

import com.client.core.ApplicationSettings;
import com.client.core.base.tools.propertyeditors.CustomBigDecimalEditor;
import com.client.core.base.tools.propertyeditors.CustomDateTimeEditor;
import com.client.core.base.tools.propertyeditors.CustomXMLGregorianCalendarEditor;

@ControllerAdvice(value = { "com.client.core" })
public class CoreControllerAdvice extends ResponseEntityExceptionHandler {

    private static Log log = LogFactory.getLog(CoreControllerAdvice.class);
    
    @Autowired
    @Qualifier("appSettings")
    private ApplicationSettings appSettings;


    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> prepareException(Exception e, WebRequest request) {
        log.error("An error occurred, and was caught by the CoreControllerAdvice.", e);
        return handleException(e,request);
    }
    
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        binder.setIgnoreInvalidFields(true);
        binder.setIgnoreUnknownFields(true);

        String applicationDateFormatString = appSettings.getApplicationDateFormat();
        SimpleDateFormat dateFormat = new SimpleDateFormat(applicationDateFormatString);
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
        binder.registerCustomEditor(Integer.class, new CustomNumberEditor(Integer.class, true));
        binder.registerCustomEditor(Boolean.class, new CustomBooleanEditor(true));
        binder.registerCustomEditor(XMLGregorianCalendar.class, new CustomXMLGregorianCalendarEditor(dateFormat, true));
        binder.registerCustomEditor(DateTime.class, new CustomDateTimeEditor(applicationDateFormatString, true));
        binder.registerCustomEditor(BigDecimal.class, new CustomBigDecimalEditor(2, true));
    }
    
}
