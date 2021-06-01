import java.util.Vector;
// a)
public class Ex4 {
    public static Vector union (Vector a, Vector b){
        Vector c = new Vector();
        c.addAll(a);
        c.addAll(b);
        return c;
    }
    public static void main(String[] args){
        Vector a = new Vector();
        a.add(4);
        Vector b = new Vector();
        b.add(5);
        Vector c = union(a,b);
    }
}

// b)
// There will be fault when the value one of the two vector or even both vector are Null

// c)
public class Ex4 {
    public static Vector union(Vector a, Vector b) {
        Vector c = new Vector();
        c.addAll(a);
        c.addAll(b);
        return c;
    }

    public static void main(String[] args) {
        Vector a = new Vector();
        a.add(4);
        Vector b = new Vector();
        Vector c = union(a, b);
    }
}

// d)
public class Ex4 {
    public static Vector union(Vector a, Vector b) {
        if (a.isEmpty()) {
            System.out.print("Vector a is Null");
        } else if (b.isEmpty()) {
            System.out.print("Vector b is Null");
        } else {
            Vector c = new Vector();
            c.addAll(a);
            c.addAll(b);
            return c;
        }
    }

    public static void main(String[] args) {
        Vector a = new Vector();
        a.add(4);
        Vector b = new Vector();
        b.add(5);
        Vector c = union(a, b);
    }
}