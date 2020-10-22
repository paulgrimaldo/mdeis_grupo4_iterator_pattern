package com.mdeigs.group4.iteratorpattern.facebook;

import com.mdeigs.group4.iteratorpattern.facebook.domain.FacebookUser;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

import java.util.List;

public class InverseFacebookIterator implements Iterator {

    private final List<FacebookUser> facebookUsers;
    private int position;

    public InverseFacebookIterator() {
        this.facebookUsers = FacebookApi.getFacebookUsers();
        this.position = this.facebookUsers.size() - 1;
    }

    @Override
    public boolean isDone() {
        return this.position < 0;
    }

    @Override
    public String currentItem() {
        return this.facebookUsers.get(this.position--).toString();
    }
}
