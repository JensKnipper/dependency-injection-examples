package de.jensknipper.diexamples.framework.compiletime.calculator;

import de.jensknipper.diexamples.common.PlusOperator;

public final class ParameterCalculator {
    public int calculate(PlusOperator plusOperator, int a, int b) {
        return plusOperator.calculate(a, b);
    }
}
