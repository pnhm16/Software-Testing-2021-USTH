package chapter1.exercise7.part3;

// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1; page ??
// JUnit for Point.java, ColorPoint.java

import static org.junit.Assert.*;

import org.junit.*;

import java.util.*;

public class PointTest {
    private Point p = new Point(1, 2);
    private ColorPoint cp1 = new ColorPoint(1, 2, Color.RED);
    private ColorPoint cp2 = new ColorPoint(1, 2, Color.BLUE);


    /**
     * this test fails!
     * a) Describe: q and cp1 is in instance relationship because cp1 is child class of p. But cp1 can not is an
     * instance of p because cp1 is child.
     * Modification: assertEquals to assertNotEquals at line 30.
     **/
    @Test
    public void symmetry() {
        System.out.println(p.equals(cp1));
        System.out.println(cp1.equals(p) + "ốp");
        assertNotEquals(p.equals(cp1), cp1.equals(p));
    }

    // this test passes
    @Test
    public void transitivity() {
        if (cp1.equals(p) && p.equals(cp2)) {
            assertEquals(cp1, cp2);
        }
    }
}
