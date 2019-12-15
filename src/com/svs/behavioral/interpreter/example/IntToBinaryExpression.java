package com.svs.behavioral.interpreter.example;

class IntToBinaryExpression implements Expression{
    private int anInt;

    IntToBinaryExpression(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(anInt);
    }
}
