# Ex 1.4:
### a)
``` java
import java.util.Vector;

class Vector { 
	public static Vector union(Vector a, Vector b) { 
		Vector v = new Vector(); 
		v.addAll(a); 
		v.addAll(b); 
		return v; 
	} 
	public static void main(String[] arg) { 
		Vector a = new Vector(); 
		a.add(9); 
		Vector b = new Vector(); 
		b.add(5); 
		Vector v = union(a, b); 
	} 
} 
```

### b)
* There has no verification statement to check whether two vectors are empty

### c)

Test case [1]  
Vector a = new Vector()  
Vector b = new Vector()  

Test case [2]  
Vector a = new Vector();  
a.add(9)  
Vector b = new Vector();  

Test case [3]  
Vector a = new Vector();  
Vector b = new Vector();  
b.add(5)  

### d)
```java
public static Vector union(Vector a, Vector b, boolean inv = False)
{
  if (a.isEmpty() && b.isEmpty()) return Null;
  else
  {
    if (inv)
    {
      Vector c = new Vector();
      c.addAll(b);
      c.addAll(a);
      return c;
    }
    else
    {
      Vector c = new Vector();
      c.addAll(a);
      c.addAll(b);
      return c;
    }
  }
}
```