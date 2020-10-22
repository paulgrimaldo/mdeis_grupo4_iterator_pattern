package com.mdeigs.group4.iteratorpattern.cre;

import com.mdeigs.group4.iteratorpattern.cre.domain.CreUser;
import com.mdeigs.group4.iteratorpattern.shared.Aggregate;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

import java.util.List;
import java.util.stream.Collectors;

public class Cre implements Aggregate {

    public List<CreUser> getCreUsers() {
        return CREApi.getCREInfo()
                .entrySet()
                .stream()
                .map(entry -> new CreUser(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public Iterator createIterator() {
        return new CreIterator(this);
    }

    @Override
    public Iterator createInverseIterator() {
        return new InverseCreIterator(this);
    }
}
