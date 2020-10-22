package com.mdeigs.group4.iteratorpattern;

import com.mdeigs.group4.iteratorpattern.cre.CreAggregate;
import com.mdeigs.group4.iteratorpattern.facebook.FacebookAggregate;
import com.mdeigs.group4.iteratorpattern.google.GoogleAggregate;
import com.mdeigs.group4.iteratorpattern.shared.Aggregate;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class IteratorClient {

    public static void main(String[] args) {
        Aggregate facebook = new FacebookAggregate();
        printUsers(facebook.createIterator());
        printUsers(facebook.createInverseIterator());

        Aggregate google = new GoogleAggregate();
        printUsers(google.createIterator());
        printUsers(google.createInverseIterator());

        Aggregate cre = new CreAggregate();
        printUsers(cre.createIterator());
        printUsers(cre.createInverseIterator());
    }

    public static void printUsers(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
        }
    }
}
