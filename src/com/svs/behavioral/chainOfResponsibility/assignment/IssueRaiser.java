package com.svs.behavioral.chainOfResponsibility.assignment;

class IssueRaiser {
    private ReceiverInterface firstReceiver;

    IssueRaiser(ReceiverInterface setFirstReceiver) {
        this.firstReceiver = setFirstReceiver;
    }

    void raiseMessage(Message message) {
        if (firstReceiver != null) {
            firstReceiver.processMessage(message);
        }
    }
}
