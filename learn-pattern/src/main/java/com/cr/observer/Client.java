package com.cr.observer;

public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        new ConcreteObserver(subject);
        subject.setName("CR");
    }

}
