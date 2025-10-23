package task3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OddEvenTest {

    @Test
    public void testIsOdd() {
        NumberFunctions obj = new NumberFunctions();
        assertEquals(true, obj.isOdd(5)); 
        assertEquals(false, obj.isOdd(4)); 
    }

    @Test
    public void testIsEven() {
        NumberFunctions obj = new NumberFunctions();
        assertEquals(true, obj.isEven(4)); 
        assertEquals(false, obj.isEven(5)); 
    }
}
