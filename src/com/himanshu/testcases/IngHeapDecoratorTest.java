package com.himanshu.testcases;


import com.himanshu.heap.Heap;
import com.himanshu.heap.IngHeapDecorator;
import com.himanshu.heap.MaxHeapStrategy;
import com.himanshu.heap.MinHeapStrategy;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class IngHeapDecoratorTest {
    @Test
    public void testToArray() throws Exception {
        Heap testHeap = new Heap(new MinHeapStrategy());
        testHeap.add("asking");
        testHeap.add("class");
        testHeap.add("cooking");
        testHeap.add("chair");
        testHeap.add("table");
        testHeap = new IngHeapDecorator(testHeap);
        Object[] expectedArray = {"asking","cooking"};
        Object[] actualArray = testHeap.toArray();
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
        testHeap = new IngHeapDecorator(testHeap);
        String heapElements = testHeap.toString();
        assertEquals("[asking, cooking]",heapElements);
    }

    @Test
    public void testIterator() throws Exception {
        Heap testHeap = new Heap(new MaxHeapStrategy());
        testHeap.add("asking");
        testHeap.add("class");
        testHeap.add("cooking");
        testHeap.add("chair");
        testHeap.add("table");
        testHeap = new IngHeapDecorator(testHeap);
        Iterator ingIterator = testHeap.iterator();

        assertTrue(ingIterator.hasNext());
        assertEquals("asking", ingIterator.next());
        assertEquals("cooking",ingIterator.next());
        assertFalse(ingIterator.hasNext());
    }

    @Test
    public void testSize() throws Exception {
        Heap testHeap = new Heap(new MaxHeapStrategy());
        testHeap.add("asking");
        testHeap.add("class");
        testHeap.add("cooking");
        testHeap.add("chair");
        testHeap.add("table");
        testHeap = new IngHeapDecorator(testHeap);
        assertEquals(2,testHeap.size());
    }

}
