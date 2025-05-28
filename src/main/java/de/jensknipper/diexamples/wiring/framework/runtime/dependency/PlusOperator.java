package de.jensknipper.diexamples.wiring.framework.runtime.dependency;

import org.springframework.stereotype.Component;

@Component
public class PlusOperator {
    public int calculate(int a, int b) {
        return a + b;
    }
}
