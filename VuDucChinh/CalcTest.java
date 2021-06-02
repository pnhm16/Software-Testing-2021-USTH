import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalcTest {

    @ParameterizedTest
    @DisplayName("Test of add")
    @MethodSource("calcAddValues")
    public void testAdd(int a, int b, int sum){
        assertEquals(sum, Calc.add(a, b), "Addition Test");
    }


    @ParameterizedTest
    @DisplayName("Test of subtraction")
    @MethodSource("calcSubValues")
    public void testSub(int a, int b, int result){
        assertEquals(result, Calc.sub(a, b),"Subtraction Test");
    }

    @ParameterizedTest
    @DisplayName("Test of multiplication")
    @MethodSource("calcMultiValues")
    public void testMulti(int a, int b, int result){
        assertEquals(result, Calc.multi(a, b),"Multiplication Test");
    }

    @ParameterizedTest
    @DisplayName("Test of division")
    @MethodSource("calcDivValues")
    public void testDiv(float a, float b, float result){
        if (b==0){
            try {
                Calc.div(a, b);
            } catch (ArithmeticException e) {
                return;
            }
        }

        assertEquals(result, Calc.div(a, b),0.01,"Division Test");
    }

    private static Collection<Object[]> calcAddValues()
    {
        return Arrays.asList (new Object [][] {{1, 1, 2}, {2, 3, 5}});
    }

    private static Collection<Object[]> calcSubValues()
    {
        return Arrays.asList (new Object [][] {{4, 1, 3}, {2, 2, 0},{0, 1, -1}});
    }

    private static Collection<Object[]> calcMultiValues()
    {
        return Arrays.asList (new Object [][] {{1, 0, 0}, {-4, -2, 8}, {-4, 1, -4}});
    }

    private static Collection<Object[]> calcDivValues()
    {
        return Arrays.asList(new Object[][] {{6, 2, 3},{1, 0, 0},{2, 3, 0.66f},{1,100000,0.00001f}});
    }
}
