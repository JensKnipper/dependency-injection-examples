package de.jensknipper.diexamples.none.component;

public class Calculator {
    private final PlusOperator operator = new PlusOperator();

    public int calculate(int a, int b) {
        return operator.calculate(a, b);
    }
}
