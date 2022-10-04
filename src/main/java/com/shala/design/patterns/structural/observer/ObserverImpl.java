package com.shala.design.patterns.structural.observer;

public class ObserverImpl implements Observer {

    @Override
    public void update(Object object) {
        System.out.println("Update: " + object);   
    }
}