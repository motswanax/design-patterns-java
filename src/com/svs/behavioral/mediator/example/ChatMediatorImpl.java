package com.svs.behavioral.mediator.example;

import java.util.ArrayList;
import java.util.List;

class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User sender) {
        for (User user: users) {
            // message should not be received by the user sending it
            if (user != sender) {
                user.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
