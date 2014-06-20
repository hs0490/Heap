package com.himanshu.testcases;


import com.himanshu.heap.Heap;
import com.himanshu.heap.MaxHeapStrategy;
import com.himanshu.heap.MinHeapStrategy;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class HeapTest {

    @Test
    public void testAdd() throws Exception {
        Heap testHeap = new Heap(new MaxHeapStrategy());
        testHeap.add("asking");
        testHeap.add("cooking");
        assertEquals("[asking, cooking]", testHeap.toString());
    }

    @Test
    public void testSize() throws Exception {
        Heap testHeap = new Heap(new MaxHeapStrategy());
        testHeap.add("asking");
        testHeap.add("class");
        testHeap.add("cooking");
        testHeap.add("chair");
        testHeap.add("table");
        assertTrue(testHeap.size() == 5);
    }

    @Test
    public void testToArray() throws Exception {
        Heap testHeap = new Heap(new MaxHeapStrategy());
        testHeap.add("asking");
        testHeap.add("class");
        testHeap.add("cooking");
        testHeap.add("chair");
        testHeap.add("table");
        Object actualArray[] = testHeap.toArray();
        Object expectedArray[] = {"asking","chair","table","class","cooking"};
        assertArrayEquals(expectedArray,actualArray);
    }

    @Test
    public void testToString() throws Exception {
        Heap testHeap = new Heap(new MinHeapStrategy());
        testHeap.add("asking");
        testHeap.add("class");
        testHeap.add("cooking");
        testHeap.add("chair");
        testHeap.add("table");
        String heapElements = testHeap.toString();
        assertEquals("[class, chair, asking, table, cooking]", heapElements);
    }

    @Test
    public void testIterator() throws Exception {

        Heap testHeap = new Heap(new MinHeapStrategy());
        testHeap.add("asking");
        testHeap.add("class");
        testHeap.add("cooking");
        testHeap.add("chair");
        testHeap.add("table");
        Iterator testIterator = testHeap.iterator();
        assertTrue(testIterator.hasNext());
        assertEquals("class", testIterator.next());
        assertTrue(testIterator.hasNext());
        assertEquals("chair", testIterator.next());
        assertTrue(testIterator.hasNext());
        assertEquals("asking", testIterator.next());
        assertTrue(testIterator.hasNext());
        assertEquals("table", testIterator.next());
        assertTrue(testIterator.hasNext());
        assertEquals("cooking", testIterator.next());
        assertFalse(testIterator.hasNext());
    }

}
