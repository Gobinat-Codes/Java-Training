package org.projects;

import java.util.Scanner;

abstract class Employee{
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public abstract double calculateSalary();
	
	public void displayDetails() {
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Id : " + id);
	}
}


class FullTimeEmployee extends Employee{

	private double salary;
	
	public FullTimeEmployee(String name, int id, double salary) {
		super(name,id);
		this.salary = salary;
	}
	
	public double calculateSalary() {
		return salary;
	}
	
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Type : Full Time Employee");
		System.out.println("Salary : " + calculateSalary());
	}
}
	
	
class PartTimeEmployee extends Employee{
	private double hourlyRate;
	private int workingHours;
	
	public PartTimeEmployee(String name, int id, double hourlyRate, int workingHours) {
		super(name,id);
		this.hourlyRate = hourlyRate;
		this.workingHours = workingHours;
	}

	@Override
	public double calculateSalary() {
		return hourlyRate * workingHours;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Type : Part Time Employee");
		System.out.println("Salary : " + calculateSalary());
	}
}

class ContractualEmployee extends Employee{
	private double salary;
	
	public ContractualEmployee(String name, int id, double salary) {
		super(name,id);
		this.salary = salary;
	}
	
	public double calculateSalary() {
		return salary;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Type : Contractual Employee");
		System.out.println("Salary : " + salary);
	}
}

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\nEmployee Management System");
			System.out.println("1. Full Time Employee");
			System.out.println("2. Part TIme Employee");
			System.out.println("3. Contractual Employee");
			System.out.println("4. Exit");
			System.out.print("Enter Your Choice : ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1 : System.out.print("Enter Employee Name : ");
					 String fullTimeName = sc.nextLine();
					 System.out.print("Enter Employee Id : ");
					 int empid1 = sc.nextInt();
					 System.out.print("Enter Employee salary : ");
					 double sal1 = sc.nextDouble();
					 sc.nextLine();
					 FullTimeEmployee full = new FullTimeEmployee(fullTimeName, empid1, sal1);
					 System.out.println("--------------------------------------------");
					 full.displayDetails();
					 System.out.println("--------------------------------------------");
					 break;
					 
			case 2 : System.out.print("Enter Employee Name : ");
					 String partTimeName = sc.nextLine();
				     System.out.print("Enter Employee Id : ");
				     int empid2 = sc.nextInt();
					 System.out.print("Enter Employee hour rate : ");
					 double hr = sc.nextDouble();
					 System.out.print("Enter Employee work hours : ");
					 int hrs = sc.nextInt();
					 sc.nextLine();
					 PartTimeEmployee part = new PartTimeEmployee(partTimeName, empid2, hr, hrs);
					 System.out.println("--------------------------------------------");
					 part.displayDetails();
					 System.out.println("--------------------------------------------");
					 break;
					 
			case 3 : System.out.print("Enter Employee Name : ");
					 String ContractTimeName = sc.nextLine();
					 System.out.print("Enter Employee Id : ");
					 int empid3 = sc.nextInt();
					 System.out.print("Enter Employee Salary");
					 double sal3 = sc.nextDouble();
					 sc.nextLine();
					 ContractualEmployee con = new ContractualEmployee(ContractTimeName, empid3, sal3);
					 System.out.println("--------------------------------------------");
					 con.displayDetails();
					 System.out.println("--------------------------------------------");
					 break;
					 
			case 4 : System.out.println("Exiting Employee Management System ");
					 sc.close();
					 return;
					 
			default : 
				System.out.println("Please Enter Valid Choice");
			
			}
		}

	}

}
































