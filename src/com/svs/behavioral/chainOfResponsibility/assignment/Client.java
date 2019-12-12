package com.svs.behavioral.chainOfResponsibility.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Chain of Responsibility Pattern Demo***");

        // making the chain first: Fax -> email
        ReceiverInterface faxHandler, emailHandler;

        // emd of chain
        emailHandler = new EmailErrorHandler();

        // fax handler is before email
        faxHandler = new FaxErrorHandler();
        faxHandler.setNextChain(emailHandler);

        // starting point: raiser will raise issues and set the first handler
        IssueRaiser raiser = new IssueRaiser(faxHandler);

        Message m1 = new Message("Fax is a 60s tech", MessagePriority.Normal);
        Message m2 = new Message("Fucking Email won't send", MessagePriority.High);
        Message m3 = new Message("Telegram over Whatsapp any day, else Email!", MessagePriority.Normal);
        Message m4 = new Message("If you send me a Fax I will kill you", MessagePriority.High);

        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
    }
}
