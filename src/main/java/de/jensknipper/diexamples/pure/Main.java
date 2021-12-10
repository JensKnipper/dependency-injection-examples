package de.jensknipper.diexamples.pure;

import de.jensknipper.diexamples.pure.calculator.*;
import de.jensknipper.diexamples.common.PlusOperator;

import java.lang.reflect.Field;

public class Main {
    private static final PlusOperator plusOperator = new PlusOperator();

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        constructorInjection();
        parameterInjection();
        setterInjection();
        fieldInjection();
    }

    private static void constructorInjection() {
        ConstructorCalculator constructorCalculator = new ConstructorCalculator(plusOperator);
        System.out.println("Constructor injection: " + constructorCalculator.calculate(1, 2));
    }

    private static void parameterInjection() {
        ParameterCalculator parameterCalculator = new ParameterCalculator();
        System.out.println("Parameter injection: " + parameterCalculator.calculate(plusOperator, 1, 2));
    }

    private static void setterInjection() {
        SetterCalculator setterCalculator = new SetterCalculator();
        setterCalculator.setOperator(plusOperator);
        System.out.println("Constructor injection: " + setterCalculator.calculate(1, 2));
    }

    private static void fieldInjection() throws NoSuchFieldException, IllegalAccessException {
        FieldCalculator fieldCalculator = new FieldCalculator();
        Field operatorField = fieldCalculator.getClass().getDeclaredField("operator");
        operatorField.setAccessible(true);
        operatorField.set(fieldCalculator, plusOperator);
        System.out.println("Field injection: " + fieldCalculator.calculate(1, 2));
    }
}
