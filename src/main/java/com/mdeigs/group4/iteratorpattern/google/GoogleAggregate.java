package com.mdeigs.group4.iteratorpattern.google;

import com.mdeigs.group4.iteratorpattern.shared.Aggregate;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class GoogleAggregate implements Aggregate {

    @Override
    public Iterator createIterator() {
        return new GoogleIterator();
    }

    @Override
    public Iterator createInverseIterator() {
        return new InverseGoogleIterator();
    }
}
