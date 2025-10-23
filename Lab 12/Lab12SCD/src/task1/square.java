package task1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testSquare() {
        JUnitTesting obj = new JUnitTesting();
        int result = obj.square(5);
        assertEquals(25, result); 
    }
}
