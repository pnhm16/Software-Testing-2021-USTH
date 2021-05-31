import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith (Parameterized.class)
public class Ex4
{
   public int a, b, ans;

   public Ex4 (int a, int b, int ans)
   {
      this.a = a;
      this.b = b;
      this.ans = ans; 
   }

  @Parameters
  public static Collection<Object[]> calcValues()
  {
     return Arrays.asList (new Object [][] {{1, 1, 2}, {2, 3, 5}}); 
  }

  @Test
  public void additionTest()
  {
     assertTrue ("Addition Test", ans == Calc.add (a,b));
  }

  @Test
  public void subtractionTest()
  {
     assertTrue ("Subtraction Test", ans == Calc.sub (a,b));
  }

  @Test
  public void multiplicationTest()
  {
     assertTrue ("Multiplication Test", ans == Calc.mul (a,b));
  }

  @Test
  public void devideTest()
  {
     assertTrue ("Devide Test", ans == Calc.div (a,b));
  }
}
