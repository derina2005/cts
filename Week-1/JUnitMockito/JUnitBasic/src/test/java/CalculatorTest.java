import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setUp(){
       calculator=new Calculator();
    }
    @After
    public void tearDown(){
        calculator=null;
    }
    @Test
    public void testAdd() {
        int a=10;
        int b=20;
        int c=calculator.add(a,b);
        assertEquals(30,c);
    }
}