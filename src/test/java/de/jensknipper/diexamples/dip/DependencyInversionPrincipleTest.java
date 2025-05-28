package de.jensknipper.diexamples.dip;

import de.jensknipper.diexamples.dip.component.Calculator;
import de.jensknipper.diexamples.dip.component.FakeOperator;
import de.jensknipper.diexamples.dip.component.MockOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DependencyInversionPrincipleTest {

    @Test
    void testWithFake() {
        // given
        var operator = new FakeOperator();
        var calculator = new Calculator(operator);

        // when
        int result = calculator.calculate(2, 3);

        // then
        assertEquals(6, result);
    }

    @Test
    void testWithMock() {
        // given
        var operator = new MockOperator();
        var calculator = new Calculator(operator);

        // when
        int result = calculator.calculate(2, 3);

        // then
        assertEquals(42, result);
    }
}