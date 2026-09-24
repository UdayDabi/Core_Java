package com.rays.oop.encapsulation;

public class TestAutoMobile {
         
	public static void main(String[] args) {
		 
		AutoMobile a2 = new AutoMobile();
		 
		a2.setcolor("red");
		a2.setspeed(140);
		a2.setmake("mahindra");
		
		System.out.println("a2 color: " + a2.getcolor());
		System.out.println("a2 speed: " + a2.getspeed());
		System.out.println("a2 make: " + a2.getmake());
		
		 
	}
}
