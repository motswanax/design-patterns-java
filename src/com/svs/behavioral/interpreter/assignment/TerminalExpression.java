package com.svs.behavioral.interpreter.assignment;

class TerminalExpression implements Expression {

    private String data;

    TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getResult(data);
    }
}
