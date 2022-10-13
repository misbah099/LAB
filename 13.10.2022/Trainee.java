package lab;

public class Trainee extends Employee1 {
public Trainee(int id,String name,String address,long phone,double salary) {
	super(id,name,address,phone);
	super.basicSalary=salary;
}
}
