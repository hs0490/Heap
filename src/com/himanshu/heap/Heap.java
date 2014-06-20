/**
 *
 * Name : Himanshu Saxena           REDID: 817349215        Data: 6 March, 2014
 *
 *                                   Assignment 2
 *                  CS 635 Advanced Object-Oriented Programming
 *                            Instructor : Dr. Roger Whitney
 *
 */
package com.himanshu.heap;

import java.util.ArrayList;
import java.util.Iterator;

public class Heap{

    private HeapNode rootHeapNode;
    int count;
    private HeapStrategy strategy;

    public Heap(HeapStrategy strategy){
        this.strategy = strategy;
    }

    protected Heap(){
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size(){
        return count;
    }

    /**
     * Returns an array containing all of the elements in this collection.
     * @return an array containing all of the elements in this collection
     */
    public Object[] toArray() {
        Object[] dataArray = new Object[size()];
        Iterator aHeapIterator = iterator();
        int i=0;
        while(aHeapIterator.hasNext()){
            dataArray[i] = aHeapIterator.next();
            i++;
        }
        return dataArray;
    }

    /**
     * Returns String containing all of the elements in this collection.
     * @return - String
     */
    public String toString() {
        ArrayList<String> dataList = new ArrayList<String>();
        Iterator heapIterator = iterator();
        while (heapIterator.hasNext())
            dataList.add((String)heapIterator.next());
        return dataList.toString();
    }

    /**
     * Returns an iterator over a set of elements.
     * @return an Iterator.
     */
    public Iterator iterator() {

        return new HeapIterator(rootHeapNode);
    }

    /**
     * This function add HeapNode in Heap.
     * @param data
     *            The value of the node
     */
    public boolean add(Object data) {
        HeapNode newHeapNode = new HeapRealNode((String)data);
        if(rootHeapNode == null)
            rootHeapNode = newHeapNode;
        else
            strategy.insertNode(rootHeapNode, newHeapNode);
        count++;
        return true;
    }

}
