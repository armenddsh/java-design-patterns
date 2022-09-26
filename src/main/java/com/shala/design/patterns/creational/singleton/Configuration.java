package com.shala.design.patterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Configuration {
    private static final Configuration INSTANCE = new Configuration();
    private final Map<String, String> configuration = new HashMap<>();

    public Map<String, String> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(final String key, final String value) {
        configuration.put(key, value);
    }

    private void loadConfiguration() {
        // need to implement
    }

    private Configuration() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Configuration that = (Configuration) o;
        return Objects.equals(configuration, that.configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configuration);
    }

    public static Configuration getInstance() {
        return INSTANCE;
    }
}
