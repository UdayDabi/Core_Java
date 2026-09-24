package com.rays.prac;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Marksheet m1 = new Marksheet("105", "Baldev", 36, 50, 60);
		Marksheet m2 = new Marksheet("101", "Puneet", 66, 70, 80);
		Marksheet m3 = new Marksheet("103", "Rahul", 62, 60, 70);

		ArrayList list = new ArrayList();

		list.add(m1);
		list.add(m2);
		list.add(m3);

		 System.out.println(list);
//		 list.forEach(System.out.println());
	}

}
