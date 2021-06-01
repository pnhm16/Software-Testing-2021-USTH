import java.util.Vector;
import java.lang.*;


public class Excercise {
    public static Vector<Integer> union (Vector<Integer> a, Vector<Integer> b) {
        for (Integer obj : b) {
            if (!a.contains(obj)) {
                a.add(obj);
            }
        }
        return a;
    }

    public static int finLast(int[] x, int y)
    {
        for (int i = x.length - 1;i>=0;i--)
            if (x[i] == y)
            {
                return i;
            }
        return -1;
    }

    public  static int lastZero (int[]x)
    {
        for (int i = x.length - 1;i>=0;i--)
        {
            if (x[i]==0)
            {
                return i;
            }
        }
        return -1;
    }


    public static int countPositive(int[]x)
    {
        int count = 0;
        for (int i = 0;i < x.length;i++)
        {
            if (x[i] > 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int oddOrPos(int[]x)
    {
        int count = 0;
        for(int i = 0;i < x.length;i++)
        {
            if (Math.abs(x[i]%2)==1 || x[i] > 0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main (String[] args){
        int[] x = {2,3,5};
        int y = 2;
        System.out.println("finLast method result :"+finLast(x , y));

        int[] zero = {0,2,0};
        System.out.println("lastZero method result :"+lastZero(zero));

        int[] pos = {-4,2,0,2};
        System.out.println("countPositive method result :"+countPositive(pos));

        int[] oddOrPos = {-3,-2,0,1,4};
        System.out.println("oddOrPos method result :"+oddOrPos(oddOrPos));

        int n = 6;
        int m = 8;
        Vector<Integer> b = new Vector<>(n);
        for (int i = 1; i <= n; i++) {
            b.add(i);
        }
        Vector<Integer> c = new Vector<>();
        for (int i = 1; i <= m; i++) {
            c.add(i);
        }
        System.out.println(union(b,c));
    }
}