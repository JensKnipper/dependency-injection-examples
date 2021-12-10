package de.jensknipper.diexamples.pure.calculator;

import de.jensknipper.diexamples.common.TestOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParameterCalculatorTest {

    @Test
    void calculatorShouldUseOperatorToCalculate() {
        // given
        TestOperator operator = new TestOperator();
        ParameterCalculator calculator = new ParameterCalculator();

        // when
        int result = calculator.calculate(operator,2, 3);

        // then
        assertEquals(6, result);
    }
}