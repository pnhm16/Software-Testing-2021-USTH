#### 1.4:
a) code 

import java.util.Vector;
import java.util.ArrayList;
class main{
      public static Vector union(Vector a, Vector b) {
            Vector c= new Vector();
	          c.addAll(a);
	          c.addAll(b);
	          return c;     
      }
	    public static void main(String[] args) {
	          Vector<String> a = new Vector<>();
	          a.add("va");
	          Vector<String> b = new Vector<>();
	          b.add("vb");
	          Vector c = union (a, b)
	    }
	}
	b) It can be fault, because the method name suggests set union, but the argument types suggest otherwise.
	c)
	      var a = new Vector();
        var b = new Vector();
        a.add("name");
        var student = new Student("name", 21);
        b.add(student);
        var c = union(a, b);
	d)
	public static Vector<String> union(Vector<String> a, Vector<String> b){
       Vector<String> vector = new Vector<>();
        vector.addAll(a);
        vector.addAll(b);
        return vector;
	}