package practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListActivity {

	public static void main(String[] args) {
		
		LinkedList<String> myLinkedList = new LinkedList<>();
		
		myLinkedList.addAll(Arrays.asList("one","two","three","four","five","six"));
		
		System.out.println("forward iteration : ");
		for (String string : myLinkedList) {
			System.out.print(string+ " ");
		}
		System.out.println();
		
		System.out.println("backward iteration : ");
		Iterator<String> spl = myLinkedList.descendingIterator();
		while(spl.hasNext()) {
			System.out.print(spl.next() + " ");
		}
		
		// Add element at specific position - index should be one more than the last element else
		// will get index out of bounds exception
		myLinkedList.add(6, "six");
		// Add element at the first position move remaining element forward
		myLinkedList.addFirst("me me");
		// Add element at last of the list
		myLinkedList.addLast("me me");
		
		System.out.println(myLinkedList);
		// Get first occurrence of given element
		System.out.println(myLinkedList.indexOf("six"));
		// Get last occurrence of given element
		System.out.println(myLinkedList.lastIndexOf("six"));
		
		// Clone a linked list into another list
		List<String> list2 = (List<String>) myLinkedList.clone();
		System.out.println(list2);
	}

}
