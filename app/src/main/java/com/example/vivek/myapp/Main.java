package com.example.vivek.myapp;

public class Main {

	public static void main(String[] args) {

		Account VivekAccount = new Account();
		VivekAccount.Withdarwal(100.0); 
		
		VivekAccount.Deposite(50.0);
		VivekAccount.Withdarwal(100.0);
		
		VivekAccount.Deposite(51.0);
		VivekAccount.Withdarwal(100.0);

		System.out.println("\n******Proramme 2 is Running*****************\n");

		VipPerson person1 = new VipPerson();
		System.out.println(person1.getName());

		VipPerson person2 = new VipPerson("Amit",25000.0);
		System.out.println(person2.getName());

		VipPerson person3 = new VipPerson("Raj",100.0,"Raj@email.com");
		System.out.println(person3.getName());

		System.out.println(person3.getEmailId());


	}

}
