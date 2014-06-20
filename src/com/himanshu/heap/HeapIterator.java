package com.himanshu.heap;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;


class HeapIterator implements Iterator {

    private HeapNode rootHeapNode = null;
    private Stack<HeapNode> visiting = new Stack<HeapNode>();
    private Stack<Boolean> visitingRightChild = new Stack<Boolean>();




    HeapIterator(HeapNode rootHeapNode){
        this.rootHeapNode = rootHeapNode;
        visiting = new Stack<HeapNode>();
        visitingRightChild = new Stack<Boolean>();
    }

    /**
    * Returns {@code true} if the iteration has more elements.
    * @return {@code true} if the iteration has more elements
    */
    @Override
     public boolean hasNext() {
        return rootHeapNode != null;
     }

     /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws java.util.NoSuchElementException if the iteration has no more elements
     */
     @Override
     public String next() {
         if(!hasNext())
             throw new NoSuchElementException();
         if (visiting.empty())
             pushLeftmostNode(rootHeapNode);
         HeapNode heapNode = visiting.pop();
         String result =  heapNode.data;
         if (!(heapNode.rightChildHeapNode instanceof HeapNullNode)) {
             HeapNode right = heapNode.rightChildHeapNode;
             pushLeftmostNode (right);
            }
         if (visiting.empty())
             rootHeapNode = null;
         return result;
        }


     /* To find the leftmost heapNode from this root,
      *@param	heapNode the root of the subtree
      */
     private void pushLeftmostNode(HeapNode heapNode) {
         // find the leftmost heapNode
         if (!(heapNode instanceof HeapNullNode)) {
             visiting.push(heapNode); // push this heapNode
             pushLeftmostNode(heapNode.leftChildHeapNode); // recurse on next left heapNode
         }
     }

     @Override
     public void remove() {
     }
}
