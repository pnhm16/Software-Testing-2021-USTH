package chapter1.exercise7.part1;

import static org.junit.Assert.*;

import org.junit.*;

import java.util.*;

public class CloneTest {
    // this test passes
    @Test
    public void cloneSuper() {
        Vehicle v = new Vehicle(4);
        Vehicle w = (Vehicle) v.clone();
        assertNotSame(v, w);
        assertEquals(v.getClass(), w.getClass());
        assertEquals(v, w);
    }


    /**
     * a) Describe: Down casting can not be finish when object casted is not instance of super object.
     * Modification: using if (instance of) to avoid ClassCastException or rewrite Truck's clone method
     * <p>
     * b) Test case 1: Can not execute an test case without fault. Because class Truck is not an instance
     * of class Truck
     * <p>
     * c) Test case 2: Can not execute an test case without errors. Because class Truck is not an instance
     * of class Truck
     * <p>
     * d) Test case 3: Can not execute an test case without failure. Because class Truck is not an instance
     * of class Truck
     * e) Test case 3: The first error state:
     * - Object result
     * - (Truck) Object result (ClassCastException)
     * <p>
     * f) Repair: Creating a new method name cloneRewrite at Truck class
     * - Output: Passed
     * - Expected: Passed
     */
    @Test
    public void cloneSub() {
        Truck s = new Truck(5);
        Truck t = (Truck) s.cloneRewrite();
        assertNotSame(s, t);
        assertEquals(s.getClass(), t.getClass());
        assertEquals(s, t);
    }
}
