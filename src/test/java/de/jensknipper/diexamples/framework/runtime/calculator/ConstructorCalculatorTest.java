package de.jensknipper.diexamples.framework.runtime.calculator;

import de.jensknipper.diexamples.common.Operator;
import de.jensknipper.diexamples.common.TestOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class ConstructorCalculatorTest {

    @Test
    void calculatorShouldUseOperatorToCalculate() {
        // given
        //TestOperator operator = new TestOperator();
        Operator operator = mock(Operator.class);
        ConstructorCalculator calculator = new ConstructorCalculator(operator);

        // when
        int result = calculator.calculate(2, 3);

        // then
        assertEquals(6, result);
    }
}