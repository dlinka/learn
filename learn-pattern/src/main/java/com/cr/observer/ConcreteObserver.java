package com.cr.observer;

public class ConcreteObserver implements Observer {

    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String name) {
        System.out.println(name);
    }

}
