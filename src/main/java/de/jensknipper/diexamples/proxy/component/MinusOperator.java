package de.jensknipper.diexamples.proxy.component;

public class MinusOperator implements Operator {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
