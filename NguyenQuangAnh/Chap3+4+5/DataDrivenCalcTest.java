import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javax.lang.model.element.TypeElement;

import static org.junit.Assert.*;
import java.util.*;

@RunWith(Parameterized.class)
public class DataDrivenCalcTest {
    public int a, b;
    public float result;
    private Type type;
    enum Type {ADD, SUB, MUL, DIV};

    public DataDrivenCalcTest(Type type, int a, int b, float result) {
        this.type = type;
        this.a = a;
        this.b = b;
        this.result = result;
    }

    @Parameters
    public static Collection<Object[]> addValues() {
        return Arrays.asList(new Object[][] {
                {Type.ADD, 1, 1, 2},
                {Type.ADD, 2, 3, 5},
                {Type.SUB, 5, 3, 2},
                {Type.SUB, 30, 1, 29},
                {Type.MUL, 3, 4, 12},
                {Type.MUL, 7, 5, 35},
                {Type.DIV, 8, 2, 4},
                {Type.DIV, 3, 4, 0}
        });
    }

    @Test
    public void addTest()
    {
        Assume.assumeTrue(type == Type.ADD);
        assertTrue("Addition Test", result == Calc.add(a, b));
    }

    @Test
    public void subTest()
    {
        Assume.assumeTrue(type == Type.SUB);
        assertTrue("Addition Test", result == Calc.sub(a, b));
    }

    @Test
    public void mulTest()
    {
        Assume.assumeTrue(type == Type.MUL);
        assertTrue("Addition Test", result == Calc.mul(a, b));
    }

    @Test
    public void divTest()
    {
        Assume.assumeTrue(type == Type.DIV);
        assertTrue("Addition Test", result == Calc.div(a, b));
    }
}
