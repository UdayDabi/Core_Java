package com.rays.oop.abstraction;

public class Test {

	public static void main(String[] args) {

		Circle c = new Circle();

		c.setRadius(20);
		c.setColor("Red");
		c.setBorderWidth(120);

		System.out.println(c.getBorderWidth());
		System.out.println(c.getColor());
		System.out.println(c.getRadius());
		System.out.println(c.area());
		
		
	}

}
