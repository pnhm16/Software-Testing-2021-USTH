package chapter1.exercise5;
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1; page 13
// Can be run from command line
// See OddOrPosTest.java for JUnit tests

public class OddOrPos {
    /**
     * a) Describe: count of odd or positive elements in x, if x is both positive and odd return 2
     * Correctness: Instead of 1 "if", it should be divided into 2 as odd
     * <p>
     * b) Test case 1: The null value for x will result in a NullPointerException before the loop test is run,
     * so no execution of the fault
     * - Input: x = null
     * - Output: NullPointerException
     * - Expected: NullPointerException
     * <p>
     * c) Test case 2: The x values is only even number or just only 0
     * - Input: x = [0]
     * - Output: 0
     * - Expected: 0
     * <p>
     * d) Test case 3: There is no case that result an error but not a failure. Because "if" is executed mean count
     * does not correct anymore.
     * <p>
     * e) Test case: in d)
     * - Input: x = [-1, 2, 3]
     * - Output: 2
     * - Expected: 3
     * - Error state:
     * count = 0, i = 1, x[i] = 2
     * "if" is true
     * count = 1 (error)
     * <p>
     * f) Test case 4: As oddOrPos() method below
     * - Input: x = [-1, 2, 3]
     * - Output: 3
     * - Expected: 3
     *
     * @param args:
     */
    public static void main(String[] args) {
        int[] x = {-1, 2, 3};
        System.out.println(oddOrPos(x));
    }

    /**
     * Count odd or positive elements in an array
     *
     * @param x array to search
     * @return count of odd or positive elements in x
     * @throws NullPointerException if x is null
     */
    public static int oddOrPos(int[] x) {
        // Effects:  if x is null throw NullPointerException
        // else return the number of elements in x that
        // Are either odd or positive (or both)
        int count = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 1) {
                count++;
            }
            if (x[i] > 0) {
                count++;
            }
        }
        return count;
    }
    // test:  x=[-3, -2, 0, 1, 4]
    //        Expected = 3
}
