package net.aikaka.javaboilerplates.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
