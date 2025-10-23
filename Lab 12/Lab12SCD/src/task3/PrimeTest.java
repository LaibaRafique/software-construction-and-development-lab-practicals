package task3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeTest {

    @Test
    public void testIsPrime() {
        NumberFunctions obj = new NumberFunctions();
        assertEquals(true, obj.isPrime(7)); 
        assertEquals(false, obj.isPrime(8)); 
    }
}
