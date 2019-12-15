package com.svs.behavioral.interpreter.example;

class InterpreterContext {
    String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }

    String getHexadecimalFormat(int i) {
        return Integer.toHexString(i);
    }
}
