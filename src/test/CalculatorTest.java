import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
simple intelliJ project
simple example of junit tests
Junit 5 dependencies -
    junit-jupiter-api (assertions & annotations)
    junit-platform-commons & junit-platform-engine (test discovery & execution)
https://junit.org/junit5/
*/

public class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(2,3));
    }

    @Test
    void subtractFromResult() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.subtractFromResult(2));
    }
}