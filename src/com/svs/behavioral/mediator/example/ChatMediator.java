package com.svs.behavioral.mediator.example;

interface ChatMediator {
    void sendMessage(String msg, User sender);
    void addUser(User user);
}
