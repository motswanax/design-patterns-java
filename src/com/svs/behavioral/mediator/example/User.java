package com.svs.behavioral.mediator.example;

abstract class User {
    ChatMediator mediator;
    String name;

    User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void send(String message);
    abstract void receive(String message);
}
