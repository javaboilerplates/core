package net.aikaka.javaboilerplates.core.interactor;

import net.aikaka.javaboilerplates.core.entity.SampleEntity;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GetSamplesInteractorImplTest {

    private GetSamplesInteractorImpl interactor;

    @Before
    public void before() {
        interactor = new GetSamplesInteractorImpl();
    }

    @Test
    public void testGetSamples() {
        List<SampleEntity> list = interactor.getSamples();
        assertNotNull(list);
        assertTrue(list.size() > 0);
    }

    @Test
    public void testSetSamples() {
        interactor.setSamples(new ArrayList<>());
        List<SampleEntity> list = interactor.getSamples();
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    public void testConstructor() {
        interactor = new GetSamplesInteractorImpl(new ArrayList<>());
        List<SampleEntity> list = interactor.getSamples();
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    public void testAll() {
        List<SampleEntity> list = interactor.all();
        assertNotNull(list);
        assertTrue(list.size() > 0);
    }

    @Test
    public void testAllByName() {
        List<SampleEntity> list = interactor.allByName("ka");
        assertNotNull(list);
        assertTrue(list.size() > 0);

        list = interactor.allByName(null);
        assertNotNull(list);
        assertEquals(0, list.size());
    }
}
