package com.svs.behavioral.interpreter.assignment;

class Context {
    private String input;

    Context(String input) {
        this.input = input;
    }

    boolean getResult(String data) {
        return input.contains(data);
    }
}
