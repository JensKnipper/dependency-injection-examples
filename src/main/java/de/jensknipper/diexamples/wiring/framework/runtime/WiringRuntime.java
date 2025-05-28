package de.jensknipper.diexamples.wiring.framework.runtime;

import de.jensknipper.diexamples.wiring.framework.runtime.injection.ConstructorInjectionRuntime;
import de.jensknipper.diexamples.wiring.framework.runtime.injection.FieldInjectionRuntime;
import de.jensknipper.diexamples.wiring.framework.runtime.injection.SetterInjectionRuntime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WiringRuntime {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        constructorInjection(context);
        setterInjection(context);
        fieldInjection(context);
    }

    private static void constructorInjection(ApplicationContext context) {
        var constructorInjection = context.getBean("constructorCalculator", ConstructorInjectionRuntime.class);
        System.out.println("Constructor injection: " + constructorInjection.calculate(1, 2));
    }

    private static void setterInjection(ApplicationContext context) {
        var setterInjection = context.getBean("setterCalculator", SetterInjectionRuntime.class);
        System.out.println("Setter injection: " + setterInjection.calculate(1, 2));
    }

    private static void fieldInjection(ApplicationContext context) {
        var fieldInjection = context.getBean("fieldCalculator", FieldInjectionRuntime.class);
        System.out.println("Field injection: " + fieldInjection.calculate(1, 2));
    }
}