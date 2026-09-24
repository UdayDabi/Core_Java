package com.rays.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class TestSet {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(null);
		s.add(null);
		s.add('a');
		s.add('b');
		s.add('c');
		s.add('d');
		s.add('e');
		s.add('f');
		s.add('a');
		s.add('a');
		s.add('a');
		
		 System.out.println(s);
		 System.out.println(s.isEmpty());
	}

}
