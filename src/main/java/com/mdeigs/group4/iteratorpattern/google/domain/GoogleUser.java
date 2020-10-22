package com.mdeigs.group4.iteratorpattern.google.domain;

public class GoogleUser {

    private final String name;
    private final String email;

    public GoogleUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("GUserName: %s Email: %s", this.name, this.email);
    }
}
