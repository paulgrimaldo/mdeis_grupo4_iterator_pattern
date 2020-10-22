package com.mdeigs.group4.iteratorpattern.google;

import com.mdeigs.group4.iteratorpattern.google.domain.GoogleUser;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class InverseGoogleIterator implements Iterator {

    private final GoogleUser[] googleUsers;
    private int position;

    public InverseGoogleIterator() {
        this.googleUsers = GoogleApi.getGoogleUsers();
        this.position = this.googleUsers.length - 1;
    }

    @Override
    public boolean isDone() {
        return this.position < 0;
    }

    @Override
    public String currentItem() {
        return this.googleUsers[this.position--].toString();
    }
}
