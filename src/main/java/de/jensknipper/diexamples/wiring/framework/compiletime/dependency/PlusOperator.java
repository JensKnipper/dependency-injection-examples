package de.jensknipper.diexamples.wiring.framework.compiletime.dependency;

import jakarta.inject.Singleton;

@Singleton
public class PlusOperator {
    public int calculate(int a, int b) {
        return a + b;
    }
}
