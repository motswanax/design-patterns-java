package com.svs.behavioral.interpreter.assignment;

public class Client {

    // helpers
    private static Expression getMaleExpression() {
        Expression bad = new TerminalExpression("BAD");
        Expression cena = new TerminalExpression("Cena");

        return new OrExpression(bad, cena);
    }

    private static Expression getMarriedWomanExpression() {
        Expression rejoice = new TerminalExpression("Rejoice");
        Expression married = new TerminalExpression("Married");

        return new AndExpression(rejoice, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        Context context = new Context("BAD");
        System.out.println("BAD is male? " + isMale.interpret(context));

        Context context2 = new Context("Married Rejoice");
        System.out.println("Rejoice is a married woman? " + isMarriedWoman.interpret(context2));

        Context context3 = new Context("Lucy");
        System.out.println("Lucy is male? " + isMale.interpret(context3));
    }
}
