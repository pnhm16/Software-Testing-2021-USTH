```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoundedQueueTest {
    BoundedQueue bQueue;
    @BeforeEach
    void init(){
        bQueue = new BoundedQueue(3);
    }
    @Test
    void enQueue() {
        String qElement = "1";
        this.bQueue.enQueue(qElement);
        assertFalse(bQueue.isEmpty());
    }

    @Test
    void deQueue() {
        String qElement = "1";
        this.bQueue.enQueue(qElement);
        assertEquals(qElement, this.bQueue.deQueue());
    }

    @Test
    void isEmpty() {
        assertTrue(this.bQueue.isEmpty());
    }

    @Test
    void isFull() {
        String qElement1 = "1";
        String qElement2 = "2";
        String qElement3 = "3";
        this.bQueue.enQueue(qElement1);
        this.bQueue.enQueue(qElement2);
        this.bQueue.enQueue(qElement3);
        assertTrue(this.bQueue.isFull());
    }

    @Test
    void testToString() {
        String qElement1 = "1";
        String qElement2 = "2";
        assertEquals("[1,2]", this.bQueue.toString());
    }
}
```