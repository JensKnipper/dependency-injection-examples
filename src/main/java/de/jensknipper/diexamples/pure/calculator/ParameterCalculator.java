package de.jensknipper.diexamples.pure.calculator;

import de.jensknipper.diexamples.common.Operator;

public final class ParameterCalculator {
    public int calculate(Operator operator, int a, int b) {
        return operator.calculate(a, b);
    }
}
