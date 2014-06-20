package com.himanshu.heap;

interface HeapStrategy {

    /**
     * This function compare new node with current node and insert in heap. The
     * function is repeated until a node is added to a new node at the bottom of
     * the heap.
     *
     * @param currentHeapNode
     *            The current node that new node is compared to.
     * @param newHeapNode
     *            The new node to be inserted.
     * */
    void insertNode(HeapNode currentHeapNode, HeapNode newHeapNode);

}
