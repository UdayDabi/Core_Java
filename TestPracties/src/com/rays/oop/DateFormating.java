package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormating {
	
	public static void main(String[] args) throws ParseException  {
		
		 
		Date d  = new Date ();
 
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 
		 System.out.println("simple Date Format: " + d);
		  
		 String s = sdf.format(d);
		 
		 System.out.println("simple Date Format: " + s);
		 System.out.println("----------");
		 
		 String dob = "2009-02-17";
		 
		 System.out.println("String dob: " + dob);
		 
		 Date date = sdf.parse(dob);
		 
		 System.out.println("String dob: " + date);
		 
	}

}
