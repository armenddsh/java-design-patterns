package com.shala.design.patterns.creational.builder;

public class House {
    private House(final int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    private int numberOfRooms;
    private boolean hasPool;
    private boolean hasGarage;
    private boolean hasFancyStatue;
    private boolean hasGarden;

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean hasPool() {
        return hasPool;
    }

    public void setPool(boolean pool) {
        this.hasPool = pool;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public void setGarage(boolean garage) {
        this.hasGarage = garage;
    }

    public boolean hasFancyStatue() {
        return hasFancyStatue;
    }

    public void setFancyStatue(boolean fancyStatue) {
        this.hasFancyStatue = fancyStatue;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    public void setGarden(boolean garden) {
        this.hasGarden = garden;
    }

    public static class HouseBuilder {
        public HouseBuilder(final int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
        }

        private int numberOfRooms;

        private boolean pool;
        private boolean garage;
        private boolean fancyStatue;
        private boolean garden;

        public HouseBuilder withPool() {
            this.pool = true;
            return this;
        }

        public HouseBuilder withGarage() {
            this.garage = true;
            return this;
        }

        public HouseBuilder withFancyStatue() {
            this.fancyStatue = true;
            return this;
        }

        public HouseBuilder withGarden() {
            this.garden = true;
            return this;
        }

        public House build() {
            final House house = new House(this.numberOfRooms);
            house.hasGarage = garage;
            house.hasFancyStatue = fancyStatue;
            house.hasGarden = garden;
            house.hasPool = pool;

            return house;
        }
    }
}
