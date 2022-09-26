package com.shala.design.patterns.creational.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {
    @Test
    public void builderTest() {

        final House house = new House.HouseBuilder(3)
                .withFancyStatue()
                .withGarage()
                .withPool()
                .withGarden()
                .build();

        assertEquals(house.getNumberOfRooms(), 3);
        assertEquals(house.hasGarden(), true);
        assertEquals(house.hasGarage(), true);
        assertEquals(house.hasFancyStatue(), true);
        assertEquals(house.hasPool(), true);
    }
}
