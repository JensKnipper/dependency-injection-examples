package de.jensknipper.diexamples.wiring.manual.injection;


import de.jensknipper.diexamples.wiring.manual.dependency.PlusOperator;

public final class MethodInjectionManual {
    private PlusOperator operator;

    public void injectOperator(PlusOperator operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b) {
        if (operator == null) {
            throw new RuntimeException("No operator specified");
        }
        return operator.calculate(a, b);
    }
}
