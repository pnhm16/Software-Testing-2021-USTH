package chapter1.exercise7.part2;

// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1; page ??
// JUnit to exercise java.math.BigDecimal class

import static org.junit.Assert.*;

import org.junit.*;

import java.util.*;
import java.math.*;

public class BigDecimalTest {
    private BigDecimal x;
    private BigDecimal y;

    Set<BigDecimal> tree;
    Set<BigDecimal> hash;

    @Before
    public void setUp() {
        x = new BigDecimal("1.01");
        y = new BigDecimal("1.00");
        // Fact:  !x.equals(y), but x.compareTo(y) == 0

        tree = new TreeSet<>();
        hash = new HashSet<>();
    }


    /**
     * a) Describe: TreeSet using compareTo() so duplicate values are not allowed. Beside, HashSet using
     * equal(). Like the fact is mentioned at setUp() that cause failure.
     * Modification: Using 2 difference values
     * <p>
     * b) Test case 1: With 2 difference values there is no fault to execute.
     * <p>
     * c) Test case 2: Can not, with 2 difference values there is no fault to execute error state.
     * <p>
     * d) Test case 3: Can not, with 2 difference values there is no fault to cause failure.
     * <p>
     * e) Test case 3: First error state
     * - x =1.0, y=1.00
     * - tree.length = 1, hash.length = 2
     * - tree = hash = false
     * <p>
     * e) Test case 4:
     * - Input : x = new BigDecimal("1.01"); y = new BigDecimal("1.00");
     * - Output: Passed
     * - Expected: Passed
     */
    @Test
    public void inconsistentSets() { // this test fails!
        tree.add(x);
        tree.add(y);
        // TreeSet uses compareTo(), so tree now has 1 element

        hash.add(x);
        hash.add(y);
        // HashSet uses equals(), so hash now has 2 elements

        assertEquals(tree, hash);   // hence this assertion cannot possibly be true
    }
}

