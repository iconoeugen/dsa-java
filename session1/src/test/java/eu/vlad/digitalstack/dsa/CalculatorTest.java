package eu.vlad.digitalstack.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 4);

        assertEquals(7, result);
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        int result = calc.multiply(3, 4);

        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        int result = calc.divide(4, 2);

        assertEquals(2, result);
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> {calc.divide(4, 0);});

    }
}
