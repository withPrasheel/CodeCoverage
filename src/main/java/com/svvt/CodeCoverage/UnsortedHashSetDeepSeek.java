package com.svvt.CodeCoverage;

import java.util.LinkedList;
import java.lang.reflect.Array;


public class UnsortedHashSetDeepSeek<E> {
 
   private static final double LOAD_FACTOR_LIMIT = 0.7;
  
   public int size;
   public LinkedList<E>[] con;
  
   public UnsortedHashSetDeepSeek() {
       con  = (LinkedList<E>[])(new LinkedList[10]);
   }
  
   public boolean add(E obj) {
       int oldSize = size;
       int index = Math.abs(obj.hashCode()) % con.length;
       if(con[index] == null)
           con[index] = new LinkedList<E>();
       if(!con[index].contains(obj)) {
           con[index].add(obj);
           size++;
          
       }
       if(1.0 * size / con.length > LOAD_FACTOR_LIMIT)
           resize();
       return oldSize != size;
   }


   private void resize() {
	   UnsortedHashSetDeepSeek<E> temp = new UnsortedHashSetDeepSeek<E>();
       temp.con = (LinkedList<E>[])(new LinkedList[con.length * 2 + 1]);
       for(int i = 0; i < con.length; i++){
           if(con[i] != null)
               for(E e : con[i])
                   temp.add(e);
       }
       con = temp.con;
   }
  
   public int size() {
       return size;
   }
}
