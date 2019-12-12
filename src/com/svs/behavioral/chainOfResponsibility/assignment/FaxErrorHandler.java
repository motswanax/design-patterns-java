package com.svs.behavioral.chainOfResponsibility.assignment;

/**
 * THis handles fax errors or forwards them if none.
 *
 * @author baike
 */
class FaxErrorHandler implements ReceiverInterface {

    private ReceiverInterface nextReceiver;

    @Override
    public void processMessage(Message message) {
        if (message.text.contains("Fax")) {
            System.out.println("FaxErrorHandler processed " + message.priority + " priority issue: " + message.text);
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
