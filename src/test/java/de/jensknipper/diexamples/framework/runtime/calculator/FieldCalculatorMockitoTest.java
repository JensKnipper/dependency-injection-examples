package de.jensknipper.diexamples.framework.runtime.calculator;

import de.jensknipper.diexamples.common.Operator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FieldCalculatorMockitoTest {

    @Mock
    private Operator operator;

    @InjectMocks
    private FieldCalculator calculator;

    @Test
    void calculatorShouldUseOperatorToCalculate() throws NoSuchFieldException, IllegalAccessException {
        // given
        when(operator.calculate(2, 3)).thenReturn(6);

        // when
        int result = calculator.calculate(2, 3);

        // then
        assertEquals(6, result);
    }
}