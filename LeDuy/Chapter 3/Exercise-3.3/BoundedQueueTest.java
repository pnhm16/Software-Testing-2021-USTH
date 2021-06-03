import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoundedQueueTest {
    private BoundedQueue value;

    @BeforeEach
    public void init() {
        this.value = new BoundedQueue(3);
    }

    @Test
    public void testEmptyQueue() {
        assertTrue(this.value.isEmpty());
    }

    @Test
    public void testEnqueue() {
        String a = "a";
        this.value.enQueue(1, a);
        assertFalse(value.isEmpty());
    }

    @Test
    public void testDequeue() {
        String a = "a";
        this.value.enQueue(2, a);
        assertEquals(a, this.value.deQueue());
    }

    @Test
    public void testFullQueue() {
        String a, b, c;
        a = "a";
        b = "b";
        c = "c";
        this.value.enQueue(1, a);
        this.value.enQueue(2, b);
        this.value.enQueue(3, c);
        assertTrue(this.value.isFull());
    }

    @Test
    public void testToString() {
        String a, b, c;
        a = "a";
        b = "b";
        c = "c";
        this.value.enQueue(1, a);
        this.value.enQueue(2, b);
        this.value.enQueue(3, c);
        assertEquals("[a, b, c]", this.value.toString());
    }
}
