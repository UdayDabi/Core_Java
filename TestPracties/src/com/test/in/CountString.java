package com.test.in;

public class CountString {
	public static void main(String[] args) {
		String name = "Uday Dabi";
		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			String ss = Character.toString(name.charAt(i));

			if (ss.equals("U")) {
				
				count++;

			}

		}
		System.out.println("U" + count);
	}
}
