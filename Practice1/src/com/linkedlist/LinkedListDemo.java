package com.linkedlist;

import java.util.*;

public class LinkedListDemo {

   public static void main(String args[]) {
      
	   ArrayList<String> arr=new ArrayList<String>();
	   arr.add("a");
	   arr.add("b");
	   arr.add("c");
	   
	   arr.add(0, "d");
	   
	   arr.get(2);
	   
	   
	   
	   // create a linked list
	   
      LinkedList ll = new LinkedList();
      // add elements to the linked list
      ll.add("F");
      ll.add("B");
      ll.add("D");
      ll.add("E");
      ll.add("C");
      ll.addLast("Z");
      ll.addFirst("A");
      ll.add(1, "A2");
      System.out.println("Original contents of ll: " + ll);

      // remove elements from the linked list
      ll.remove("F");
      ll.remove(2);
      System.out.println("Contents of ll after deletion: "
       + ll);
      
      // remove first and last elements
      ll.removeFirst();
      ll.removeLast();
      System.out.println("ll after deleting first and last: "
       + ll);

      // get and set a value
      Object val = ll.get(2);
      ll.set(2, (String) val + " Changed");
      System.out.println("ll after change: " + ll);
      System.out.println("and now");
      System.out.println();
      for(Object str:ll)
      {
         System.out.println(str); 
      }
   }
}
