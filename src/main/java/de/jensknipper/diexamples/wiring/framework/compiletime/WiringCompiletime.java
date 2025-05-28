package de.jensknipper.diexamples.wiring.framework.compiletime;


import de.jensknipper.diexamples.wiring.framework.compiletime.injection.ConstructorInjectionCompiletime;
import de.jensknipper.diexamples.wiring.framework.compiletime.injection.FieldInjectionCompiletime;
import de.jensknipper.diexamples.wiring.framework.compiletime.injection.SetterInjectionCompiletime;
import io.avaje.inject.BeanScope;

public class WiringCompiletime {

    public static void main(String[] args) {
        try( BeanScope beanScope = BeanScope.builder().build() ) {

            // Inspect the classes in target/generated-sources
            constructorInjection(beanScope);
            setterInjection(beanScope);
            fieldInjection(beanScope);
        }
    }

    private static void constructorInjection(BeanScope beanScope) {
        var constructorInjection = beanScope.get(ConstructorInjectionCompiletime.class);
        System.out.println("Constructor injection: " + constructorInjection.calculate(1, 2));
    }

    private static void setterInjection(BeanScope beanScope) {
        var setterInjection = beanScope.get(SetterInjectionCompiletime.class);
        System.out.println("Setter injection: " + setterInjection.calculate(1, 2));
    }

    private static void fieldInjection(BeanScope beanScope) {
        var fieldInjection = beanScope.get(FieldInjectionCompiletime.class);
        System.out.println("Field injection: " + fieldInjection.calculate(1, 2));
    }
}