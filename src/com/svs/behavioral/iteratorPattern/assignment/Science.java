package com.svs.behavioral.iteratorPattern.assignment;

import java.util.LinkedList;

class Science implements Subject{

    private LinkedList<String> subjects;

    Science() {
        subjects = new LinkedList<>();
        subjects.addLast("Maths");
        subjects.addLast("Computer Science");
        subjects.addLast("Physics");
    }

    @Override
    public IteratorInterface createIterator() {
        return new ScienceIterator(subjects);
    }
}
