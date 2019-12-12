package com.svs.behavioral.chainOfResponsibility.assignment;

/**
 * Handles email errors or forwards them if none.
 *
 * @author baike
 */
class EmailErrorHandler implements ReceiverInterface{

    private ReceiverInterface nextReceiver;

    @Override
    public void processMessage(Message message) {
        if (message.text.contains("Email")) {
            System.out.println("EmailErrorHandler processed " + message.priority + " priority issue: " + message.text);
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
        }
    }

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        this.nextReceiver = nextChain;
    }
}
