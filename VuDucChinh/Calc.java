public class Calc
{
    static public int add (int a, int b)
    {
        return a + b;
    }

    public static int sub(int a, int b)
    {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }


    public static float div(float a, float b) {
        if (b==0){
            throw new ArithmeticException("divide by zero");
        }
        else {
            return a / b;
        }
    }
}
