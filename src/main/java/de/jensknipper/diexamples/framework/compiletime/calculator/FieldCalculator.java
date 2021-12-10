package de.jensknipper.diexamples.framework.compiletime.calculator;

import de.jensknipper.diexamples.common.PlusOperator;

import javax.inject.Inject;

public final class FieldCalculator {
    @Inject
    PlusOperator plusOperator;

    @Inject
    public FieldCalculator() {
    }

    public int calculate(int a, int b) {
        if (plusOperator == null) {
            throw new RuntimeException("No operator specified");
        }
        return plusOperator.calculate(a, b);
    }
}
