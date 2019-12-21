package com.svs.behavioral.observer.example;

interface Observer {
    // method to update the observers used by the subject
    void update();

    /**
     * Attach with subject to observe. not required, but added so that the observer can query the subject to see if an
     * an update has occurred.
     * @param sub the subject
     */
    void setSubject(Subject sub);
}
