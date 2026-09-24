package com.rays.oop.encapsulation;

public class Account {
      
	private  String number;
	private String account;
	private double balance;
	
	 public String getnumber(){
		 return number;
		 
	 }
	 public void setnumber(String number) {
		 this.number = number;
		 
	 }
	  public String getaccount() {
		  return account;
		  
	  } public void setaccount(String account) {
		  this.account = account;
		  
	  }
	   
	  public double getbalance() {
		  return balance;
	  }
	  public void setbalance(double balance) {
		  this.balance = balance;
		  
	  }
		public void deposit(double amt) {
			balance = balance + amt;
			System.out.println("total balance after deposit: " + balance);
		}
		
		public void withdrawal(double amt) {
			if (amt > balance) {
				System.err.println("insufficent fund transfer");
			} else {
				balance = balance - amt;
				System.out.println("total balance after withdrawal: " + balance);
			}
		} 
}
		
	

