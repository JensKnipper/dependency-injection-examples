package de.jensknipper.diexamples.proxy.proxy;

import de.jensknipper.diexamples.proxy.component.Operator;
import de.jensknipper.diexamples.proxy.component.PlusOperator;
import de.jensknipper.diexamples.proxy.component.MinusOperator;

public class SwitchProxy implements Operator {
    private final PlusOperator plusOperator = new PlusOperator();
    private final MinusOperator minusOperator = new MinusOperator();
    
    private boolean plusActive = false;

    @Override
    public int calculate(int a, int b) {
        if(plusActive) {
            return plusOperator.calculate(a, b);
        }
        return minusOperator.calculate(a, b);
    }

    public void setPlusActive(boolean plusActive) {
        this.plusActive = plusActive;
    }
}
