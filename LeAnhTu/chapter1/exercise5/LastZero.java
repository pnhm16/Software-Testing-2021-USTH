package chapter1.exercise5;
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1; page 13
// Can be run from command line
// See LastZeroTest.java for JUnit tests

public class LastZero {
    /**
     * a) Describe: Using return statement made program stop whenever if statement is executed. Program is expected
     * to count the last 0 element on the array, not the first 0.
     * Correctness: add count variable for saving i when "if" is true then return count
     * <p>
     * b) Test case 1: The null value for x will result in a NullPointerException before the loop test is run,
     * so no execution of the fault
     * - Input: x = null
     * - Output: NullPointerException
     * - Expected: NullPointerException
     * <p>
     * c) Test case 2: There is no way to execute fault but do not run error state. Because return statement stop
     * program after executed
     * <p>
     * d) Test case 3: The array with only 1 element of zero will run error and fault but not given a failure
     * - Input: x = [1, 0, 1]
     * - Output: 1
     * - Expected: 1
     * <p>
     * e) Test case: in e)
     * - Error state: (x = [1, 0, 1], i = 1, x[i] = 0, "if" is true, PC = return 1;)
     * <p>
     * f) Test case 4: Adding count variable and using count = i instead of return i;
     * - Repaired: as this method lastZero() below
     * - Input: x = [1, 0, 1, 0]
     * - Output: 3
     * - Expected: 3
     *
     * @param args:
     */
    public static void main(String[] args) {
        int[] x = {1, 0, 1};
        System.out.println(lastZero(x));
    }

    /**
     * Find LAST index of zero
     *
     * @param x array to search
     * @return index of last 0 in x; -1 if absent
     * @throws NullPointerException if x is null
     */
    public static int lastZero(int[] x) {
        int count = -1;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                count = i;
            }
        }
        return count;
    }

}