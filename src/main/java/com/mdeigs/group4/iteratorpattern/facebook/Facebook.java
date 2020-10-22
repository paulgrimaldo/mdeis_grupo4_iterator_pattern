package com.mdeigs.group4.iteratorpattern.facebook;

import com.mdeigs.group4.iteratorpattern.facebook.domain.FacebookUser;
import com.mdeigs.group4.iteratorpattern.shared.Aggregate;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

import java.util.Arrays;
import java.util.List;

public class Facebook implements Aggregate {

    public List<FacebookUser> getFacebookUsers() {
        return Arrays.asList(
                new FacebookUser("LuisRoberto"),
                new FacebookUser("David"),
                new FacebookUser("Oscar")
        );
    }

    @Override
    public Iterator createIterator() {
        return new FacebookIterator(this);
    }

    @Override
    public Iterator createInverseIterator() {
        return new InverseFacebookIterator(this);
    }
}
