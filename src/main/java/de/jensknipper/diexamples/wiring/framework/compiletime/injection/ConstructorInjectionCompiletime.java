package de.jensknipper.diexamples.wiring.framework.compiletime.injection;

import de.jensknipper.diexamples.wiring.framework.compiletime.dependency.PlusOperator;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public final class ConstructorInjectionCompiletime {
    PlusOperator operator;

    @Inject
    public ConstructorInjectionCompiletime(PlusOperator operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b) {
        return operator.calculate(a, b);
    }
}
