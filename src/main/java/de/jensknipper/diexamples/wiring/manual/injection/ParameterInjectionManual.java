package de.jensknipper.diexamples.wiring.manual.injection;


import de.jensknipper.diexamples.wiring.manual.dependency.PlusOperator;

public final class ParameterInjectionManual {
    public int calculate(PlusOperator operator, int a, int b) {
        return operator.calculate(a, b);
    }
}
