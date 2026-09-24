package com.rays.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestArrayDq {
	public static void main(String[] args) {
		Queue q = new ArrayDeque();

		for (char c = 'a'; c <= 'z'; c++) {

			q.offer(c);

		}
		System.out.println(q);
		System.out.println(q.peek()); // First ay ga
		System.out.println(q);
		System.out.println(q.poll()); // first Jaye ga
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);

		System.out.println("q: elemets " + q.element());
		
		
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		

	}
	}
	

