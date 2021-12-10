package de.jensknipper.diexamples.framework.runtime.calculator;

import de.jensknipper.diexamples.common.TestOperator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FieldCalculatorTest {

    @Test
    void calculatorShouldThrowExceptionWhenNoOperatorSpecified() {
        // given
        FieldCalculator calculator = new FieldCalculator();

        // when + then
        assertThrows(RuntimeException.class, () -> calculator.calculate(2, 3));
    }

    @Test
    void calculatorShouldUseOperatorToCalculate() throws NoSuchFieldException, IllegalAccessException {
        // given
        TestOperator operator = new TestOperator();
        FieldCalculator calculator = new FieldCalculator();
        Field operatorField = calculator.getClass().getDeclaredField("operator");
        operatorField.setAccessible(true);
        operatorField.set(calculator, operator);

        // when
        int result = calculator.calculate(2, 3);

        // then
        assertEquals(6, result);
    }
}