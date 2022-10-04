package com.shala.design.patterns.creational.singleton;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        final Configuration configuration1 = Configuration.getInstance();
        final Map<String, String> map1 = configuration1.getConfiguration();

        configuration1.setConfiguration("A", "B");

        final Configuration configuration2 = Configuration.getInstance();

        final Map<String, String> map2 = configuration1.getConfiguration();

        System.out.println(map1);
        System.out.println(map2);

        System.out.println(configuration1);
        System.out.println(configuration2);

        System.out.println(map1 == map2);
        System.out.println(configuration1 == configuration2);
    }
}
