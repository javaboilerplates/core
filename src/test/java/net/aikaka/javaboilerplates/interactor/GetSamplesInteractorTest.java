package net.aikaka.javaboilerplates.interactor;

import net.aikaka.javaboilerplates.entity.SampleEntity;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GetSamplesInteractorTest {

    private GetSamplesInteractor interactor;

    @Before
    public void before() {
        interactor = new GetSamplesInteractorImpl();
    }

    @Test
    public void testAll() {
        List<SampleEntity> list = interactor.All();
        assertNotNull(list);
        assertTrue(list.size() > 0);
    }

    @Test
    public void testAllByName() {
        List<SampleEntity> list = interactor.AllByName("ka");
        assertNotNull(list);
        assertTrue(list.size() > 0);

        list = interactor.AllByName(null);
        assertNotNull(list);
        assertEquals(list.size(), 0);
    }
}
