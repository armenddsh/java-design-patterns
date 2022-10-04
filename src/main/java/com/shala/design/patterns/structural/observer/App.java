package com.shala.design.patterns.structural.observer;

public class App {
    public static void main(String[] args) {
        
        Observer observerImpl = new ObserverImpl();
        SubjectImpl subject = new SubjectImpl();

        subject.register(observerImpl);

        subject.updateSomething("a");
        subject.notifyObservers();
    }
}