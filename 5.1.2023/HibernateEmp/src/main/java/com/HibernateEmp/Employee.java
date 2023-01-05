package com.HibernateEmp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity //marking this class as entity
//specifies the table name where data of this entity is to be persisted.
@Table(name="Employee_info")
public class Employee {
	@Id //Marks identifier of class
	private int EmpId;
	private String EmpFirstName,EmpLastName,EmpEmail,EmpAddr;
	private double Empsalary;
	private long EmpPhone;
}
