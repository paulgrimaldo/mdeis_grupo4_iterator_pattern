package com.mdeigs.group4.iteratorpattern.facebook;

import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class InverseFacebookIterator implements Iterator {

    private final Facebook facebook;
    private int position;

    public InverseFacebookIterator(Facebook facebook) {
        this.facebook = facebook;
        this.position = this.facebook.getFacebookUsers().size() - 1;
    }

    @Override
    public boolean isDone() {
        return this.position < 0;
    }

    @Override
    public String currentItem() {
        return this.facebook.getFacebookUsers().get(this.position--).toString();
    }
}
