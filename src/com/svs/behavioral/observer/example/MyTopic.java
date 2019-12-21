package com.svs.behavioral.observer.example;

import java.util.ArrayList;
import java.util.List;

class MyTopic implements Subject {
    private List<Observer> observers;
    private String message;
    private boolean changed;

    MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        if (!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void deregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal;

        if (!changed) return;

        observersLocal = new ArrayList<>(observers);
        this.changed = false;

        for (Observer obj: observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    /**
     * Post message to the topic and change state (trigger notifications).
     * @param msg - the message
     */
    void postMessage(String msg) {
        System.out.println("Message posted to topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
