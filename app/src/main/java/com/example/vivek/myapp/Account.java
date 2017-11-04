package com.example.vivek.myapp;

public class Account {
	private String AccountNumber;
	private double Balance;
	private String CustomerName;
	private String CustomerEmailid;
	private String CustomerNumber;
	
	public void Deposite(double DepositeAmmount) {
		this.Balance += DepositeAmmount; 
		System.out.println("Deposite of Rs. "+DepositeAmmount+" made and New Balance is: "+this.Balance);
	}

	public void Withdarwal(double WithdrawalAmmount) {
		if (Balance-WithdrawalAmmount<0) {
			System.out.println("Only "+this.Balance+" available Withwrawal not Processed.");
		}else {
			this.Balance-=WithdrawalAmmount;
			System.out.println("Withdrawal of Rs. "+ WithdrawalAmmount+" processed and now Balance is "+ this.Balance);
		}

	}
	
	
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerEmailid() {
		return CustomerEmailid;
	}
	public void setCustomerEmailid(String customerEmailid) {
		CustomerEmailid = customerEmailid;
	}
	public String getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		CustomerNumber = customerNumber;
	}
	
	
	
		}
