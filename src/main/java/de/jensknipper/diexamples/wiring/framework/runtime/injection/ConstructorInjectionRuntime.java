package de.jensknipper.diexamples.wiring.framework.runtime.injection;

import de.jensknipper.diexamples.wiring.framework.runtime.dependency.PlusOperator;
import org.springframework.stereotype.Component;

@Component
public final class ConstructorInjectionRuntime {
    private final PlusOperator operator;

    public ConstructorInjectionRuntime(PlusOperator operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b) {
        return operator.calculate(a, b);
    }
}
