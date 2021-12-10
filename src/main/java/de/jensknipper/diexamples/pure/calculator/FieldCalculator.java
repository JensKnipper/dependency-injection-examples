package de.jensknipper.diexamples.pure.calculator;

import de.jensknipper.diexamples.common.Operator;

public final class FieldCalculator {

    private Operator operator;

    public int calculate(int a, int b) {
        if (operator == null) {
            throw new RuntimeException("No operator specified");
        }
        return operator.calculate(a, b);
    }
}
