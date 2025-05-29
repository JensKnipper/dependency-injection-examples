package de.jensknipper.diexamples.proxy.proxy;

import de.jensknipper.diexamples.proxy.component.Operator;

public class SwitchProxy implements Operator {
    private final Operator first;
    private final Operator second;
    
    private boolean useFirst = false;

    public SwitchProxy(Operator first, Operator second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int calculate(int a, int b) {
        if(useFirst) {
            return first.calculate(a, b);
        }
        return second.calculate(a, b);
    }

    public void setUseFirst(boolean useFirst) {
        this.useFirst = useFirst;
    }
}
