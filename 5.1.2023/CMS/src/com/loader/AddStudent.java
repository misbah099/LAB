package com.loader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cms.Helper;

public class AddStudent {
	int reg_no,pin,db_reg,db_pin;
	String reg_holder,shift_type,department;
	Double fees;
	Scanner sc=new Scanner(System.in);
	public void AddNewStudent(int reg_no,int pin)throws SQLException{
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from College where reg_no="+reg_no+" and pin="+pin);
		while(rs.next()) {
			db_reg=rs.getInt(1);
			db_pin=rs.getInt(6);
		}
		if(db_reg==reg_no) {
			System.err.println("!! registration number ALREADY EXISTS!!");
		}
		
		else {
			System.out.println("Enter your name:");
			reg_holder=sc.nextLine();
			System.out.println("Enter Department :");
			department=sc.nextLine();
			System.out.println("Enter Shift type:");
			shift_type=sc.next();
			System.out.println("Enter college Fees:");
			fees=sc.nextDouble();
			PreparedStatement stmt2= conn.prepareStatement("insert into College values(?,?,?,?,?,?)");
			stmt2.setInt(1,reg_no);
			stmt2.setString(2,reg_holder);
			stmt2.setString(3,department);
			stmt2.setString(4,shift_type);
			stmt2.setDouble(5,fees);
			stmt2.setInt(6,pin);
			stmt2.executeUpdate();
			
		}
}}
