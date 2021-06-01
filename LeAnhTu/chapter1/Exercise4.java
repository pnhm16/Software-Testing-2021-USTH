package chapter1;

import java.util.Arrays;
import java.util.Vector;

public class Exercise4 {
    /**
     * Test case 1:
     *     public static void main(String[] args) {
     *         Vector<String> a = new Vector<>();
     *         Vector<Integer> b = new Vector<>();
     *         a.add("as");
     *         Vector<Integer> c = union(a, b);
     *         System.out.println(Arrays.toString(c.toArray()));
     *     }
     *     public static Vector union(Vector a, Vector b) {
     *         return a;
     *     }
     *     result: [as]
     *     correctness: incompatible types error
     *
     *
     * Test case 2:
     *      public static void main(String[] args) {
     *         Vector<Integer> a = new Vector<>();
     *         Vector<String> b = new Vector<>();
     *         a.add(1);
     *         b.add("a string");
     *         Vector<Integer> c = union(a, b);
     *         System.out.println(Arrays.toString(c.toArray()));
     *     }
     *     public static Vector union(Vector a, Vector b) {
     *         a.add(b.get(0));
     *         return a;
     *     }
     *     result: [1, a string]
     *     correctness: incompatible types error
     *
     *
     * Test case 3: After rewrite
     *      public static void main(String[] args) {
     *         Vector<Integer> a = new Vector<>();
     *         Vector<Integer> b = new Vector<>();
     *         a.add(1);
     *         b.add(2);
     *         Vector<Integer> c = union(a, b);
     *         System.out.println(Arrays.toString(c.toArray()));
     *     }
     *     public static Vector<Integer> union(Vector<Integer> a, Vector<Integer> b) {
     *         a.add(b.get(0));
     *         return a;
     *     }
     *     result: [1, 2]
     *
     * @param args:
     */
    public static void main(String[] args) {
        Vector<Integer> a = new Vector<>();
        Vector<Integer> b = new Vector<>();
        a.add(1);
        b.add(2);
        Vector<Integer> c = union(a, b);
        System.out.println(Arrays.toString(c.toArray()));
    }

    /**
     * @returntype Vector:
     *      - Fault: public static Vector
     *      - Described: declaring return type is vector object but not declared element types.
     *      - Correct: Vector<E> || E is element types
     * @param a:
     *      - Fault: Vector a
     *      - Described: element types of argument a is not declared.
     *      - Correct: Vector<E> a || E is element types
     * @param b:
     *      - Fault: Vector b
     *      - Described: element types of argument b is not declared.
     *      - Correct: Vector<E> b || E is element types
     * @return a:
     *      - Fault: return a or return b
     *      - Condition: return a Vector of objects that are in either of the two argument Vectors
     *      - Described: Because return type is ambiguous. So this statement can be failure
     *      - Correct: Vector<E> a or Vector<E> b || E is element types
     * @correctness:
     *      - public static Vector<Integer> union(Vector<Integer> a, Vector<Integer> b)
     */
    public static Vector<Integer> union(Vector<Integer> a, Vector<Integer> b) {
        a.add(b.get(0));
        return a;
    }
}
