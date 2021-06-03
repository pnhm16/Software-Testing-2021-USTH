import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BoundedQueueTest {

    BoundedQueue test;

    @BeforeEach
    public void setup(){
        test = new BoundedQueue(4);
    }


    @Test
    @DisplayName("Test of enQueue")
    public void testEnQueue() {
        System.out.println("enQueue()");
        Object o = 1;
        Object y = 2;
        test.enQueue(o);
        test.enQueue(y);

        assertEquals(test.toString(), "[1, 2]");
    }

    @Test
    @DisplayName("test of deQueue")
    public void testDeQueue (){
        System.out.println("deQueue()");
        Object o = 1;
        Object y = 2;

        test.enQueue(o);
        test.enQueue(y);
        test.deQueue();

        assertEquals(test.toString(), "[2]");
    }

    @Test
    @DisplayName("Test of isEmpty")
    public void testIsEmpty(){
        System.out.println("isEmpty()");
        test.isEmpty();

        assertTrue(test.isEmpty(),"The Method is true");

    }

    @Test
    @DisplayName("Test of isFul")
    public void testIsFul(){
        System.out.println("isFul()");

        Object o = 1;
        Object y = 2;
        Object x = 3;
        Object z = 4;

        test.enQueue(o);
        test.enQueue(y);
        test.enQueue(x);
        test.enQueue(z);

        assertTrue(test.isFull(),"The Method is true");
    }

    @Test
    @DisplayName("Test of toString")
    public void testToString(){
        System.out.println("toString()");

        Object o = 1;
        Object y = 2;
        Object x = 3;
        Object z = 4;

        test.enQueue(x);
        test.enQueue(y);
        test.enQueue(z);
        test.enQueue(o);

        assertEquals(test.toString(),"[3, 2, 4, 1]");
    }
}