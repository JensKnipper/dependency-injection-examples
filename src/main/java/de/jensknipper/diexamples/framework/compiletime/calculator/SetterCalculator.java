package de.jensknipper.diexamples.framework.compiletime.calculator;

import de.jensknipper.diexamples.common.PlusOperator;

public final class SetterCalculator {
    private PlusOperator plusOperator;

    public void setOperator(PlusOperator plusOperator) {
        this.plusOperator = plusOperator;
    }

    public int calculate(int a, int b) {
        if (plusOperator == null) {
            throw new RuntimeException("No operator specified");
        }
        return plusOperator.calculate(a, b);
    }
}
