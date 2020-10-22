package com.mdeigs.group4.iteratorpattern.cre.domain;

public class UserData {
    private final String name;
    private final String address;
    private final double payment;

    public UserData(String name, String address, double payment) {
        this.name = name;
        this.address = address;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return String.format("CreUsername: %s Address: %s Payment %s", this.name, this.address, this.payment);
    }
}
