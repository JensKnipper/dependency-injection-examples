package de.jensknipper.diexamples.framework.compiletime.calculator;

import de.jensknipper.diexamples.common.Operator;

import javax.inject.Inject;

public final class FieldCalculator {
    @Inject
    Operator operator;

    public FieldCalculator() {
    }

    public int calculate(int a, int b) {
        if (operator == null) {
            throw new RuntimeException("No operator specified");
        }
        return operator.calculate(a, b);
    }
}
