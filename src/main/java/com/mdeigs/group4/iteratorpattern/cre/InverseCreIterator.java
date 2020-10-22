package com.mdeigs.group4.iteratorpattern.cre;

import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class InverseCreIterator implements Iterator {
    private final Cre cre;
    private int position;

    public InverseCreIterator(Cre cre) {
        this.cre = cre;
        this.position = this.cre.getCreUsers().size() - 1;
    }

    @Override
    public boolean isDone() {
        return this.position < 0;
    }

    @Override
    public String currentItem() {
        return this.cre.getCreUsers().get(this.position--).getUserData().toString();
    }
}
