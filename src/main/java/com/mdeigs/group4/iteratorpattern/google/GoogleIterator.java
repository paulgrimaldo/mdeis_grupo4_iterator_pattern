package com.mdeigs.group4.iteratorpattern.google;

import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class GoogleIterator implements Iterator {

    private Google google;
    private int position;

    public GoogleIterator(Google google) {
        this.google = google;
        this.position = 0;
    }

    @Override
    public boolean isDone() {
        return this.position >= this.google.getGoogleUsers().length;
    }

    @Override
    public String currentItem() {
        return this.google.getGoogleUsers()[this.position++].toString();
    }
}
