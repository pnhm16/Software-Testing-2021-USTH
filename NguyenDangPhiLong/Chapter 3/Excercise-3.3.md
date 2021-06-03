# Ex3.3: 
```java
public class BoundedQueueTest {
    /**
     * Test of enQueue method
     */
    @Test
    public void testEnQueue() {
        System.out.println("Hello World");
        Object o = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);
        
        assertEquals(instance.toString(), "[1]");
    }

    /**
     * Test of deQueue method
     */
    @Test
    public void testDeQueue() {
        System.out.println("Hello World");
        Object o = 1;
        Object a = 2;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);
        instance.enQueue(a);
        instance.deQueue();
        
        assertEquals(instance.toString(), "[2]");
    }

    /**
     * Test of isEmpty method
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");

        BoundedQueue instance = new BoundedQueue(5);

        assertEquals(instance.isEmpty(), true);
    }

    /**
     * Test of isFull method
     */
    @Test
    public void testIsFull() {
        System.out.println("Hello World");
        Object a = 1;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);
        instance.enQueue(a);

        assertEquals(instance.isFull(), true);
    }

    /**
     * Test of toString method
     */
    @Test
    public void testToString() {
        System.out.println("Hello World");
        Object o = 1;
        Object a = 2;
        Object b = 4;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(a);
        instance.enQueue(b);
        instance.enQueue(o);
        assertEquals(instance.toString(), "[2, 4, 1]");
    }
}
```