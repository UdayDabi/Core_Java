package com.rays.oop.encapsulation;

import java.text.ParseException;

import java.text.SimpleDateFormat;

public class TestPerson {
          
	public static void main(String[] args) throws ParseException {
		   
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Person p = new Person();
		
		p.setname("ram ");
		p.setdob(sdf.parse("2009-02-17"));
		p.setaddress("indore");
		
		System.out.println("p name: " + p.getname());
		System.out.println("p dob: " + p.getdob());
		System.out.println("p Addresss: " + p.getaddress());
		System.out.println(p.getAge(p.getdob()));
		
		System.out.println("------------");
		 
	 Person p1 = new Person();
	    
	 p1.setname("shyam");
	 p1.setdob(sdf.parse("2008-02-16"));
	 p1.setaddress("dewas");
	 
	 System.out.println("p1 name: " + p1.getname());
	 System.out.println("p1 dob: " + p1.getaddress());
	 System.out.println("p1 address: "+ p1.getaddress());
	 
	 System.out.println(p1.getAge(p1.getdob()));
	 
	 
		
		
	}
}
