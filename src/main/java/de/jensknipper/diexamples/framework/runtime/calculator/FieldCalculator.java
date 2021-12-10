package de.jensknipper.diexamples.framework.runtime.calculator;

import de.jensknipper.diexamples.common.Operator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class FieldCalculator {
   @Autowired
    private Operator operator;

    public int calculate(int a, int b) {
        return operator.calculate(a, b);
    }
}
