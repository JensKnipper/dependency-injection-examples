package de.jensknipper.diexamples.wiring.framework.runtime.injection;

import de.jensknipper.diexamples.wiring.framework.runtime.dependency.PlusOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class FieldInjectionRuntime {
   @Autowired
    private PlusOperator operator;

    public int calculate(int a, int b) {
        return operator.calculate(a, b);
    }
}
