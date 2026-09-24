package com.rays.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateFormate {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate dob = LocalDate.of(2005, 10, 01);
		System.out.println(dob);



	}

}
