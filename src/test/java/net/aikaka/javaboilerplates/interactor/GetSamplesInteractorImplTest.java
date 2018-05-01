package net.aikaka.javaboilerplates.interactor;

import net.aikaka.javaboilerplates.entity.SampleEntity;
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
        assertEquals(list.size(), 0);
    }

    @Test
    public  void testConstructor() {
        interactor = new GetSamplesInteractorImpl(new ArrayList<>());
        List<SampleEntity> list = interactor.getSamples();
        assertNotNull(list);
        assertEquals(list.size(), 0);
    }
}
