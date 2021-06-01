import java.util.Vector;

public class Exercise_1_4 {
    // a. Write a Java method with signature
    // private static Vector union(Vector a, Vector b)
    private static Vector union (Vector a, Vector b) {
        Vector result = new Vector(a);
        for (Object i: b) {
            if (!a.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    // b. Faults:
    //  1. Vector a and Vector b has 2 different element types
    //  2. The method does not return any values
    //  3. Passing the same Vector

    // c. Test Cases
    private static int checkType(Vector a, Vector b) {
        for (Object obja: a) {
            for (Object objb: b) {
                if (obja.getClass() != objb.getClass()) {
                    System.out.println("Two vectors does not have same type");
                    return 0;
                }
            }
        }
        return 1;
    }

    private static int checkValues(Vector a, Vector b) {
        if (a == b) {
            System.out.println("Two vector are the same");
            return 0;
        }
        return 1;
    }

    // d.Rewrite union Method
    private static Vector union_remake (Vector a, Vector b) {
        if (checkType(a, b) == 0) {
            return new Vector();
        }
        else if (checkValues(a, b) == 0) {
            return a;
        }
        Vector result = new Vector(a);
        for (Object i: b) {
            if (!a.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Vector a = new Vector();
        a.add(1);
        a.add(2);
        a.add(3);

        Vector b = new Vector();
        b.add('3');
        b.add('4');
        b.add('5');

        Vector c = new Vector();
        c.add(1);
        c.add(2);
        c.add(3);

        Vector d = new Vector();
        d.add(3);
        d.add(4);
        d.add(5);

        System.out.println(union(a, b) + "\n");
        System.out.println(union_remake(a, a) +"\n");
        System.out.println(union_remake(a, b) + "\n");
        System.out.println(union_remake(a, c) + "\n");
        System.out.println(union_remake(a, d) + "\n");
    }
}
