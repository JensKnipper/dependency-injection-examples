package de.jensknipper.diexamples.dip.component;

public class FakeOperator implements Operator {
    public int calculate(int a, int b) {
        return a * b;
    }
}
