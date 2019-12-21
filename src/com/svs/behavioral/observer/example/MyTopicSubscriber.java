package com.svs.behavioral.observer.example;

class MyTopicSubscriber implements Observer {
    private String name;

    // not required. Could just pass subject state to update method, but also used to attach
    private  Subject topic;

    MyTopicSubscriber(String name) {
        this.name = name;
    }

    /**
     * This method could take data of subject state that was changed. Do not need to ask topic for it.
     */
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ": No new message");
        } else {
            System.out.println(name + ": Consuming message - " + msg);
        }
    }

    /**
     * Not required, but added so the observer can ask subject for state.
     * @param sub the subject
     */
    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}
