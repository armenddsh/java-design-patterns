package com.shala.design.patterns.creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

public class SingletonTest {

    @Test
    public void testSingleton() {

        final Configuration configuration1 = Configuration.getInstance();
        final Map<String, String> map1 = configuration1.getConfiguration();

        configuration1.setConfiguration("A", "B");

        final Configuration configuration2 = Configuration.getInstance();

        final Map<String, String> map2 = configuration1.getConfiguration();

        assertEquals(map1, map2);
        assertEquals(configuration1, configuration2);
    }
}
