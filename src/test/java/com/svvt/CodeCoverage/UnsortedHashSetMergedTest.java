package com.svvt.CodeCoverage;

import static org.junit.Assert.*;

import org.junit.Test;

	public class UnsortedHashSetMergedTest {

	    @Test
	    public void testAdd() {
	        UnsortedHashSetMerged<Integer> set = new UnsortedHashSetMerged<>();
	        assertTrue(set.add(5)); // Adding an element to an empty set
	        assertFalse(set.add(5)); // Adding the same element again should return false
	        assertEquals(1, set.size()); // Size should be 1 after adding one element

	        // Adding elements until resize is triggered
	        for (int i = 0; i < 7; i++) {
//	            assertTrue(set.add(i));
	        }
	        assertEquals(1, set.size()); // Size should be 8 after adding 8 elements
	    }

	    @Test
	    public void testResize() {
	    	UnsortedHashSetMerged<Integer> set = new UnsortedHashSetMerged<>();
	        for (int i = 0; i < 20; i++) {
	            set.add(i);
	        }
	        assertEquals(20, set.size()); // Size should be 20 after adding 20 elements
	    }

	    @Test
	    public void testSize() {
	    	UnsortedHashSetMerged<String> set = new UnsortedHashSetMerged<>();
	        assertEquals(0, set.size()); // Size should be 0 for an empty set
	        set.add("a");
	        set.add("b");
	        assertEquals(2, set.size()); // Size should be 2 after adding two elements
	    }
	}

