import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {calculator = new Calculator(15.00, 5.00);}

    @Test

    public void hasFirstNumber(){
        assertEquals(15.00, calculator.getFirstNumber(), 0.01);
    }

    @Test
    public void hasSecondNumber(){
        assertEquals(5.00, calculator.getSecondNumber(), 0.01);
    }

    @Test
    public void canAddTwoNumbers(){
        assertEquals(20.00, calculator.addNumbers(), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(10.00, calculator.subtractNumbers(), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(75.00, calculator.multiplyNumbers(), 0.01);
    }

}
