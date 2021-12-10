package de.jensknipper.diexamples.framework.runtime.calculator;

import de.jensknipper.diexamples.common.Operator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class SetterCalculator {
    private Operator operator;

    @Autowired
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b) {
        if (operator == null) {
            throw new RuntimeException("No operator specified");
        }
        return operator.calculate(a, b);
    }
}
