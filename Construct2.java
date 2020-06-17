package week08;

// Written by Alexander Baker on 6/8/2020
// Test program for assignment week 8 ch16 p.1023 e.3
// Test program for Final: ch16 p.1024 e.6
public class Construct2 {

	public static void main(String[] args) {
		//ListNode list = new ListNode(3, new ListNode(7, new ListNode(12)));
		
		//System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);
		
		// create an empty LinkedIntList and fill the list
		//LinkedIntList list2 = new LinkedIntList();
		//list2.add(3);
		//list2.add(7);
		//list2.add(12);
		//System.out.println(list2.toString()); // "[3, 7, 12]"
		//System.out.println(list2.get(1)); // "7"
		
		// add the value 24 to index 1 of list2
		//list2.add(1, 24);
		//System.out.println(list2.toString()); // "[3, 24, 7, 12]"
		
		// remove the value at index 1 of list2
		//list2.remove(1);
		//System.out.println(list2.toString()); // "[3, 7, 12]"
		//System.out.println(list2.size()); // "3"
		
		// add value to list that still preserves the sorted(nondecreasing) order
		//list2.addSorted(24);
		//list2.addSorted(1);
		//System.out.println(list2.toString()); // "[1, 3, 7, 12, 24]"
		
		// create an empty LinkedIntList and don't fill it
		//LinkedIntList list3 = new LinkedIntList();
		//System.out.println(list3.toString()); // "[]"
		
		// Assignment 8 ch16 p.1023 e.3
		// test to see if isSorted method in LinkedIntList class works
		//System.out.println(list2.toString());
		//System.out.println("list in sorted order: " + list2.isSorted()); // Test 1 should print true
		//list2.add(2);
		//System.out.println(list2.toString());
		//System.out.println("list in sorted order: " + list2.isSorted()); // Test 2 should print false
		//System.out.println(list3.toString());
		//System.out.println("list in sorted order: " + list3.isSorted()); // Test 3 should print true
		//System.out.println();
		
		/*
		 * Tests for Final: ch16 p.1024 e.6
		 */
		// Test #1
		LinkedIntList list4 = new LinkedIntList();
		list4.add(1);
		list4.add(18);
		list4.add(2);
		list4.add(7);
		list4.add(8);
		list4.add(39);
		list4.add(18);
		list4.add(40);
		System.out.println("Test #1 should print true");
		System.out.println(list4.toString());
		System.out.println("Has two consecutive numbers: " + list4.hasTwoConsecutive()); // should print true
		
		// Test #2
		LinkedIntList list5 = new LinkedIntList();
		list5.add(2);
		list5.add(4);
		list5.add(6);
		list5.add(8);
		System.out.println("Test #2 should print false");
		System.out.println(list5.toString());
		System.out.println("Has two consecutive numbers: " + list5.hasTwoConsecutive()); // should print false

	}

}
