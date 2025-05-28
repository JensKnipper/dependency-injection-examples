package de.jensknipper.diexamples.proxy.proxy;

import de.jensknipper.diexamples.proxy.component.Operator;

import java.util.function.Supplier;

public class LazyProxy implements Operator {
    private final Supplier<Operator> constructorRef;
    private Operator operator;

    public LazyProxy(Supplier<Operator> constructorRef) {
        this.constructorRef = constructorRef;
    }

    @Override
    public int calculate(int a, int b) {
        if(operator == null) {
            operator = constructorRef.get();
        }
        return operator.calculate(a, b);
    }
}
