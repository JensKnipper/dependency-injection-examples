package de.jensknipper.diexamples.wiring.manual.injection;

import de.jensknipper.diexamples.wiring.manual.dependency.InjectPlusOperator;
import de.jensknipper.diexamples.wiring.manual.dependency.PlusOperator;

public final class InterfaceInjectionManual implements InjectPlusOperator {
    private PlusOperator operator;

    @Override
    public void injectPlusOperator(PlusOperator operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b) {
        if (operator == null) {
            throw new RuntimeException("No operator specified");
        }
        return operator.calculate(a, b);
    }
}
