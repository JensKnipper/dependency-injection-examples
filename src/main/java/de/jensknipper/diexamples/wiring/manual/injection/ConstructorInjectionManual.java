package de.jensknipper.diexamples.wiring.manual.injection;


import de.jensknipper.diexamples.wiring.manual.dependency.PlusOperator;

public final class ConstructorInjectionManual {
    private final PlusOperator operator;

    public ConstructorInjectionManual(PlusOperator operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b) {
        return operator.calculate(a, b);
    }
}
