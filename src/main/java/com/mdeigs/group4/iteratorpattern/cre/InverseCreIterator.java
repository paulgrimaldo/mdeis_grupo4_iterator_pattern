package com.mdeigs.group4.iteratorpattern.cre;

import com.mdeigs.group4.iteratorpattern.cre.domain.CreUser;
import com.mdeigs.group4.iteratorpattern.shared.Iterator;

import java.util.List;
import java.util.stream.Collectors;

public class InverseCreIterator implements Iterator {
    private int position;
    private final List<CreUser> creUsers;

    public InverseCreIterator() {
        this.creUsers = CreApi.getCREInfo()
                .entrySet()
                .stream()
                .map(entry -> new CreUser(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
        this.position = this.creUsers.size() - 1;
    }

    @Override
    public boolean isDone() {
        return this.position < 0;
    }

    @Override
    public String currentItem() {
        return this.creUsers.get(this.position--).getUserData().toString();
    }
}
