package com.rays.oop.encapsulation;

public class TestAccount {
       
	public static void main(String[] args) {
		   
		Account a1 = new Account();
		
		a1.setnumber("440980409");
		a1.setaccount("current");
		a1.setbalance(1000.00);
		
		
		System.out.println("a1 account no: " + a1.getnumber());
		System.out.println("a1 account type: " + a1.getaccount());
		System.out.println("a1 current balance: " + a1.getbalance());
		a1.deposit(500.00);
		a1.withdrawal(200.00);
		a1.withdrawal(200.00);
	}
}
