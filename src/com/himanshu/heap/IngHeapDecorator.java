package com.himanshu.heap;

import java.util.ArrayList;
import java.util.Iterator;

public class IngHeapDecorator extends HeapDecorator {

    private Heap aHeap;

    public IngHeapDecorator(Heap aHeap){
        this.aHeap = aHeap;
    }

    @Override
    public Object[] toArray() {
        Object[] dataArray = new Object[size()];
        Iterator ingIterator = iterator();
        int i=0;
        while(ingIterator.hasNext()){
            dataArray[i] = ingIterator.next();
            i++;
        }
        return dataArray;
    }

    public String toString() {
        ArrayList<String> dataList = new ArrayList<String>();
        Iterator ingIterator = iterator();
        while (ingIterator.hasNext())
            dataList.add((String)ingIterator.next());
        return dataList.toString();
    }

    @Override
    public Iterator iterator() {
        return new IngFilter(aHeap.iterator());
    }

    @Override
    public int size() {
        Iterator ingIterator = iterator();
        int count= 0;
        while(ingIterator.hasNext())
            count++;
        return count;
    }


}
