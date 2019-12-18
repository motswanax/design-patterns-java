package com.svs.behavioral.iteratorPattern.assignment;

class ArtsIterator implements IteratorInterface {

    private String[] subjects;
    private int position;

    ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects[position++];
    }

    @Override
    public Boolean isDone() {
        return position >= subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[position];
    }
}
