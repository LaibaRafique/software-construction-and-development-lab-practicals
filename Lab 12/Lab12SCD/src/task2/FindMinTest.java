package task2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindMinTest {

    @Test
    public void testFindMin() {
        MaxMinFinder obj = new MaxMinFinder();
        int[] arr = {1, 2, 3, 4, 5};
        int result = obj.findMin(arr);
        assertEquals(1, result);
    }
}
