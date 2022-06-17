package de.jensknipper.diexamples.framework.compiletime.calculator;

import de.jensknipper.diexamples.common.Operator;

import javax.inject.Inject;

public final class ConstructorCalculator {
    Operator operator;

    @Inject
    public ConstructorCalculator(Operator operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b) {
        return operator.calculate(a, b);
    }
}
