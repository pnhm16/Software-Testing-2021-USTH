import java.lang.*;

public class Exercise_1_5 {
    private static int findLast(int[] x, int y) {
        for (int i=x.length-1; i > -1; i--) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }

    public static int lastZero (int[] x)
    {
        for (int i=x.length-1; i > -1; i--)
        {
            if (x[i] == 0)
            {
                return i;
            }
        }
        return -1;
    }

    private static int countPositive (int[] x)
    {
        int count = 0;
        for (int i=0; i < x.length; i++)
        {
            if (x[i] >= 0)
            {
                count++;
            }
        }
        return count;
    }

    private static int oddOrPos(int[] x)
    {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (Math.abs(x[i])%2 == 1 || x[i] > 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Main Things");
        int[] x0 = {2, 3, 4};
        int y0 = 2;
        System.out.println("Print findLast: " + findLast(x0, y0));
        int[] x1 = {0, 1, 0};
        System.out.println("Print lastZero: " + lastZero(x1));
        int[] x2 = {-4, 2, 0, 2};
        System.out.println("Print countPositive: " + countPositive(x2));
        int[] x3 = {-3, -2, 0, 4, -3};
        System.out.println("Print oddOrPos: " + oddOrPos(x3));
    }
}
