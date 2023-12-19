package com.client.core.base.tools.entitychanger.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.google.common.collect.ImmutableMap;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class StandardEntityChangerTest {
    private Candidate candidate;
    private Candidate emptyCandidate;
    private TestBullhornEntity testBullhornEntity;
    private NoAdditionalProperties noAdditionalProperties;

    @BeforeEach
    public void setUp() {
        candidate = new Candidate(1);
        candidate.setAddress(makeAddress());
        candidate.setOwner(new CorporateUser(1));
        candidate.setFirstName("Test");
        candidate.setLastName("Tester");
        candidate.setIsDeleted(true);
        candidate.setDateOfBirth(new DateTime(1999, 3, 10, 10, 30));

        emptyCandidate = new Candidate();

        testBullhornEntity = new TestBullhornEntity();
        noAdditionalProperties = new NoAdditionalProperties();
    }

    private Address makeAddress() {
        Address address = new Address();
        address.setAddress1("Test Address 1");

        return address;
    }

    @Test
    public void retrievesPrimitiveType() {
        EntityChanger entityChanger = new StandardEntityChanger();
        String firstName = entityChanger.retrieveField(candidate, "firstName", String.class);
        assertEquals("Test", firstName);
    }

    @Test
    public void retrievesFieldsAndCastsToCorrectType() {
        EntityChanger entityChanger = new StandardEntityChanger();
        Object object = entityChanger.retrieveField(candidate, "address", Address.class);
        assertEquals(Address.class, object.getClass());
    }

    @Test
    public void retrievesBullhornEntityField() {
        EntityChanger entityChanger = new StandardEntityChanger();
        CorporateUser corporateUser = entityChanger.retrieveField(candidate, "owner", CorporateUser.class);
        assertEquals((Integer) 1, corporateUser.getId());
    }

    @Test
    public void retrievesNestedField() {
        EntityChanger entityChanger = new StandardEntityChanger();
        String address1 = entityChanger.retrieveField(candidate, "address.address1", String.class);
        assertEquals("Test Address 1", address1);
    }

    @Test
    public void retrievesBoolean() {
        EntityChanger entityChanger = new StandardEntityChanger();
        Boolean isDeleted = entityChanger.retrieveField(candidate, "isDeleted", Boolean.class);
        assertTrue(isDeleted);
    }

    @Test
    public void retrievesInteger() {
        EntityChanger entityChanger = new StandardEntityChanger();
        Integer id = entityChanger.retrieveField(candidate, "id", Integer.class);
        assertEquals((Integer) 1, id);
    }

    @Test
    public void retrievesDateTime() {
        EntityChanger entityChanger = new StandardEntityChanger();
        DateTime dateOfBirth = entityChanger.retrieveField(candidate, "dateOfBirth", DateTime.class);
        assertEquals(1999, dateOfBirth.getYear());
    }

    @Test
    public void failsToRetrieveIfTypeIsUnsupported() {
        EntityChanger entityChanger = new StandardEntityChanger();
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                entityChanger.retrieveField(candidate, "address", Map.class)
        );
    }

    @Test
    public void setsStringField() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(emptyCandidate, "firstName", "Test");
        assertEquals("Test", emptyCandidate.getFirstName());
    }

    @Test
    public void setsIntegerField() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(emptyCandidate, "id", 1);
        assertEquals((Integer) 1, emptyCandidate.getId());
    }

    @Test
    public void setsIntegerFieldFromString() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(emptyCandidate, "id", 1);
        assertEquals((Integer) 1, emptyCandidate.getId());
    }


    @Test
    public void setsNestedFieldInBullhornEntity() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(emptyCandidate, "owner.id", 1);
        assertEquals((Integer) 1, emptyCandidate.getOwner().getId());
    }

    @Test
    public void setsIdInBullhornEntity() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(emptyCandidate, "owner", 2);
        assertEquals((Integer) 2, emptyCandidate.getOwner().getId());
    }

    @Test
    public void setsNestedFieldInValueObject() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(emptyCandidate, "owner.id", 1);
        entityChanger.setField(emptyCandidate, "address.address1", "Test Address");
        assertEquals("Test Address", emptyCandidate.getAddress().getAddress1());
    }

    @Test
    public void setsComplexMap() {
        EntityChanger entityChanger = new StandardEntityChanger();
        Map<String, Object> category = ImmutableMap.<String, Object>builder().put("id", 1).put("name", "Test Category").build();
        entityChanger.setField(emptyCandidate, "category", category);
        assertNotNull(emptyCandidate.getCategory());
        assertEquals((Integer) 1, emptyCandidate.getCategory().getId());
        assertEquals("Test Category", emptyCandidate.getCategory().getName());
    }

    @Test
    public void setsDateTimeFromTimestamp() {
        EntityChanger entityChanger = new StandardEntityChanger();
        // 1670355681 = Tuesday, December 6, 2022 7:41:21 PM
        entityChanger.setField(emptyCandidate, "dateOfBirth", 1670355681000L);
        assertEquals(2022, emptyCandidate.getDateOfBirth().getYear());
        assertEquals(12, emptyCandidate.getDateOfBirth().getMonthOfYear());
        assertEquals(6, emptyCandidate.getDateOfBirth().getDayOfMonth());
    }

    @Test
    public void setsBooleanField() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(emptyCandidate, "isDeleted", true);
        assertTrue(emptyCandidate.getIsDeleted());
    }

    @Test
    public void setsBooleanFieldFromString() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(emptyCandidate, "isDeleted", "true");
        assertTrue(emptyCandidate.getIsDeleted());
    }

    @Test
    public void setsBigDecimalField() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(emptyCandidate, "dayRate", 5d);
        assertEquals(BigDecimal.valueOf(5), emptyCandidate.getDayRate());
    }

    @Test
    public void setsNullValues() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(candidate, "firstName", null);
        entityChanger.setField(candidate, "lastName", null);
        entityChanger.setField(candidate, "owner", null);
        entityChanger.setField(candidate, "address", null);

        assertNull(candidate.getFirstName());
        assertNull(candidate.getLastName());
        assertNull(candidate.getOwner());
        assertNull(candidate.getAddress());
    }

    @Test
    public void setsNullNestedValues() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(candidate, "address.address1", null);
        assertNull(candidate.getAddress().getAddress1());
    }

    @Test
    public void returnsNullIfPropertyDoesNotExist() {
        EntityChanger entityChanger = new StandardEntityChanger();
        Object prop = entityChanger.retrieveField(candidate, "thisPropDoesntExist");
        assertNull(prop);
    }

    @Test
    public void returnsNullIfNoReadMethod() {
        EntityChanger entityChanger = new StandardEntityChanger();
        Object prop = entityChanger.retrieveField(testBullhornEntity, "fieldWithNoGetter");
        assertNull(prop);
    }

    @Test
    public void setValueFailsIfPropertyDoesNotExistAndEntityDoesntHaveAdditionalProperties() {
        EntityChanger entityChanger = new StandardEntityChanger();
        Assertions.assertThrows(RuntimeException.class, () ->
                entityChanger.setField(noAdditionalProperties, "thisPropertyDoesNotExist", "customValue")
        );
    }

    @Test
    public void setValueFailsIfPropertyHasNoWriteMethod() {
        EntityChanger entityChanger = new StandardEntityChanger();
        Assertions.assertThrows(RuntimeException.class, () ->
                entityChanger.setField(testBullhornEntity, "fieldWithNoSetter", "customValue")
        );
    }

    @Test
    public void setValueFailsIfIntermediaryPropertyDoesntExist() {
        EntityChanger entityChanger = new StandardEntityChanger();
        Assertions.assertThrows(RuntimeException.class, () ->
                entityChanger.setField(testBullhornEntity, "fieldWithNoGetter.length", 50)
        );
    }

    @Test
    public void setFieldAddsUnknownPropertiesToAdditionalPropertiesIfPossible() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(candidate, "candidateMissingField", "Test Value");
        assertEquals("Test Value", candidate.getAdditionalProperties().get("candidateMissingField"));
    }

    @Test
    public void setFieldAddsUnknownRelationshipToAdditionalPropertiesIfPossible() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(candidate, "missingRelation", Map.of("id", 10));
        assertEquals(10, ((Map) candidate.getAdditionalProperties().get("missingRelation")).get("id"));
    }

    @Test
    public void setFieldCastsIntegerToString() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(candidate, "customText1", 10);
        assertEquals(candidate.getCustomText1(), "10");
    }

    @Test
    public void setFieldCastsDoubleToString() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(candidate, "customText1", 10.5d);
        assertEquals(candidate.getCustomText1(), "10.5");
    }

    @Test
    public void setFieldSavesFailedCastsToAdditionalPropertiesIfAvailable() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(testBullhornEntity, "simpleStringContainer", "Test");
        assertEquals("Test", testBullhornEntity.getAdditionalProperties().get("simpleStringContainer"));
    }

    @Test
    public void setFieldSavesUnknownPropertiesOfNestedEntitiesToAdditionalPropertiesIfAvailable() {
        EntityChanger entityChanger = new StandardEntityChanger();
        ImmutableMap<Object, Object> map = ImmutableMap.builder()
                .put("id", "Test").build();
        entityChanger.setField(testBullhornEntity, "simpleStringContainer", map);
        assertNotNull(testBullhornEntity.getSimpleStringContainer());
        assertEquals("Test", testBullhornEntity.getSimpleStringContainer().getAdditionalProperties().get("id"));
    }

    @Test
    public void setFieldSavesUnknownNestedEntityPropertiesToAdditionalPropertiesIfAvailable() {
        EntityChanger entityChanger = new StandardEntityChanger();
        entityChanger.setField(testBullhornEntity, "simpleStringContainer.unknown", "Test");
        assertNotNull(testBullhornEntity.getSimpleStringContainer());
        assertEquals("Test", testBullhornEntity.getSimpleStringContainer().getAdditionalProperties().get("unknown"));
    }

    @SuppressWarnings("ALL")
    static class TestBullhornEntity extends AbstractEntity implements BullhornEntity {
        private Integer id;
        private String fieldWithNoGetter;
        private String fieldWithNoSetter = "value";

        private String invisibleProperty;
        private SimpleStringContainer simpleStringContainer;
        @Override
        public Integer getId() {
            return this.id;
        }

        @Override
        public void setId(Integer id) {
            this.id = id;
        }

        public void setFieldWithNoGetter(String value) {
            fieldWithNoGetter = value;
        }

        public String getFieldWithNoSetter() {
            return fieldWithNoSetter;
        }

        private String getInvisibleProperty() {
            return invisibleProperty;
        }

        private void setInvisibleProperty(String invisibleProperty) {
            this.invisibleProperty = invisibleProperty;
        }

        public SimpleStringContainer getSimpleStringContainer() {
            return simpleStringContainer;
        }

        public void setSimpleStringContainer(SimpleStringContainer simpleStringContainer) {
            this.simpleStringContainer = simpleStringContainer;
        }
    }

    @Data
    static class NoAdditionalProperties {
        String property;
    }
    @EqualsAndHashCode(callSuper = true)
    @Data
    @NoArgsConstructor
    static class SimpleStringContainer extends AbstractEntity {
        String string;
    }
}
