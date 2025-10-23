package task2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindMaxTest {

    @Test
    public void testFindMax() {
        MaxMinFinder obj = new MaxMinFinder();
        int[] arr = {1, 2, 3, 4, 5};
        int result = obj.findMax(arr);
        assertEquals(5, result); 
    }
}
