package com.rays.map;

import java.util.HashMap;
import java.util.Map;

// 1. map does not contain duplicate key
// 2. map contain only one null key
// 3. value can be duplicate
// 4. map can contain multiple null value
//5. not maintain order 

public class TestHashMap {

	public static void main(String[] args) {

		Map m = new HashMap();

		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put(5, "five");
		m.put(6, null);
		m.put(5, "Fousr");// duplicate key allow nahi krta hai
		System.out.println(m);

//		
//		System.out.println(m.get(5));
////
		System.out.println(m.entrySet());
//		System.out.println(m.containsKey(5));
//		System.out.println(m.containsValue(10));
//		System.out.println(m.keySet());
//		System.out.println(m.values());
//
		for (Object o : m.keySet()) {
			System.out.println(o);

//		}
		}
	}

}
