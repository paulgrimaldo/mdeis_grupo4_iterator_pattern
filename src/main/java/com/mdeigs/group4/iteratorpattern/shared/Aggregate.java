package com.mdeigs.group4.iteratorpattern.shared;

public interface Aggregate {

    Iterator createIterator();

    Iterator createInverseIterator();
}
