package de.jensknipper.diexamples.proxy;

import de.jensknipper.diexamples.proxy.component.Calculator;
import de.jensknipper.diexamples.proxy.component.Operator;
import de.jensknipper.diexamples.proxy.proxy.LazyProxy;
import de.jensknipper.diexamples.proxy.proxy.SwitchProxy;

public class Proxy {

    public static void main(String[] args) {
        lazyProxy();
        switchProxyInactive();
        switchProxyActive();
    }

    private static void lazyProxy() {
        Operator operator = new LazyProxy();
        Calculator calculator = new Calculator(operator);

        System.out.println("Lazy Proxy: " + calculator.calculate(1, 2));
    }

    private static void switchProxyInactive() {
        Operator operator = new SwitchProxy();
        Calculator calculator = new Calculator(operator);

        System.out.println("Lazy Proxy inactive: " + calculator.calculate(4, 1));
    }

    private static void switchProxyActive() {
        SwitchProxy operator = new SwitchProxy();
        Calculator calculator = new Calculator(operator);
        operator.setPlusActive(true);

        System.out.println("Lazy Proxy active: " + calculator.calculate(1, 2));
    }
}
