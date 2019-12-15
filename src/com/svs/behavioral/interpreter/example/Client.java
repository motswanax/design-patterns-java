package com.svs.behavioral.interpreter.example;

public class Client {
    private InterpreterContext ic;

    public Client(InterpreterContext ic) {
        this.ic = ic;
    }

    private String interpret(String string) {
        Expression expression;

        // perform the parsing
        if (string.contains("Hexadecimal")) {
            expression = new IntToHexExpression(Integer.parseInt(string.substring(0,string.indexOf(" "))));
        } else if (string.contains("Binary")) {
            expression = new IntToBinaryExpression(Integer.parseInt(string.substring(0, string.indexOf(" "))));
        } else {
            return string;
        }

        return expression.interpret(ic);
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        Client client = new Client(new InterpreterContext());
        System.out.println(str1 + " = " + client.interpret(str1));
        System.out.println(str2 + " = " + client.interpret(str2));
    }
}
