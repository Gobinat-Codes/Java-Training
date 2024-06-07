package org.projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class VendorInformationManagementSystem {

	static String url = "jdbc:mysql://localhost:3306/training";
	static String userName = "root";
	static String passWord = "Root";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Vendor Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Vendor Email Id : ");
		String email_id = sc.nextLine();
		
		System.out.print("Enter Vendor Phone no : ");
		String phone = sc.nextLine();
		
		addVendor(name, email_id, phone);
		
		sc.close();
		
	}

	private static void addVendor(String name, String email_id, String phone) {
		
		Connection con;
		PreparedStatement pi;
		
		con = null;
		pi = null;
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, passWord);
		
			String querry1 = "INSERT INTO `customer`(`name`,`email_id`,`phone`) VALUES (?,?,?);";
			
			pi = con.prepareStatement(querry1);
			pi.setString(1, name);
			pi.setString(2, email_id);
			pi.setString(3, phone);
			
			int row = pi.executeUpdate();
			
			if(row > 0) {
				System.out.println("data updated successfully");
			}
			else {
				System.out.println("failed to update");
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			
			try {
				
			if(pi != null) pi.close();
			if(con != null) con.close();
			
			}
			catch(Exception e) {
				
			}
		}
	}
}
