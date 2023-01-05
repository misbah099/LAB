package com.cms;

import java.sql.SQLException;
import java.util.Scanner;

import com.loader.AddFees;
import com.loader.AddStudent;
import com.loader.Changepin;
import com.loader.RemoveStudent;
import com.loader.ShowStudentInfo;



public class CMS {
	static Scanner sc=new Scanner(System.in);
	 public static void main(String[] args) throws SQLException {
		int variable;
		do {
			System.out.println("""
					->|| WELCOME TO OUR BANKING SERVICE ||<-
					press 1 to REGISTER A STUDENT IN COLLEGE:~
					press 2 to show DETAILS OF THE STUDENT :~
					press 3 to  ADD FEES OF STUDENT TO COLLEGE:~
					press 4 to CHANGE SECURITY PIN:~
					press 5 to REMOVE THE STUDENT FROM DATABASE:~
					press 6 to exit:~
					""");
			variable=sc.nextInt();
			System.out.println("-----------------------");
			switch(variable) {
			case 1:
				System.out.println("Enter 10 digits REGISTRATION NUMBER OF THE STUDENT");
				int reg_no=sc.nextInt();
				System.out.println("Enter 4 digits SECURITY PIN");
				int pin =sc.nextInt();
				AddStudent as=new AddStudent();
				as.AddNewStudent(reg_no, pin);
				System.err.println("---NEW STUDENT ADDED-----");
				break;
			case 2:
				System.out.println("Enter student REGISTRATION number:");
				int p=sc.nextInt();
				System.out.println("Enter SECURITY pin: ");
				int q=sc.nextInt();
				ShowStudentInfo si=new ShowStudentInfo();
				si.showStudentDetails(p, q);
				System.out.println();
				break;
			case 3:
				System.out.println("Enter student REGISTRATION number:");
				int a=sc.nextInt();
				System.out.println("Enter SECURITY pin: ");
				int b=sc.nextInt();
				AddFees af=new AddFees();
				af.addStudentFees(a, b);
				System.out.println();
				break;
			case 4:
			    System.out.println("Enter student REGISTRATION number:");
				int e=sc.nextInt();
				System.out.println("Enter SECURITY pin: ");
				int f=sc.nextInt();
				Changepin cp=new Changepin();
				cp.changeSecurityPin(e, f);
				System.err.println("PIN HAS CHANGED");
				break;
			case 5:
				System.out.println("Enter student REGISTRATION number:");
				int g=sc.nextInt();
				System.out.println("Enter SECURITY pin: ");
				int h=sc.nextInt();
				RemoveStudent rs=new RemoveStudent();
				rs.removeStududentDetail(g, h);
				System.out.println();
				break;
			case 6:
				System.out.println("You have successfully logged out");
				System.out.println("THANK YOU");
				System.out.println();
				System.exit(0);
				break;
			}}
		while(variable>0 && variable <7);
	 }}


