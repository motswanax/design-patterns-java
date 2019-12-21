package com.svs.behavioral.observer.example;

interface Subject {
    // methods to register and unregister observers
    void register(Observer obj);
    void deregister(Observer obj);

    // methods to notify observers of changes - not required, but added so observers can query for updates
    void notifyObservers();
    Object getUpdate(Observer obj);
}
