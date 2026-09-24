package com.test.in;

public class TsetName {
	public static void main(String[] args) {
		String name = "uday Dabi";
		name.toLowerCase();

		for (char c = 'a'; c <= 'z'; c++) {

			if (name.indexOf(c) == -1) {
				System.out.println(c);

			}

		}

	}

}
