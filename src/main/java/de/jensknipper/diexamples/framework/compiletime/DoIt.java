package de.jensknipper.diexamples.framework.compiletime;

import de.jensknipper.diexamples.framework.runtime.calculator.ConstructorCalculator;
import de.jensknipper.diexamples.framework.runtime.calculator.FieldCalculator;
import org.springframework.stereotype.Component;

@Component
public interface DoIt {
    ConstructorCalculator constructorCalculator();
    FieldCalculator fieldCalculator();
}
