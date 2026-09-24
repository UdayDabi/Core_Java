package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(10);
		c.add("Ram");
		c.add('A');
		c.add(100.20);
		
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.contains(10));
		System.out.println(c.remove(100.20));
		System.out.println(c.size());
		c.clear();
		System.out.println();

	}

}
