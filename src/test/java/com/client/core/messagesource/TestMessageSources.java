package com.client.core.messagesource;


import java.util.Locale;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;

import com.client.WebBaseTest;

public class TestMessageSources extends WebBaseTest {

    private static final String CORE_PROPERTY_VALUE = "core property";
    private static final String CORE_PROPERTY_VALUE_ES = "propiedad central";
    public static final String CORE_TEST_PROPERTY = "core.test.property";

    @Autowired
    @Qualifier("messageSource")
    private MessageSource messageSource;

    @Test
    public void testCoreProperties() {
        String message = this.getQueryUsingKey(Locale.US);

        Assertions.assertEquals(CORE_PROPERTY_VALUE, message, "resources/messages_en_US.properties was not read into messageSource");
    }

    @Test
    public void testCorePropertiesSpanish() {
        String message = this.getQueryUsingKey(Locale.forLanguageTag("es-ES"));

        Assertions.assertEquals(CORE_PROPERTY_VALUE_ES, message, "resources/messages_es_ES.properties was not read into messageSource");
    }

    private String getQueryUsingKey(Locale locale) {
        return messageSource.getMessage(CORE_TEST_PROPERTY, null, locale);
    }
}
