package de.jensknipper.diexamples.pure.calculator;

import de.jensknipper.diexamples.common.Operator;

public final class SetterCalculator {
    private Operator operator;

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
