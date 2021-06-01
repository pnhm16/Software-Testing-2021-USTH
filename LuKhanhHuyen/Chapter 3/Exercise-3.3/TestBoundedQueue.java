package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestBoundedQueue {
    BoundedQueue queue = new BoundedQueue(3);

    @Test
    public void testEmptyQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testEnqueue() {
        String str = "Hello, I am Huyen";
        queue.enQueue(str);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testDequeue() {
        String str = "Hello, I am Huyen";
        queue.enQueue(str);
        assertEquals(str, queue.deQueue());
    }

    @Test
    public void testFullQueue() {
        String a, b, c;
        a = "Lu";
        b = "Khanh";
        c = "Huyen";

        queue.enQueue(a);
        queue.enQueue(b);
        assertFalse(queue.isFull());

        queue.enQueue(c);
        assertTrue(queue.isFull());
    }

    @Test
    public void testToString() {
        String a, b, c;
        a = "Lu";
        b = "Khanh";
        c = "Huyen";

        queue.enQueue(a);
        queue.enQueue(b);
        queue.enQueue(c);

        assertEquals("[Lu, Khanh, Huyen]", queue.toString());
    }

}
