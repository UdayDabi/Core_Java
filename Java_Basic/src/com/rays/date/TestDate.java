package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws InterruptedException, ParseException {

		Date d = new Date();

		System.out.println(d);
		System.out.println("---------After Format ----------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dob = sdf.format(d);
		System.out.println(dob);
		System.out.println("---------After Parsh ----------");
		String d1 = "2025-02-03";
		System.out.println(d1);
//
		Date d2 = sdf.parse(d1);
		 System.out.println(d2);

	}

}
