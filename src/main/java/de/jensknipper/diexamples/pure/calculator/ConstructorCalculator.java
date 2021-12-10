package de.jensknipper.diexamples.pure.calculator;

import de.jensknipper.diexamples.common.Operator;

public final class ConstructorCalculator {
    private final Operator operator;

    public ConstructorCalculator(Operator operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b) {
        return operator.calculate(a, b);
    }
}
