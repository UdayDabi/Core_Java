package in.co.rays.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {

		List l = new ArrayList();
		l.add(0, "Ram");
		l.add("Ram");
		l.add(1, "Hari");
		l.add(3, "radhe");
		l.add("Sharma");
		System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l.remove(3));
		System.out.println(l);

//		  System.out.println(l.set(2, "Banna"));
		System.out.println(l);
		System.out.println(l.indexOf("Ram"));
		System.out.println(l.lastIndexOf("Ram"));
		System.out.println(l);
		System.out.println(l.subList(0, 2));

	}
}