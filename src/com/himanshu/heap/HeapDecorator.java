package com.himanshu.heap;

import java.util.Iterator;

abstract class HeapDecorator extends Heap {

    public abstract Object[] toArray();

    public abstract String toString();

    public abstract Iterator iterator();

    public abstract int size();

}
