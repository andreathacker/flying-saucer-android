package com.dat.flyingsaucer.util.extensions;

import java.util.ArrayList;

/**
 * Created by davidthacker on 5/23/15.
 */
public class FSArrayList<E> extends ArrayList<E> {

    public boolean notEmpty() {
        return !isEmpty();
    }

    public boolean hasItems() {
        if (this != null && notEmpty()) {
            return true;
        }

        return false;
    }

    public boolean hasOneItem() {
        if (notEmpty() && size() == 1) {
            return true;
        }

        return false;
    }

    public E getFirstItem() {
        if (hasItems()) {
            return this.get(0);
        }

        return null;
    }
}
