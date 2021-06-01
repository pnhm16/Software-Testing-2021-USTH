package chapter1.exercise5;// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1; page 13
// Can be run from command line
// See FindLastTest.java for JUnit tests

public class FindLast {
    /**
     * a) Describe: i variable must run in range (0, length). Given (1, length)
     * Correctness: for (int i = x.length - 1; i >= 0; i--)
     * <p>
     * b) Test case 1: The null value for x will result in a NullPointerException before the loop test is run,
     * so no execution of the fault
     * - Input: x = null, y = 2
     * - Output: NullPointerException
     * - Expected: NullPointerException
     * <p>
     * c) Test case 2: When ever x is not at position 0 of x hence no error executed, but fault is the for loop still run
     * - Input: x = [2, 3, 5], y = 5
     * - Output: 2
     * - Expected: 2
     * <p>
     * d) Test case 3: If y does not in x. Error is executed but not give an failure result
     * - Input: x = [2, 3, 5], y = 0
     * - Output: -1
     * - Expected: -1
     * <p>
     * e) Test case: in d)
     * - State: (x = [2, 3, 5], y = 0, i = 0; PC = return -1;)
     * <p>
     * f) Test case 4: after repair fault into for (int i = x.length - 1; i >= 0; i--)
     * - Input: x = [2, 3, 5], y = 2
     * - Output: 0
     * - Expected: 0
     *
     * @param args:
     */
    public static void main(String[] args) {
        int[] x = {2, 3, 5};
        var y = 2;
        System.out.println(findLast(x, y));
    }

    /**
     * Find last index of element
     *
     * @param x array to search
     * @param y value to look for
     * @return last index of y in x; -1 if absent
     * @throws NullPointerException if x is null
     */
    public static int findLast(int[] x, int y) {
        // As the example in the book points out, this loop should end at 0.
        // did not correct yet
        for (int i = x.length - 1; i > 0; i--) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }
}