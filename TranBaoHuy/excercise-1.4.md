# excercise 1.4
---

1. Write a Java method with the signature

'''Java
import java.util.Vector;
	
class Vector {
  public static Vector union(Vector x, Vector y)
  {
	Vector v = new Vector();
	v.addAll(x);
	v.addAll(y);
	return v;
  }
  public static void main(String[] arg)
  {
	Vector x = new Vector();
	x.add(1);
	Vector y = new Vector();
	y.add(2);
	Vector v = union(x, y);
  }
}
'''

2. when there are similarity in the two vector it will take both

3. 
''' java
Vector x = new Vector();
	x.add("11"); 
	x.add("a"); 
Vector y = new Vector(); 
	y.add("5");  
'''