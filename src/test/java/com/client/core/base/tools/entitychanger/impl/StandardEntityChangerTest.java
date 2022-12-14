package com.client.core.base.tools.entitychanger.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.Assert.*;

public class StandardEntityChangerTest {


    @Test
    public void retrieveField() {
        EntityChanger entityChanger = new StandardEntityChanger();
        // set up
        Candidate candidate = new Candidate(1);
        Address address = new Address();
        address.setAddress1("Test Address 1");
        candidate.setFirstName("Test");
        candidate.setAddress(address);
        candidate.setOwner(new CorporateUser(1));
        // assert basic field
        String firstName = entityChanger.retrieveField(candidate, "firstName", String.class);
        assertEquals("Test", firstName);
        // assert nested field is preserved
        String address1 = entityChanger.retrieveField(candidate, "address.address1", String.class);
        assertEquals("Test Address 1", address1);
        // assert value object is cast properly
        Object object = entityChanger.retrieveField(candidate, "address", Address.class);
        assertEquals(Address.class, object.getClass());
        // assert BullhornEntity conversion
        CorporateUser corporateUser = entityChanger.retrieveField(candidate, "owner", CorporateUser.class);
        assertEquals((Integer) 1, corporateUser.getId());
    }

    @Test
    public void setField() {
        EntityChanger entityChanger = new StandardEntityChanger();
        // set up
        Candidate candidate = new Candidate();
        entityChanger.setField(candidate, "firstName", "Test");
        entityChanger.setField(candidate, "owner.id", 1);
        entityChanger.setField(candidate, "address.address1", "Test Address");
        // assert sets basic property
        assertEquals("Test", candidate.getFirstName());
        // assert sets nested bh entity
        assertEquals((Integer) 1, candidate.getOwner().getId());
        // assert sets nested value object
        assertEquals("Test Address", candidate.getAddress().getAddress1());
        // assert sets complex map
        Map<String, Object> category = ImmutableMap.<String, Object>builder()
                .put("id", 1)
                .put("name", "Test Category")
                .build();
        entityChanger.setField(candidate, "category", category);
        assertNotNull(candidate.getCategory());
        assertEquals((Integer) 1, candidate.getCategory().getId());
        assertEquals("Test Category", candidate.getCategory().getName());
        // assert DateTime
        // 1670355681 = Tuesday, December 6, 2022 7:41:21 PM
        entityChanger.setField(candidate, "dateOfBirth", 1670355681000L);
        assertEquals(2022, candidate.getDateOfBirth().getYear());
        assertEquals(12, candidate.getDateOfBirth().getMonthOfYear());
        assertEquals(6, candidate.getDateOfBirth().getDayOfMonth());
        // assert Boolean
        entityChanger.setField(candidate, "isDeleted", true );
        assertTrue(candidate.getIsDeleted());
        // assert BigDecimal
        entityChanger.setField(candidate, "dayRate", 5d);
        assertEquals(BigDecimal.valueOf(5), candidate.getDayRate());

        // assert null values
        entityChanger.setField(candidate, "firstName", null);
        entityChanger.setField(candidate, "owner.id", null);
        entityChanger.setField(candidate, "address.address1", null);
        entityChanger.setField(candidate, "category", null);
        entityChanger.setField(candidate, "dateOfBirth", null);
        entityChanger.setField(candidate, "isDeleted", null);
        entityChanger.setField(candidate, "dayRate", null);

        assertNull(candidate.getFirstName());
        assertNull(candidate.getOwner().getId());
        assertNull(candidate.getAddress().getAddress1());
        assertNull(candidate.getCategory());
        assertNull(candidate.getDateOfBirth());
        assertNull(candidate.getIsDeleted());
        assertNull(candidate.getDayRate());
    }
}
