// Written by Alexander Baker on 6/15/2020
// Final: ch14 p.925 e.5

import java.util.*; // to use stacks and queues

public class FinalStack {

	public static void main(String[] args) {
		Stack<Integer> red = new Stack<>();
		red.push(2);
		red.push(6);
		red.push(1);
		Stack<Integer> crimson = new Stack<>();
		crimson.push(2);
		crimson.push(6);
		crimson.push(1);
		Stack<Integer> blue = new Stack<>();
		blue.push(1);
		blue.push(6);
		blue.push(2);
		
		System.out.println(red + " = " + crimson + ":" + equals(red, crimson));
		System.out.println(red + " = " + blue + ":" + equals(red, blue));
	}
	
	public static boolean equals(Stack<Integer> s1,
			Stack<Integer> s2) {
		// check to see if given stacks are same size
		if (s1.size() != s2.size()) {
			return false;
		} else {
			Stack<Integer> s3 = new Stack<>();
			boolean same = true;
			while (same && !s1.isEmpty()) {
				int num1 = s1.pop();
				int num2 = s2.pop();
				if (num1 != num2) {
					same = false;
				}
				s3.push(num1);
				s3.push(num2);
			}
			while (!s3.isEmpty()) {
				s2.push(s3.pop());
				s1.push(s3.pop());
			}
			return same;
		}
	}
}
