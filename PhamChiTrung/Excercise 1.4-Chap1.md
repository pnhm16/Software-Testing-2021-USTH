# Excercise 1.4 #

## a) Write a Java method with the signature
```Java
import java.util.Vector;

class Vector_test {
    public static Vector union (Vector a, Vector b) {
        Vector v = new Vector();
        v.addAll(a);
        v.addAll(b);
        return v;
    }
    public static void main(String[] args) {
        Vector a = new Vector();
        a.add(10);
        Vector b = new Vector();
        b.add(8);
        Vector v = union(a, b);
    }
}
```

## b) 
One of possible fault is lack of verification statements such as checking the two vectors are empty or have different dimensions.

## c)
```Java
Vector a = new Vector()
Vector b = new Vector()
```
```Java
Vector a = new Vector();
a.add(10)
Vector b = new Vector();
```
```Java
Vector a = new Vector();
Vector b = new Vector();
b.add(8)
```

## d)
```Java
public static Vector union(Vector a, Vector b, boolean inv = False)
{
  if (a.isEmpty() && b.isEmpty()) return Null;
  else
  {
    if (inv)
    {
      Vector v = new Vector();
      v.addAll(b);
      v.addAll(a);
      return v;
    }
    else
    {
      Vector v = new Vector();
      v.addAll(a);
      v.addAll(b);
      return v;
    }
  }
}
```
        