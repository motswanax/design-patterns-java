package com.svs.behavioral.observer.assignment;

/**
 * Implemented by CricketData to communicate with observers.
 *
 * @author baike
 */
interface Subject {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}
