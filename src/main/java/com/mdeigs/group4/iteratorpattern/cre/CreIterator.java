package com.mdeigs.group4.iteratorpattern.cre;

import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class CreIterator implements Iterator {
    private final Cre cre;
    private int position;

    public CreIterator(Cre cre) {
        this.cre = cre;
        this.position = 0;
    }

    @Override
    public boolean isDone() {
        return this.position >= this.cre.getCreUsers().size();
    }

    @Override
    public String currentItem() {
        return this.cre.getCreUsers().get(this.position++).getUserData().toString();
    }
}
