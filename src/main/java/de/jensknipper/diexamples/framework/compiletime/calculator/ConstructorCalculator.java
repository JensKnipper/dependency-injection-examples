package de.jensknipper.diexamples.framework.compiletime.calculator;

import de.jensknipper.diexamples.common.PlusOperator;

import javax.inject.Inject;

public final class ConstructorCalculator {
    @Inject PlusOperator plusOperator;

    @Inject
    public ConstructorCalculator(PlusOperator plusOperator) {
        this.plusOperator = plusOperator;
    }

    public int calculate(int a, int b) {
        return plusOperator.calculate(a, b);
    }
}
