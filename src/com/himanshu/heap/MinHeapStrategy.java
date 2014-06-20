package com.himanshu.heap;

public class MinHeapStrategy implements HeapStrategy {

    /**
     * This function compare new node with current node. The larger of two node
     * is inserted to sub heap with small height. If height of both sub heap are
     * same then the larger of two node is inserted in left sub heap. The
     * function is repeated until a node is added to a new node at the bottom of
     * the heap.
     *
     * @param currentHeapNode
     *            The current node that new node is compared to.
     * @param newHeapNode
     *            The new node to be inserted.
     * */
    public void insertNode(HeapNode currentHeapNode, HeapNode newHeapNode) {
        if (currentHeapNode.data.compareTo(newHeapNode.data) < 0) {
            if (currentHeapNode.leftChildHeapNode.getHeapDepth() <= currentHeapNode.rightChildHeapNode.getHeapDepth()) {
                if (currentHeapNode.rightChildHeapNode instanceof HeapNullNode)
                    currentHeapNode.leftChildHeapNode = newHeapNode; // If currentHeapNode leftChildHeapNode is nullNode
                else
                    insertNode(currentHeapNode.leftChildHeapNode, newHeapNode);
            }
            else {
                if (currentHeapNode.rightChildHeapNode instanceof HeapNullNode)
                    currentHeapNode.rightChildHeapNode = newHeapNode; // If currentHeapNode rightChildHeapNode is nullNode
                else
                    insertNode(currentHeapNode.rightChildHeapNode, newHeapNode);
            }
        }
        else {
            // swap nodes
            String data = currentHeapNode.data;
            currentHeapNode.data = newHeapNode.data;
            newHeapNode.data = data;
            insertNode(currentHeapNode, newHeapNode);
        }
    }
}
