package de.jensknipper.diexamples.framework.compiletime.calculator;

import de.jensknipper.diexamples.common.Operator;

import javax.inject.Inject;

public final class ParameterCalculator {
    @Inject
    public int calculate(Operator operator, int a, int b) {
        return operator.calculate(a, b);
    }
}
