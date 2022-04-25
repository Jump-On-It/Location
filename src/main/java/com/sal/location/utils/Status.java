package com.sal.location.utils;

public enum Status {


    OCCUPIED("Occupied"), VACANT("vacant");
    private String name;

    private Status(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
