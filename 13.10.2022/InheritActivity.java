package lab;

public class InheritActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager(111,"joy","kolkata",23332,30000);
		m.calculateSalary();
		Trainee t=new Trainee(222,"jack","asansol",334555,20000);
     t.calculateSalary();
     m.calculateTransportAllowence();
     t.calculateTransportAllowence();
	}

}
