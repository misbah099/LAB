package com.loader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cms.Helper;

public class RemoveStudent {
	int db_pin,reg_no,pin;
	int db_reg;
	public void removeStududentDetail(int reg_no,int pin)throws SQLException {
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from Colllege where reg_no="+reg_no+" and pin="+pin);
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
			stmt.executeLargeUpdate("Delete from college where acc_no="+reg_no+" and pin="+pin);
			System.out.println("-----------------STUDENT DETAILS REMOVE----------------");
		}
}}
