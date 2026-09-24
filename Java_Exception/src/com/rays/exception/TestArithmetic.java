package com.rays.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestArithmetic {

	public static void main(String[] args) {
		System.out.println("Before");
		int a = 5;
		int b = 0;
		System.out.println("MID");

		try {

			int c = a / b;

			System.out.println(c);
			System.out.println("programe is finish");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		} finally {
			System.out.println("In finally block");
		}
		System.out.println("After");
	}

}
