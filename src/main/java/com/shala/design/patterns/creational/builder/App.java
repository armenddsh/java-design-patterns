package com.shala.design.patterns.creational.builder;

public class App {
    public static void main(String[] args) {
        
        final House house = new House.HouseBuilder(3)
                .withFancyStatue()
                .withGarage()
                .withPool()
                .withGarden()
                .build();

        System.out.println(house);

    }
}
