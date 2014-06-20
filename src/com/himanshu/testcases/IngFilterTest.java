package com.himanshu.testcases;

import com.himanshu.heap.Heap;
import com.himanshu.heap.IngFilter;
import com.himanshu.heap.MaxHeapStrategy;
import com.himanshu.heap.MinHeapStrategy;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class IngFilterTest {
    @Test
    public void testHasNext() throws Exception {
        Heap testHeap = new Heap(new MinHeapStrategy());
        testHeap.add("asking");
        testHeap.add("class");
        Iterator aMinHeapIngFilter = new IngFilter( testHeap.iterator());
        assertTrue(aMinHeapIngFilter.hasNext());
        assertFalse(aMinHeapIngFilter.hasNext());
    }

    @Test
    public void testNext() throws Exception {
        Heap testHeap = new Heap(new MaxHeapStrategy());
        testHeap.add("cooking");
        testHeap.add("chair");
        testHeap.add("singing");
        Iterator aMinHeapIngFilter = new IngFilter(testHeap.iterator());
        assertEquals("singing", aMinHeapIngFilter.next());
        assertEquals("cooking", aMinHeapIngFilter.next());
    }

}
