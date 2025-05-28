package de.jensknipper.diexamples.none;

import de.jensknipper.diexamples.none.component.Calculator;

public class NoDI {

    public static void main(String[] args) {
        noInjection();
    }

    private static void noInjection() {
        Calculator calculator = new Calculator();
        System.out.println("No injection: " + calculator.calculate(1, 2));
    }
}
