package de.jensknipper.diexamples.framework.compiletime;

import dagger.Component;
import de.jensknipper.diexamples.common.Operator;
import de.jensknipper.diexamples.framework.compiletime.calculator.ConstructorCalculator;
import de.jensknipper.diexamples.framework.compiletime.calculator.FieldCalculator;
import de.jensknipper.diexamples.framework.compiletime.calculator.SetterCalculator;

import javax.inject.Singleton;

@Singleton
@Component(modules = {MyModule.class})
public interface MyComponent {
    ConstructorCalculator provideConstructorCalculator();
    FieldCalculator provideFieldCalculator();
    SetterCalculator provideSetterCalculator();
}