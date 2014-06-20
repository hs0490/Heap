package com.himanshu.heap;

public class HeapRealNode extends HeapNode{

    HeapRealNode(String data) {
        super(data);
    }

    /**
     * This function calculates the depth of heap.
     * @return Depth of left sub heap.
     */
     int getHeapDepth(){
        return 1 + Math.max(leftChildHeapNode.getHeapDepth(),
                (rightChildHeapNode.getHeapDepth()));
    }

}
