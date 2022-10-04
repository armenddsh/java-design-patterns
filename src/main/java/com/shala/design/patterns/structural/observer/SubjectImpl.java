package com.shala.design.patterns.structural.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private Object object;

    @Override
    public void register(Observer observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        if (observer != null && observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.object);
        }
    }

    public void updateSomething(Object object) {
        this.object = object;
    }
}