package com.rays.prac;

public class Marksheet implements Comparable<Marksheet> {
	private String rollNo;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;

	public Marksheet(String rollNo, String name, int physics, int chemistry, int maths) {
		this.rollNo = rollNo;
		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}

	@Override
	public String toString() {
		return "Roll No: " + rollNo + ", Name: " + name + ", Physics: " + physics + ", Chemistry: " + chemistry
				+ ", Maths: " + maths;
	}

	@Override
	public int compareTo(Marksheet o) {
		return this.rollNo.compareTo(o.rollNo);

	}

}
