package de.jensknipper.diexamples.wiring.framework.runtime.injection;

import de.jensknipper.diexamples.wiring.framework.runtime.dependency.PlusOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class SetterInjectionRuntime {
    private PlusOperator operator;

    @Autowired
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
