package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionsAll {
	public static void main(String[] args) {
		
		
		Collection c1 = new ArrayList();
		c1.add(10);
		c1.add("Ram");
		c1.add('A');
		c1.add(100.20);

		System.out.println("-----------");
		
		Collection c2 = new ArrayList();
		c2.add(1);
		c2.add('B');
		c2.add(20.20);
		
		
		System.out.println(c1.containsAll(c2));
		System.out.println(c1.size());
//		c1.clear();
		System.out.println(c1);
	}

}
