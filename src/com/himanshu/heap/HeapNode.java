package com.himanshu.heap;

abstract class  HeapNode {
    String data;
    HeapNode leftChildHeapNode;
    HeapNode rightChildHeapNode;

    HeapNode(String data) {
        this.data = data;
        leftChildHeapNode = new HeapNullNode();
        rightChildHeapNode = new HeapNullNode();
    }

    HeapNode() {
    }

    /**
     * This function calculates the depth of heap.
     * @return Depth of left sub heap.
     */
     abstract  int getHeapDepth();

}
