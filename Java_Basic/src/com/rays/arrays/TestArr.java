package com.rays.arrays;

public class TestArr {
	public static void main(String[] args) {
		int[] table = new int[10];
		table[0] = 10;
		table[1] = 20;
		table[2] = 30;
		table[3] = 40;
		table[4] = 50;
		table[5] = 60;
		table[6] = 70;
		table[9] = 90;
		int size = table.length;
		System.out.println(size);
		System.out.println(table);

		for (int i : table) {

			System.out.println(i);

		}
	}
}
