package com.svs.behavioral.strategy.assignment;

class OperationMultiply implements Strategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
}
