package com.svs.behavioral.chainOfResponsibility.assignment;

interface ReceiverInterface {
    void processMessage(Message message);
    void setNextChain(ReceiverInterface nextChain);
}
