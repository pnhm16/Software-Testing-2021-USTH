import junit.framework.JUnit4TestAdapter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoundedQueueTest {
    private BoundedQueue q = new BoundedQueue(5);

    @Before
    public void setUp() {
        q = new BoundedQueue(5);
    }

    @After
    public void tearDown() {
        q = null;
    }

    @Test
    public void testEnqueueToFull() throws NullPointerException, IllegalStateException {
        for (int i = 1; i < 6; i++)
            q.enQueue(i);

        assertEquals("[1, 2, 3, 4, 5]", q.toString());
    }

    @Test
    public void testDequeueToEmpty() throws IllegalStateException {
        for (int i = 1; i < 6; i++)
            q.enQueue(i);

        assertEquals(1, q.deQueue());
        assertEquals(2, q.deQueue());
        assertEquals(3, q.deQueue());
        assertEquals(4, q.deQueue());
        assertEquals(5, q.deQueue());
    }

    @Test(expected = Exception.class)
    public void testEnqueuePastFull() throws NullPointerException, IllegalStateException {
        for (int i = 1; i < 7; i++)
            q.enQueue(i);
    }

    @Test(expected = Exception.class)
    public void testDequeuePastEmpty() throws IllegalStateException {
        for (int i = 1; i < 6; i++)
            q.enQueue(i);

        for (int i = 1; i < 7; i++)
            q.deQueue();
    }

    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(BoundedQueueTest.class);
    }

}