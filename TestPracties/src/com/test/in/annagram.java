package com.test.in;

import java.lang.reflect.Array;
import java.util.Arrays;

public class annagram {
	public static void main(String[] args) {
		String a = "Raj";
		String b = "jaR";

		String c = a.toLowerCase();
		String d = b.toLowerCase();

		char[] a1 = c.toCharArray();
		char[] a2 = d.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
 
		if (Arrays.equals(a1, a2)) {
			System.out.println(c + " and " + d + " are anagrame ");
		} else {
			System.out.println("not");
		}
	}

}
