package in.co.rays.collectionlist;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {

		Stack s = new Stack();

		for (char ch = 'a'; ch < 'z'; ch++) {
			s.push(ch);
		}

		System.out.println("S = " + s);

		Stack s1 = new Stack();

		while (!s.isEmpty()) {

			s1.push(s.pop());
		}

		System.out.println("S1 = " + s1);
	}
}