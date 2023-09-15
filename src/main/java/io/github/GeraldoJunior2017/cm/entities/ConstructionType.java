package io.github.GeraldoJunior2017.cm.entities;

public enum ConstructionType {

    PUBLIC("Public"), PRIVATE("Private");

    private final String value;

    ConstructionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
