package com.himanshu.heap;

import java.util.Iterator;

public class IngFilter implements Iterator {

    private Iterator heapIterator;
    private String nodeData;
    public IngFilter(Iterator input){
        heapIterator =  input;
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        while(heapIterator.hasNext()){
            String data = (String) heapIterator.next();
            if(data.endsWith("ing")){
                nodeData = data;
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     */
    @Override
    public String next(){
        if(nodeData == null)
            hasNext();
        String data = nodeData;
        nodeData = null;
        return data;
    }

    @Override
    public void remove() {
    }
}
