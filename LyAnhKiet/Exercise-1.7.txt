Exercise 1.7

a)
#### Vehicle.java, Truck.java, CloneTest.java

- The fault is in method Truck.clone(). One of possible modification is:
```Java
@Override public Object clone() {
      Object result = new Vehicle(this.y);
      return result;
   }
```

#### BigDecimalTest.java
 The fault in is the inconsistency between methods compareTo() and equals(). One of possible modification is:  
 - Override one of them  
 - Overide methods in HashSet or TreeSet  

#### Point.java, ColorPoint.java, PointTest.java 
The fault in is the inconsistency between superclass and subclass. One of possible modification is:  
 - Write same.

b)

- Test case, which does not execute the fault in (Vehicle.java, Truck.java, CloneTest.java), does not uses Truck.equals()

- No test case that can not execute the fault in (BigDecimalTest.java)

- No test case that can not execute the fault in (Point.java, ColorPoint.java, PointTest.java)

c)

- Test case, which does execute the fault in (Vehicle.java, Truck.java, CloneTest.java) and does not create result in an error state, does not test subclass

- Test case, which does execute the fault in (BigDecimalTest.java) and does not create result in an error state, test with 1.00 and 2.00

- No test case that can execute the fault in (Point.java, ColorPoint.java, PointTest.java) and does not create result in an error state

