package com.svs.behavioral.memento.assignment;

import java.util.ArrayList;
import java.util.List;

class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    void add(Memento state) {
        mementoList.add(state);
    }

    Memento get(int index) {
        return mementoList.get(index);
    }
}
