package com.mdeigs.group4.iteratorpattern.google;

import com.mdeigs.group4.iteratorpattern.google.domain.GoogleUser;
import com.mdeigs.group4.iteratorpattern.shared.Aggregate;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

public class Google implements Aggregate {

    public GoogleUser[] getGoogleUsers() {
        return new GoogleUser[]{
                new GoogleUser("Danae", "d@gmail.com"),
                new GoogleUser("Joaquin", "j@gmail.com"),
                new GoogleUser("Brian", "b@gmail.com")
        };
    }

    @Override
    public Iterator createIterator() {
        return new GoogleIterator(this);
    }

    @Override
    public Iterator createInverseIterator() {
        return new InverseGoogleIterator(this);
    }
}
