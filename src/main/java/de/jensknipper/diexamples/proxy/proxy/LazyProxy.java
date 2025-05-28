package de.jensknipper.diexamples.proxy.proxy;

import de.jensknipper.diexamples.proxy.component.Operator;
import de.jensknipper.diexamples.proxy.component.PlusOperator;

public class LazyProxy implements Operator {
    private PlusOperator operator;

    @Override
    public int calculate(int a, int b) {
        if(operator == null) {
            operator = new PlusOperator();
        }
        return operator.calculate(a, b);
    }
}
