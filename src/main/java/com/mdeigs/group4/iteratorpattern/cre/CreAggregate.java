package com.mdeigs.group4.iteratorpattern.cre;

import com.mdeigs.group4.iteratorpattern.shared.Aggregate;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class CreAggregate implements Aggregate {

    @Override
    public Iterator createIterator() {
        return new CreIterator();
    }

    @Override
    public Iterator createInverseIterator() {
        return new InverseCreIterator();
    }
}
