package com.rays.shellocloing;

public class TestShellow {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee(1, "Uday");
		Employee e1 = (Employee) e.clone();

		e1.id = 2;
		e1.name = "Bhopal";

		System.out.println(e);
		System.out.println(e1);
	}

}
