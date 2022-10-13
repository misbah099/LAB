package lab;
//1.	Create a class Employee with the following instance variables
public class Employee1 {
long employeeid;
String employeeName;
String employeeAddress;
long employeePhone;
double basicSalary;
double specialAllowance=250.80;
double Hra=1000.50;
Employee1(int eid,String ename,String eadd,long eph){
	this.employeeid=eid;
	this.employeeName=ename;
	this.employeePhone=eph;
	}
void calculateSalary() {
	double salary=this.basicSalary+(this.basicSalary*this.specialAllowance/100)+(this.basicSalary*this.Hra/100);
	System.out.println("Salary="+salary);
}
void calculateTransportAllowence() {
	double TransAllow=10*this.basicSalary/100;
	System.out.println("transportAllowance="+TransAllow);
}
}
