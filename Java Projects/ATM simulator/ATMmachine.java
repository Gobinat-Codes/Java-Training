package org.projects;

import java.util.Scanner;

public class ATMmachine {

	public static void main(String[] args) {
		
		
		int pin = 1234;
		
		double balance = 1000.0;
		double depositAmount = 0.0;
		double withDrawAmount = 0.0;
		double tax = 1.5; 
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		
		System.out.print("Enter your password : ");
		int password = sc.nextInt(); 
		
		if(password == pin) {
		
			while(true) {
				
			
				System.out.println("------------------------------------------");
				System.out.println("1. check your balance");
				System.out.println("2. deposit your amount");
				System.out.println("3. withdraw your amount");
				System.out.println("4. your account current status");
				
			
	
		
		int options = sc.nextInt();
		System.out.println("------------------------------------------");
		switch(options) {
			case 1 :  
				System.out.println("your balance is : " + balance);
				break;
				
			case 2 :
				System.out.print("how much amount do you want to add : ");
				depositAmount = sc.nextDouble();
				System.out.println("amount deposited successfully");
				balance = depositAmount + balance;
				System.out.println("your current balance after deposit : " + balance);
				break;
				
			case 3 :
				System.out.print("please enter the amount you want to withdraw : ");
				withDrawAmount = sc.nextDouble();
				if(withDrawAmount > balance) {
					System.out.println("please enter valid amount");
				}
				else {
					System.out.println(" amount withdraw successfully");
				}
				balance = balance - withDrawAmount;
				balance = balance - tax;
				System.out.println("your current balance : " + balance);
				break;
				
			case 4 :
				System.out.println("your account statement");
				System.out.println("-> your current balance : " + balance);
				System.out.println("-> your deposits : " + depositAmount);
				System.out.println("-> your last withdraw : " + withDrawAmount);
				break;
				
				default :
					sc.close();
					break;
		}
			
		
		if(options >= 5) {
			System.out.println("Thank You Visit again");
				}
			}
		}
		else {
			System.out.println("please enter valid pin");
			
		}
	}
	}
}

