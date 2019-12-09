package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// Load the Driver
			// Driver driver = new com.mysql.jdbc.Driver();
			// DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded.....");

			// Get DBConnection
			String dbUrl = "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter Username and Password");
			String user = sc.nextLine();
			String password = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl, user, password);
			System.out.println("Connection Established.....");

			// Issue the SQL Queries
			String query = "DELETE from users_info where userid=? and password=?";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter UserId");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Password");
			pstmt.setString(2, sc.nextLine());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("User Deleted....");
			} else {
				System.err.println("Something went Wrong");
			}
		} catch (Exception e) {				//SQLException
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Process the result returned
		// Close all JDBC Objects
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
