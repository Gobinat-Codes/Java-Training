package org.projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

class Contact{
	 String name;
	 String phone;
	 
	 public Contact(String name, String phone) {
		 this.name = name;
		 this.phone = phone;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public String getPhone() {
		 return phone;
	 }
	 
	 public String toString() {
		 return "Contact Name : " + name + " , "+ "Contact Number : " + phone;
	 }
}

class ContactManager{
	
	String url = "jdbc:mysql://localhost:3306/training";
	String userName = "root";
	String passWord = "Root";
	
	private Connection connect()throws SQLException {
		return DriverManager.getConnection(url, userName, passWord);
	}
	
	public void addContact(String name, String phone) {
		String querry1 = "INSERT INTO contacts (name,phone) VALUES (?,?)";
		try {
			Connection con = connect();
			PreparedStatement pt = con.prepareStatement(querry1);
			pt.setString(1, name);
			pt.setString(2, phone);
			pt.executeUpdate();
			System.out.println("--------------------------------------");
			System.out.println("Contact Added Successfully");
			System.out.println("--------------------------------------");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteContact(String name) {
		String querry2 = "DELETE FROM contacts WHERE name = ?";
		try {
			Connection con = connect();
			PreparedStatement pt = con.prepareStatement(querry2);
			pt.setString(1, name);
			pt.executeUpdate();
			System.out.println("--------------------------------------");
			System.out.println("Contact Deleted Successfully");
			System.out.println("--------------------------------------");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	public ArrayList<Contact> searchContact(String name) {
		ArrayList<Contact> result = new ArrayList<>();
		String querry3 = "SELECT name,phone FROM contacts WHERE name = ? ";
		
		try {
			Connection con = connect();
			PreparedStatement pt = con.prepareStatement(querry3);
			pt.setString(1, name);
			ResultSet rs = pt.executeQuery();
			while(rs.next()) {
				result.add(new Contact(rs.getString("name"),rs.getString("phone")));
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

		
	
	public void displayContacts() {
		
		String querry4 = "SELECT name,phone FROM contacts";
		
		try {
			Connection con = connect();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(querry4);
			while(rs.next()) {
				System.out.println("---------------------------------------------------");
				System.out.println(new Contact(rs.getString("name"),rs.getString("phone")));
				System.out.println("---------------------------------------------------");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}	
}


public class ContactManagementSystem{
	public static void main(String[] args) {
		ContactManager conman = new ContactManager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\nContact Management System");
			System.out.println("1. Add New Contact");
			System.out.println("2. Delete Contact");
			System.out.println("3. Search Contact");
			System.out.println("4. Display All Contacts");
			System.out.println("5. Exit");
			System.out.print("Enter your Choice : ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			
			case 1 : System.out.print("Enter Name : ");
					 String addname = sc.nextLine();
					 System.out.print("Enter Number : ");
					 String num = sc.nextLine();
					 conman.addContact(addname, num);
					 break;
					 
			case 2 : System.out.print("Enter Name : ");
					 String delname = sc.nextLine();
					 conman.deleteContact(delname);
					 break;
					 
			case 3 : System.out.print("Enter Name : ");
					 String sername = sc.nextLine();
					 ArrayList<Contact> contact = conman.searchContact(sername);
					 for(Contact i : contact) {
						 System.out.println("----------------------------------------------------");
						 System.out.println(i);
						 System.out.println("----------------------------------------------------");
					 }
					 break;
					 
			case 4 : conman.displayContacts();
					 break;
					 
			case 5 : 
				sc.close();
				return;
				
			default :
				System.out.println("please enter valid option");
			}
		}	
	}
}






























