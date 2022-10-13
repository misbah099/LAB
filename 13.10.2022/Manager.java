package lab;

public class Manager extends Employee1 {
public Manager(int id,String name,String address,long phone,double salary) {
	super(id,name,address,phone);
	super.basicSalary=salary;
}
void calculateTransportAllowence() {
	double TransAllow=15*this.basicSalary/100;
	System.out.println("transportAllowance="+TransAllow);
}
}
