package com.mdeigs.group4.iteratorpattern.cre.domain;

public class CreUser {
    private final int id;
    private final UserData userData;

    public CreUser(int id, UserData userData) {
        this.id = id;
        this.userData = userData;
    }

    public int getId() {
        return id;
    }

    public UserData getUserData() {
        return userData;
    }

    @Override
    public String toString() {
        return String.format("CreUser Id: %s UserData: %s", this.id, this.userData);
    }
}
