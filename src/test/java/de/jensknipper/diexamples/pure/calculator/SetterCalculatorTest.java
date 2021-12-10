package de.jensknipper.diexamples.pure.calculator;

import de.jensknipper.diexamples.common.TestOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterCalculatorTest {

    @Test
    void calculatorShouldThrowExceptionWhenNoOperatorSpecified() {
        // given
        SetterCalculator calculator = new SetterCalculator();

        // when + then
        assertThrows(RuntimeException.class, () -> calculator.calculate(2, 3));
    }

    @Test
    void calculatorShouldUseOperatorToCalculate() {
        // given
        TestOperator operator = new TestOperator();
        SetterCalculator calculator = new SetterCalculator();
        calculator.setOperator(operator);

        // when
        int result = calculator.calculate(2, 3);

        // then
        assertEquals(6, result);
    }
}