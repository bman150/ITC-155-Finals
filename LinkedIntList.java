package week08;

// Written by Alexander Baker on 6/9/2020
// contains the isSorted method for Assignment week 8 ch16 p.1023 e.3
// contains the hasTwoConsecutive method for Final: ch16 p.1024 e.6
public class LinkedIntList {
	private ListNode front; // first value in the list
	
	// method constructs an empty list
	public LinkedIntList() {
		front = null;
	}
	
	// toString method returns the values in the list in string form
	public String toString() {
		if (front == null) {
			return "[]";
		} else {
			String result = "[" + front.data;
			ListNode current = front.next;
			while (current != null) {
				result += ", " + current.data;
				current = current.next;
			}
			result += "]";
			return result;
		}
	}
	
	// adds a given value to the end of the list
	public void add(int value) {
		if (front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
	}
	
	// adds a given value at the given index of the list
	public void add(int index, int value) {
		if (index == 0) {
			front = new ListNode(value, front);
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = new ListNode(value, current.next);
		}
	}
	
	// method adds given value to the list so as to preserve
	// sorted(non-decreasing) order, duplicates allowed
	public void addSorted(int value) {
		if (front == null || front.data >= value) {
			front = new ListNode(value, front);
		} else {
			ListNode current = front;
			while (current.next != null && current.next.data < value) {
				current = current.next;
			}
			current.next = new ListNode(value, current.next);
		}
	}
	
	// method locates and returns value of given index of the list
	public int get(int index) {
		ListNode current = front;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.data;
	}
	
	// method removes the value at the given index
	public void remove (int index) {
		if (index == 0) {
			front = front.next;
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = current.next.next;
		}
	}
	
	// method returns the current number of elements in the list
	public int size() {
		int count = 0;
		ListNode current = front;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	// Assignment 8 ch16 p.1023 e.3
	// isSorted method returns 'true' if the list is in
	// sorted(non-decreasing) order and returns false if otherwise.
	// An empty list is considered to be sorted.
	public boolean isSorted() {
		boolean sorted = true;
		int previous = 0;
		ListNode current = front;
		while (current != null) {
			if (current.data >= previous) {
				sorted = true;
			} else {
				sorted = false;
			}
			previous = current.data;
			current = current.next;
		}
		
		return sorted;
	}
	
	// Final: ch16 p.1024 e.6
	// returns whether or not a list of integers has two adjacent numbers that are consecutive integers.
	public boolean hasTwoConsecutive() {
		//int consecutive = 0;
		//int previous = 0;
		ListNode current = front;
		int consecutive = 0;
		int previous = current.next.data;
		while (current != null) {
			if (current.data - previous == 1) {
				consecutive++;
				previous = current.data;
				current = current.next;
			} else {
				previous = current.data;
				current = current.next;
			}
		}
		if (consecutive > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// method returns the position of the first occurrence of given value
	// (returns -1 if not found)
	public int indexOf(int value) {
		int index = 0;
		ListNode current = front;
		while (current != null) {
			if (current.data == value) {
				return index;
			}
			index++;
			current = current.next;
		}
		return -1;
	}
	
	// returns a reference to the node at the given index of the list
	private ListNode nodeAt(int index) {
		ListNode current = front;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}
}
