package de.jensknipper.diexamples.wiring.framework.compiletime.injection;

import de.jensknipper.diexamples.wiring.framework.compiletime.dependency.PlusOperator;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public final class SetterInjectionCompiletime {
    private PlusOperator operator;

    @Inject
    public void setOperator(PlusOperator operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b) {
        if (operator == null) {
            throw new RuntimeException("No operator specified");
        }
        return operator.calculate(a, b);
    }
}
