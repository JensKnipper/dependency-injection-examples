package de.jensknipper.diexamples.dip;

import de.jensknipper.diexamples.dip.component.Operator;
import de.jensknipper.diexamples.dip.component.PlusOperator;
import de.jensknipper.diexamples.dip.component.Calculator;

public class DependencyInversionPrinciple {

    public static void main(String[] args) {
        noInjection();
    }

    private static void noInjection() {
        Operator operator = new PlusOperator();
        Calculator calculator = new Calculator(operator);

        System.out.println("Dependency Inversion Principle: " + calculator.calculate(1, 2));
    }
}
