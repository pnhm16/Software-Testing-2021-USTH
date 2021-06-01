import java.util.*;

public class MinTestJUnit
{
   private List<String> strList;  
   private List<Integer> intList;

   @BeforeEach     
   public void setUp()
   {
      this.strList = new ArrayList<String>();
      this.intList = new ArrayList<Integer>();
   }

   @Test
   public void testNonNegative(){
       this.intList = [9,1,3,6,2,5]
       assertEquals(1, Min.min(this.intList))
   }

   @Test void testWithNegative(){
       this.intList = [-1,0,2,99,-100,50]
       assertEquals(-100, Min.min(this.intList))
   }

   @Test 
   public void testString(){
       this.strList = ["Alex,Jane,Oliver"]
       assertEquals("Alex", Min.min(this.strList))
   }
}