package com.svs.behavioral.chainOfResponsibility.assignment;

class Message {
    String text;
    MessagePriority priority;

    Message(String text, MessagePriority priority) {
        this.text = text;
        this.priority = priority;
    }
}
