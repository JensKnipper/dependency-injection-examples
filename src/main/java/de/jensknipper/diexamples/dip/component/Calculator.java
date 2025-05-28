package de.jensknipper.diexamples.dip.component;

public class Calculator {
    private final Operator operator;

    public Calculator(Operator operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b) {
        return operator.calculate(a, b);
    }
}
