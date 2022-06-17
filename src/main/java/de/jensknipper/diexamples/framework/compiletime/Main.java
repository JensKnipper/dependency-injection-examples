package de.jensknipper.diexamples.framework.compiletime;

import de.jensknipper.diexamples.framework.compiletime.calculator.ConstructorCalculator;
import de.jensknipper.diexamples.framework.compiletime.calculator.FieldCalculator;
import de.jensknipper.diexamples.framework.compiletime.calculator.SetterCalculator;

public class Main {
    public static void main(String[] args) {
        MyComponent component = DaggerMyComponent.create();

        ConstructorCalculator constructorCalculator = component.provideConstructorCalculator();
        System.out.println("Constructor injection: " + constructorCalculator.calculate(1, 2));

        FieldCalculator fieldCalculator = component.provideFieldCalculator();
        System.out.println("Field injection: " + fieldCalculator.calculate(1, 2));

        SetterCalculator setterCalculator = component.provideSetterCalculator();
        System.out.println("Setter injection: " + setterCalculator.calculate(1, 2));
    }
}