package com.svs.behavioral.mediator.example;

class UserImpl extends User {
    UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void send(String message) {
        System.out.println(this.name + ": sending message - " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    void receive(String message) {
        System.out.println(this.name + ": received message - " + message);
    }
}
