package de.jensknipper.diexamples.wiring.manual;

import de.jensknipper.diexamples.wiring.manual.dependency.PlusOperator;
import de.jensknipper.diexamples.wiring.manual.injection.*;

import java.lang.reflect.Field;

public class WiringManual {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        constructorInjection();
        methodInjection();
        setterInjection();
        interfaceInjection();
        parameterInjection();
        fieldInjection();
        fieldInjectionPrivate();
    }

    private static void constructorInjection() {
        var plusOperator = new PlusOperator();
        var constructorInjection = new ConstructorInjectionManual(plusOperator);

        System.out.println("Constructor injection: " + constructorInjection.calculate(1, 2));
    }

    private static void methodInjection() {
        var plusOperator = new PlusOperator();
        var methodInjection = new MethodInjectionManual();
        methodInjection.injectOperator(plusOperator);

        System.out.println("Method injection: " + methodInjection.calculate(1, 2));
    }

    private static void setterInjection() {
        var plusOperator = new PlusOperator();
        var setterInjection = new SetterInjectionManual();
        setterInjection.setOperator(plusOperator);

        System.out.println("Setter injection: " + setterInjection.calculate(1, 2));
    }

    private static void interfaceInjection() {
        var plusOperator = new PlusOperator();
        var interfaceInjection = new InterfaceInjectionManual();
        interfaceInjection.injectPlusOperator(plusOperator);

        System.out.println("Interface injection: " + interfaceInjection.calculate(1, 2));
    }

    private static void parameterInjection() {
        var plusOperator = new PlusOperator();
        var parameterInjection = new ParameterInjectionManual();

        System.out.println("Parameter injection: " + parameterInjection.calculate(plusOperator, 1, 2));
    }

    private static void fieldInjection() {
        var plusOperator = new PlusOperator();
        var fieldInjection = new FieldInjectionManual();
        fieldInjection.operator = plusOperator;

        System.out.println("Field injection: " + fieldInjection.calculate(1, 2));
    }

    private static void fieldInjectionPrivate() throws NoSuchFieldException, IllegalAccessException {
        var plusOperator = new PlusOperator();
        var fieldInjectionPrivate = new FieldInjectionPrivateManual();
        Field operatorField = fieldInjectionPrivate.getClass().getDeclaredField("operator");
        operatorField.setAccessible(true);
        operatorField.set(fieldInjectionPrivate, plusOperator);

        System.out.println("Private Field injection: " + fieldInjectionPrivate.calculate(1, 2));
    }
}
