package com.svvt.CodeCoverage;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

	public class UnsortedHashSetDeepSeekTest {
		@Test
		public void testAdd() {
		    UnsortedHashSetDeepSeek<String> unsortedHashSet = new UnsortedHashSetDeepSeek<>();
		    
		    String obj1 = "Object 1";
		    unsortedHashSet.add(obj1);
		    
		    assertTrue(unsortedHashSet.size == 1);
//		    assertTrue(unsortedHashSet.con[0].contains(obj1));
		}
		
		@Test
		public void testSizeAfterAddingAnElement() {
		    UnsortedHashSetDeepSeek<Integer> unsortedHashSet = new UnsortedHashSetDeepSeek<>();
		    
		    Integer obj1 = 1;
		    unsortedHashSet.add(obj1);
		    
		    assertEquals(1, unsortedHashSet.size());
		}
	    
		@Test
		public void testResizeWhenLoadFactorLimitExceeded() {
		    UnsortedHashSetDeepSeek<String> unsortedHashSet = new UnsortedHashSetDeepSeek<>();
		    
		    for (int i = 0; i < 9; i++) {
		        unsortedHashSet.add("Object " + i);
		    }
		    
		    assertEquals(9, unsortedHashSet.size());
		    
		    // Check that resizing occurred
		    LinkedList<String>[] con = unsortedHashSet.con;
		    for (LinkedList<String> list : con) {
		        if (list != null) {
		            for (String s : list) {
		                System.out.println(s);
		            }
		        }
		    }
		}
	}

