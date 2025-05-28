package de.jensknipper.diexamples.dip.component;

public class PlusOperator implements Operator {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
