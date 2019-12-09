package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// Load the Driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Loaded.....");

			// Get the DBConnection via Driver
			String dbUrl = "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";

			System.out.println("Enter Username and Password");
			String dbUser = sc.nextLine();
			String dbPass = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			System.out.println("Connection Established.....");

			// Issue the SQL Queries via Connection
			String query = "SELECT * FROM users_info where userid=? AND password=?";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter UserId...");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Password");
			pstmt.setString(2, sc.nextLine());
			rs = pstmt.executeQuery();
			System.out.println("Query issued and executed");
			System.out.println("---------------------------");

			// Process the results returned by SQL queries
			if (rs.next()) {
				System.out.println("UserId: " + rs.getInt(1));
				System.out.println("UserName: " + rs.getString(2));
				System.out.println("Email: " + rs.getString("email"));
				System.out.println("Result Processed");
			} else {
				System.out.println(" Something Wrong happens");
			}

		} catch (SQLException e) {
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
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
