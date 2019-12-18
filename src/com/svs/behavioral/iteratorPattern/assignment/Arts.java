package com.svs.behavioral.iteratorPattern.assignment;

class Arts implements Subject {

    private String[] subjects;

    Arts() {
        subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    @Override
    public IteratorInterface createIterator() {
        return new ArtsIterator(subjects);
    }
}
