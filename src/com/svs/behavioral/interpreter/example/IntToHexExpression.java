package com.svs.behavioral.interpreter.example;

class IntToHexExpression implements Expression{
    private int anInt;

    IntToHexExpression(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(anInt);
    }
}
