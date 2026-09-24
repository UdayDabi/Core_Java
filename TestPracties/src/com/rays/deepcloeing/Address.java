package com.rays.deepcloeing;

public class Address implements Cloneable {
	public String Address;

	public Address(String Address) {
		this.Address = Address;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Address :- " + Address;
	}
}
