package com.kazurayam.study.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaterialTest {

    private Material material;

    @BeforeEach
    public void beforeEach() {
        material = new Material("a1", "A1");
    }

    @Test
    public void test_toJson() {
        assertEquals(
                "{\"id\":\"a1\",\"content\":\"A1\"}",
                material.toJson());
    }

    @Test
    public void test_constructor_from_json() {
        Material newOne = new Material(material.toJson());
        assertEquals(material.getId(), newOne.getId());
        assertEquals(material.getContent(), newOne.getContent());
    }

    @Test
    public void test_equals() {
        Material newOne = new Material("a1", "A1");
        assertTrue(newOne.equals(material));
    }
}
