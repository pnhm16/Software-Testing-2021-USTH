package chapter1.exercise7.part1;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CloneTest {
    // this test passes
    @Test public void cloneSuper() {
        Vehicle v = new Vehicle(4);
        Vehicle w = (Vehicle) v.clone();
        assertNotSame(v, w);
        assertEquals(v.getClass(), w.getClass());
        assertTrue(v.equals(w));
    }

    // this test fails!
    @Test public void cloneSub() {
        Truck s = new Truck(4);
        Truck t = (Truck) s.clone();
        assertFalse(s == t);
        assertEquals(s.getClass(), t.getClass());
        assertTrue(s.equals(t));
    }
}
