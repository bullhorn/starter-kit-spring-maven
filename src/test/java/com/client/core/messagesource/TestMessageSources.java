package com.client.core.messagesource;

import static org.junit.Assert.assertTrue;

import java.util.Locale;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;

import com.client.WebBaseTest;

public class TestMessageSources extends WebBaseTest {

    private static final String CORE_PROPERTY_VALUE = "core property";

    @Autowired
    @Qualifier("messageSource")
    private MessageSource messageSource;

    @Test
    public void testCoreProperties() {
        String message = this.getQueryUsingKey("core.test.property");

        assertTrue("resources/messages_en_US.properties was not read into messageSource", CORE_PROPERTY_VALUE.equals(message));
    }

    private String getQueryUsingKey(String key) {

        String property = messageSource.getMessage(key, null, Locale.US);
        return property;
    }
}
