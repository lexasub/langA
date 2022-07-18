package org.lexasub.langos.utils;

import org.antlr.v4.runtime.misc.Pair;

import java.util.ListIterator;

public class PrevThatIterator implements ListIterator {
    ListIterator it;
    PrevThatIterator(ListIterator it){
        this.it = it;
    }
    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public Pair next() {
        it = (ListIterator) it.next() ;
        var b = it.next();
        return new Pair(it, b);
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public Pair previous() {
        return null;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(Object o) {

    }

    @Override
    public void add(Object o) {

    }
}
