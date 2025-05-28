package de.jensknipper.diexamples.proxy;

import de.jensknipper.diexamples.proxy.component.Calculator;
import de.jensknipper.diexamples.proxy.component.MinusOperator;
import de.jensknipper.diexamples.proxy.component.Operator;
import de.jensknipper.diexamples.proxy.component.PlusOperator;
import de.jensknipper.diexamples.proxy.proxy.LazyProxy;
import de.jensknipper.diexamples.proxy.proxy.SwitchProxy;

public class Proxy {

    public static void main(String[] args) {
        lazyProxy();
        switchProxyInactive();
        switchProxyActive();
    }

    private static void lazyProxy() {
        Operator operator = new LazyProxy(PlusOperator::new);
        Calculator calculator = new Calculator(operator);

        System.out.println("Lazy Proxy: " + calculator.calculate(1, 2));
    }

    private static void switchProxyInactive() {
        Operator first = new PlusOperator();
        Operator second = new MinusOperator();
        Operator operator = new SwitchProxy(first, second);
        Calculator calculator = new Calculator(operator);

        System.out.println("Switch Proxy inactive: " + calculator.calculate(4, 1));
    }

    private static void switchProxyActive() {
        Operator first = new PlusOperator();
        Operator second = new MinusOperator();
        SwitchProxy operator = new SwitchProxy(first, second);
        Calculator calculator = new Calculator(operator);
        operator.setUseFirst(true);

        System.out.println("Switch Proxy active: " + calculator.calculate(1, 2));
    }
}
