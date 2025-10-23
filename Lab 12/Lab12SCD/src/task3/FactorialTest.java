package task3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        NumberFunctions obj = new NumberFunctions();
        assertEquals(120, obj.factorial(5)); 
        assertEquals(1, obj.factorial(0)); 
    }
}
