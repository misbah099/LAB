package com.loader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cms.Helper;

public class AddFees {
	int db_pin,reg_no,pin;
	int db_reg;
	double pfees;
	Scanner sc=new Scanner(System.in);
	public void addStudentFees(int reg_no,int pin)throws SQLException {
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from College where reg_no="+reg_no+" and pin="+pin);
		while(rs.next()) {
			db_reg=rs.getInt(1);
			db_pin=rs.getInt(6);
		}
		if(db_reg!=reg_no) {
			System.err.println("!!WRONG REGISTRATION NUMBER INSERTED");
		}
		if(db_pin!=pin) {
			System.err.println("!!WRONG PIN NUMBER INSERTED");

		}else {
			System.out.println("enter amount you want to deposit  :");
			double fees=sc.nextDouble();
			ResultSet rs2=stmt.executeQuery("select fees from College where reg_no="+reg_no+" and pin="+pin);
			while(rs2.next()) {
				pfees=rs2.getDouble(1);
				System.out.println();
				System.out.println("Your previous fees was :"+pfees);
			}
			stmt.executeUpdate("Update College set fees="+(pfees+fees)+" "+"where pin="+pin);
			System.err.println("Your new fees is  :"+(pfees+fees));
			System.err.println("---------------------------------------------------");
		}
	}
}
