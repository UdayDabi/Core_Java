package com.rays.string;

public class TestString {
	
	public static void main(String[] args) {

		String name = "Vijay Dinanath Chouhan";
		
		//String name = new String("Vijay Dinanath Chouhan");

		System.out.println("name = " + name);
		System.out.println("Lenth = " + name.length());
		System.out.println("7th char is: " + name.charAt(6));
		System.out.println("first index of k: " + name.indexOf('h')); 
		System.out.println("last index of a: " + name.lastIndexOf('h'));
		System.out.println(name.replace('V', 'b'));
		System.out.println("chota vijay: " + name.toLowerCase());
		System.out.println("bada vijay: " + name.toUpperCase());
		System.out.println(name.startsWith("Vijay"));
		System.out.println(name.endsWith("han"));
		System.out.println(name.substring(6, 9));
		System.out.println(name.concat(" Jiiii"));

		 
		

	}

}
