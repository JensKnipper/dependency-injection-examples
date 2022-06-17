package de.jensknipper.diexamples.framework.compiletime;

import dagger.Module;
import dagger.Provides;
import de.jensknipper.diexamples.common.Operator;
import de.jensknipper.diexamples.common.PlusOperator;
import de.jensknipper.diexamples.framework.compiletime.calculator.ConstructorCalculator;
import de.jensknipper.diexamples.framework.compiletime.calculator.FieldCalculator;
import de.jensknipper.diexamples.framework.compiletime.calculator.SetterCalculator;

import javax.inject.Singleton;

@Module
public class MyModule {

    @Provides
    @Singleton
    public Operator provideOperator() {
        return new PlusOperator();
    }


    @Provides
    @Singleton
    public ConstructorCalculator provideConstructorCalculator(Operator operator) {
        return new ConstructorCalculator(operator);
    }


    @Provides
    @Singleton
    public FieldCalculator provideFieldCalculator(Operator operator) {
        return new FieldCalculator();
    }


    @Provides
    @Singleton
    public SetterCalculator provideSetterCalculator(Operator operator) {
        return new SetterCalculator();
    }
}