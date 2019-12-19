package com.svs.behavioral.mediator.example;

public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "BAD");
        User user2 = new UserImpl(mediator, "Boi");
        User user3 = new UserImpl(mediator, "John");
        User user4 = new UserImpl(mediator, "Cena");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi y'all");
        user2.send("Shut up");
    }
}
