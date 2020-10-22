package com.mdeigs.group4.iteratorpattern;

import com.mdeigs.group4.iteratorpattern.cre.Cre;
import com.mdeigs.group4.iteratorpattern.facebook.Facebook;
import com.mdeigs.group4.iteratorpattern.google.Google;
import com.mdeigs.group4.iteratorpattern.shared.Aggregate;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class IteratorClient {

    public static void main(String[] args) {
        Aggregate facebook = new Facebook();
        printUsers(facebook.createIterator());
        printUsers(facebook.createInverseIterator());

        Aggregate google = new Google();
        printUsers(google.createIterator());
        printUsers(google.createInverseIterator());

        Aggregate cre = new Cre();
        printUsers(cre.createIterator());
        printUsers(cre.createInverseIterator());
    }

    public static void printUsers(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
        }
    }
}
