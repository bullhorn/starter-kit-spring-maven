package com.client.core.base.util;

import com.google.common.collect.Sets;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UtilityTest {
    @Test
    public void testExtractAssociationFieldsFromParentWorksWithNoNestedFields() {
        Set<String> extracted = Utility.extractAssociationFieldsFromParent(Sets.newHashSet("id", "categories"), "categories");
        assertEquals(extracted, Sets.newHashSet("id"));
    }

    @Test
    public void testExtractAssociationFieldsFromParentWorksWithNestedFields() {
        Set<String> extracted = Utility.extractAssociationFieldsFromParent(Sets.newHashSet("id", "categories(specialties(id,name),id,name)"), "categories");
        assertEquals(extracted, Sets.newHashSet("specialties(id,name)", "id", "name"));
    }

    @Test
    public void testExtractAssociationFieldsFromParentWorksWithMissingFields() {
        Set<String> extracted = Utility.extractAssociationFieldsFromParent(Sets.newHashSet("id", "categories"), "specialties");
        assertEquals(extracted, Sets.newHashSet("id"));
    }
}
