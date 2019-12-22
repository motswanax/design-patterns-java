package com.svs.behavioral.strategy.assignment;

class Context {
    int executeStrategy(Strategy strategy, int num1,int num2) {
        return strategy.performOperation(num1, num2);
    }
}
