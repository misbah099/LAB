package com.loader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cms.Helper;

public class Changepin {
	int db_reg,db_pin,reg_no,pin;
	Scanner sc=new Scanner(System.in);
	public void changeSecurityPin(int reg_no,int pin)throws SQLException{
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		System.out.println("Enter new pin: ");
		int newPin=sc.nextInt();
		ResultSet rs = stmt.executeQuery("select * from College where reg_no= " + reg_no);
		while (rs.next()) {
			db_reg = rs.getInt(1);
			db_pin = rs.getInt(6);
		}
		if (db_reg != reg_no) {
			System.err.println("!! WRONG REGISTRATION NUMBER INSERTED !!");
		}
		if (db_pin != pin) {
			System.err.println("!! WRONG PIN INSERTED !!");
		} else

			stmt.executeUpdate("update College set pin= " +newPin+" where reg_no="+reg_no);
		

}}
