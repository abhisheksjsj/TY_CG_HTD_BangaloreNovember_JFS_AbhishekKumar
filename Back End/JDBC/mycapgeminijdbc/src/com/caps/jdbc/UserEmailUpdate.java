package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");

			// Get the DBConeection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter the DB username and password");
			String user = sc.nextLine();
			String pwd = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl, user, pwd);
			System.out.println("Connection Established.....");

			// Issue the SQL Queries via Connection
			String query = "UPDATE users_info SET email=? where userid=? AND password=?";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter userid..");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the new Email");
			pstmt.setString(1, sc.nextLine());
			System.out.println("Enter Password");
			pstmt.setString(3, sc.nextLine());
			int count = pstmt.executeUpdate();
			System.out.println("Query issued........");

			// used to close Scanner Object
			sc.close();

			// Process the results
			if (count > 0) {
				System.out.println("Query updated");
			} else {
				System.err.println("Something went wrong");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Close all JDBC objects
		finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
