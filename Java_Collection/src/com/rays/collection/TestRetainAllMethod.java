package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAllMethod {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add("Ram");
		c1.add("Kamal");
		c1.add("Pawan");
		c1.add("Hari");

		Collection c2 = new ArrayList();

		c2.add("Ram");
		c2.add("Raman");
		c2.add("Baman");
		c2.add("Hari");

	
		
		c1.retainAll(c2);
		
		System.out.println(c1);

	}

}
