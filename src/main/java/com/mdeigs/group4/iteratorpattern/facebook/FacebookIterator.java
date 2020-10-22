package com.mdeigs.group4.iteratorpattern.facebook;

import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class FacebookIterator implements Iterator {

    private final Facebook facebook;
    private int position;

    public FacebookIterator(Facebook facebook) {
        this.facebook = facebook;
        this.position = 0;
    }

    @Override
    public boolean isDone() {
        return this.position >= this.facebook.getFacebookUsers().size();
    }

    @Override
    public String currentItem() {
        return this.facebook.getFacebookUsers().get(this.position++).toString();
    }
}
