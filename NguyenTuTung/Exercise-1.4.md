#EX1.4
import java.util.Vector;
import java.util.ArrayList;
class Vector_Ex4 {
  public static Vector union(Vector va, Vector vb);
  {
    Vector<string> vt = new Vector<string>();
    vt.addAll(va);
    vt.addAll(vb);
    return vt;
  }
  public static void main(String[] arg);
  {
      
    Vector<string> va = new Vector<string>();
    va.add("l");
    va.add("m");
    Vector<string> vb = new Vector<string>();
    vb.add("a");
    vb.add("2");
    vb.add("i");
    
	 vt= union(va,vb)
	
	System.out.println("The Vector is: " + vt);
  }
}
#b, 
when there are similarity in the two vector it will take both.
#c
test case 
Vector<string> va = new Vector<string>();
    va.add("l");
    va.add("m");
Vector<string> vb = new Vector<string>();
    vb.add("l");
    vb.add("2");
    vb.add("i");
#d
import java.util.Vector;
import java.util.ArrayList;
class Vector_Ex4 {
  public static Vector union(Vector va, Vector vb);
  {
    Vector<string> vt = new Vector<string>();
    vt.addAll(va);
	for (int i = 0; i < va.size; i++) 
            for ( int j = 0; j< vb.size; j++){
			        if va(i) == vb(j)
				    remove(vb(j))}
    vt.addAll(vb);
        
    return vt;
  }
