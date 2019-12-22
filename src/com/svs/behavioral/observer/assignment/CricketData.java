package com.svs.behavioral.observer.assignment;

import java.util.ArrayList;
import java.util.List;

class CricketData implements Subject {
    private int runs;
    private int wickets;
    private  float overs;

    private List<Observer> observerList;

    CricketData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observerList.contains(observer)) observerList.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obj : observerList) {
            obj.update(runs, wickets, overs);
        }
    }

    private int getLatestRuns() {
        return 90;
    }

    private int getLatestWickets() {
        return 2;
    }

    private float getLatestOvers() {
        return (float) 10.2;
    }

    void dataChanged() {
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObservers();
    }
}
