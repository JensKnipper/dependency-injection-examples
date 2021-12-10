package de.jensknipper.diexamples.pure.calculator;

import de.jensknipper.diexamples.common.TestOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructorCalculatorTest {

    @Test
    void calculatorShouldUseOperatorToCalculate() {
        // given
        TestOperator operator = new TestOperator();
        ConstructorCalculator calculator = new ConstructorCalculator(operator);

        // when
        int result = calculator.calculate(2, 3);

        // then
        assertEquals(6, result);
    }
}