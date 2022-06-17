package de.jensknipper.diexamples.framework.compiletime.calculator;

import de.jensknipper.diexamples.common.Operator;

import javax.inject.Inject;

public final class SetterCalculator {
    private Operator operator;

    @Inject
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b) {
        if (operator == null) {
            throw new RuntimeException("No operator specified");
        }
        return operator.calculate(a, b);
    }
}
