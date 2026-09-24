package com.rays.oop.encapsulation;

import java.util.Date;

public class Person {
	
	private String name;
	private Date dob;
	private String address;
	
	public String  getname() {
		return this.name;
		
	}
	 
	public void setname(String name) {
		this.name = name;
		
	}
	  public Date getdob() {
		  return this.dob;
	  }
	   
	  public void setdob(Date dob) {
		  this.dob = dob;
		  
	  }
	 public int getAge(Date dob) {
		 Date now = new Date();
		 int age = now.getYear() - dob.getYear();
		 return age;
		 
		 
	 }
	  
	  

     public String getaddress() {
    	 return this.address;
     }
     
     public void setaddress(String address) {
    	 this.address = address;
     }

		
	

	}
		
	

		
	


