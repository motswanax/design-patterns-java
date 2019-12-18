package com.svs.behavioral.iteratorPattern.assignment;

import java.util.LinkedList;

class ScienceIterator implements IteratorInterface {

    private LinkedList<String> subjects;
    private int position;

    ScienceIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
        position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects.get(position++);
    }

    @Override
    public Boolean isDone() {
        return position >= subjects.size();
    }

    @Override
    public String currentItem() {
        return subjects.get(position);
    }
}
