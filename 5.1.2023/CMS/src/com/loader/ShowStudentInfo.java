package com.loader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cms.Helper;

public class ShowStudentInfo {
	int db_reg;
	int db_pin;
	public void showStudentDetails(int reg_no,int pin)throws SQLException{
	Connection conn=Helper.con();
	Statement stmt=conn.createStatement();
	ResultSet rs=stmt.executeQuery("select * from College where reg_no="+reg_no+" and pin="+pin);
	while(rs.next()) {
		db_reg=rs.getInt(1);
		db_pin=rs.getInt(6);
	}
	if(db_reg!=reg_no) {
		System.out.println("!!WRONG REGISTRATION NUMBER INSERTED!!");
	}
	if(db_pin!=pin) {
		System.out.println("!!WRONG PIN NUMBER INSERTED!!");
	}else {
		System.out.println("-------------------------------------------------");
		System.out.println("Details of the Student");
		ResultSet rs1=stmt.executeQuery("select * from College where pin="+pin);
		while(rs1.next()) {
			System.out.println("Registration Number  :"+rs1.getInt(1));
			System.out.println("Student name  :  :"+rs1.getString(2));
			System.out.println("Department   :"+rs1.getString(3));
			System.out.println("Shift Type  :  :"+rs1.getString(4));
			System.out.println("Fees  :  :"+rs1.getDouble(5));
			System.out.println("SECURITY Pin  :  :"+rs1.getInt(6));
	System.out.println("------------------------------------------------------");
		}
	}
	}}
