package net.aikaka.javaboilerplates.core.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleEntityTest {

    private final String DEFAULT_NAME = "AAAAAA";
    private final String SET_NAME = "BBBBBB";

    private SampleEntity sampleEntity;

    @Before
    public void before() {
        sampleEntity = new SampleEntity().name(DEFAULT_NAME);
    }

    @Test
    public void testGetName() {
        assertEquals(sampleEntity.getName(),DEFAULT_NAME);
    }

    @Test
    public void testSetName() {
        sampleEntity.setName(SET_NAME);
        assertEquals(sampleEntity.getName(),SET_NAME);
    }

    @Test
    public void testEqual() {
        boolean result = sampleEntity.equals(new SampleEntity().name(DEFAULT_NAME));
        assertTrue(result);

        result = sampleEntity.equals(sampleEntity);
        assertTrue(result);

        result = sampleEntity.equals(null);
        assertFalse(result);

        result = sampleEntity.equals(new String());
        assertFalse(result);

        result = sampleEntity.equals(new SampleEntity().name(SET_NAME));
        assertFalse(result);
    }

    @Test
    public void testHashCode() {
        assertTrue(sampleEntity.hashCode() > 0);
    }
}
