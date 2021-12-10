package de.jensknipper.diexamples.none.calculator;

import de.jensknipper.diexamples.common.Operator;
import de.jensknipper.diexamples.common.PlusOperator;

public class Calculator {
    private final Operator operator = new PlusOperator();

    public int calculate(int a, int b) {
        return operator.calculate(a, b);
    }
}
