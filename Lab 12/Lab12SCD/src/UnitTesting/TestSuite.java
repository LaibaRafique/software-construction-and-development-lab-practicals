package UnitTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    SquareTest.class, 
    CountATest.class, 
    FindMaxTest.class,
    FindMinTest.class,
    OddEvenTest.class,
    PrimeTest.class,
    FactorialTest.class
})
public class TestSuite {
    
}
