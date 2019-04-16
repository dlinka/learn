package com.cr.observer;


public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
