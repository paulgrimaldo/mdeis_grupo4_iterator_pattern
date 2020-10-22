package com.mdeigs.group4.iteratorpattern.facebook;

import com.mdeigs.group4.iteratorpattern.facebook.domain.FacebookUser;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

import java.util.List;

public class FacebookIterator implements Iterator {

    private final List<FacebookUser> facebookUsers;
    private int position;

    public FacebookIterator() {
        this.facebookUsers = FacebookApi.getFacebookUsers();
        this.position = 0;
    }

    @Override
    public boolean isDone() {
        return this.position >= this.facebookUsers.size();
    }

    @Override
    public String currentItem() {
        return this.facebookUsers.get(this.position++).toString();
    }
}
