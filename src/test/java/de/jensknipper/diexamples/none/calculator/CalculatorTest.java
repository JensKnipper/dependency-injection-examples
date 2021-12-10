package de.jensknipper.diexamples.none.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculatorShouldUseOperatorToCalculate() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.calculate(2, 3);

        // then
        assertEquals(5, result);
    }
}