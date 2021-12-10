package de.jensknipper.diexamples.framework.runtime;

import de.jensknipper.diexamples.framework.runtime.calculator.ConstructorCalculator;
import de.jensknipper.diexamples.framework.runtime.calculator.FieldCalculator;
import de.jensknipper.diexamples.framework.runtime.calculator.SetterCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ConstructorCalculator constructorCalculator = context.getBean("constructorCalculator", ConstructorCalculator.class);
        System.out.println("Constructor injection: " + constructorCalculator.calculate(1, 2));

        FieldCalculator fieldCalculator = context.getBean("fieldCalculator", FieldCalculator.class);
        System.out.println("Field injection: " + fieldCalculator.calculate(1, 2));

        SetterCalculator setterCalculator = context.getBean("setterCalculator", SetterCalculator.class);
        System.out.println("Setter injection: " + setterCalculator.calculate(1, 2));
    }
}