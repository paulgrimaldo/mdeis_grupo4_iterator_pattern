package com.mdeigs.group4.iteratorpattern.google;

import com.mdeigs.group4.iteratorpattern.google.domain.GoogleUser;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class GoogleIterator implements Iterator {

    private final GoogleUser[] googleUsers;
    private int position;

    public GoogleIterator() {
        this.position = 0;
        this.googleUsers = GoogleApi.getGoogleUsers();
    }

    @Override
    public boolean isDone() {
        return this.position >= this.googleUsers.length;
    }

    @Override
    public String currentItem() {
        return this.googleUsers[this.position++].toString();
    }
}
