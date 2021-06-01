package chapter1.exercise5;
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1, page 13
// Can be run from command line
// See CountPositveTest.java for JUnit tests

public class CountPositive {
    /**
     * a) Describe: 0 is not positive or negative number. Give fault at "if"
     * Correctness: if (x[i] > 0)
     * <p>
     * b) Test case 1: The all negative and the null value of array x will not result "if", so not given a fault
     * - Input: x = null
     * - Output: NullPointerException
     * - Expected: NullPointerException
     * <p>
     * c) Test case 2: The positive but none zero will execute fault but not give a error state
     * - Input: x = [1, 2]
     * - Output: 2
     * - Expected: 2
     * <p>
     * d) Test case 3: There is no case that result an error but not a failure. Because "if" is executed mean count
     * does not correct anymore.
     * <p>
     * e) Test case 3:
     * - Input: x = [1, 2, 0]
     * - Output: 3
     * - Expected: 2
     * - Error state:
     * i = 2, x[i] = 0, count = 2
     * "if" is true
     * return count = 3 (error)
     * <p>
     * f) Test case 4: Edit if (x[i] >= 0) statement into if (x[i] > 0)
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] x = {-4, 2, 0, 2};
        System.out.println(countPositive(x));
    }

    /**
     * Counts positive elements in array
     *
     * @param x array to search
     * @return number of positive elements in x
     * @throws NullPointerException if x is null
     */
    public static int countPositive(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= 0) {
                count++;
            }
        }
        return count;
    }
    // test:  x=[-4, 2, 0, 2]
    // Expected = 2
}