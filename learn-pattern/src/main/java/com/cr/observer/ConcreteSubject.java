package com.cr.observer;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ConcreteSubject implements Subject {

    private ArrayList<Observer> observers;
    private String name;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); ++i) {
            Observer observer = observers.get(i);
            observer.update(name);
        }
    }

    public void setName(String name){
        this.name = name;
        notifyObservers();
    }

}
