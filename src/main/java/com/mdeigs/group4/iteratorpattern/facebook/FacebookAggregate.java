package com.mdeigs.group4.iteratorpattern.facebook;

import com.mdeigs.group4.iteratorpattern.shared.Aggregate;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class FacebookAggregate implements Aggregate {

    @Override
    public Iterator createIterator() {
        return new FacebookIterator();
    }

    @Override
    public Iterator createInverseIterator() {
        return new InverseFacebookIterator();
    }
}
