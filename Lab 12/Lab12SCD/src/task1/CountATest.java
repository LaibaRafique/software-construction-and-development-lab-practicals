package task1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountATest {

    @Test
    public void testCountA() {
        JUnitTesting obj = new JUnitTesting();
        int result = obj.countA("Java");
        assertEquals(2, result); 
    }
}

