package com.HibernateEmp;



public class Emp_Main {

	public static void main(String[] args) {

    	//configuration -activates hibernate framework
    	//configure -read both cfg files and mapping details
    	//buildsessionFctory =from cfg object it takes jdbc information and creates a jdbc connection
    	SessionFactory s=new Configuration().configure().buildSessionFactory();
    	//opens an connection with db and session object performs CRUD
    	Session ses=s.openSession();//one of the method of session factory to get session object
    	//operation performed in db save,permanent
    	Transaction t=ses.beginTransaction();
    	//Create object of persistence class
    	Employee e1=new Employee();
    	//use object to enter data in table using setter method
    	e1.setEmpId(101);
    	e1.setEmpFirstName("Misbah");
    	e1.setEmpLastName("Chowdhury" );
    	e1.setEmpEmail("Misba@gmail.com");
    	e1.setEmpPhone(79098747);
    	e1.setEmpAddr("Kolkata");
    	e1.setEmpsalary(12300.98);
    	ses.save(e1);
    	Employee e2=new Employee();
    	e2.setEmpId(102);
    	e2.setEmpFirstName("Niladri");
    	e2.setEmpLastName("Chowdhury" );
    	e2.setEmpEmail("Niladri@gmail.com");
    	e2.setEmpPhone(96868747);
    	e2.setEmpAddr("Asansol");
    	e2.setEmpsalary(14300.98);
    	ses.save(e2);

    	Employee e3=new Employee();
    	e3.setEmpId(103);
    	e3.setEmpFirstName("Nisha");
    	e3.setEmpLastName("Sutradhar" );
    	e3.setEmpEmail("Nishasutra@gmail.com");
    	e3.setEmpPhone(90474447);
    	e3.setEmpAddr("Durgapur");
    	e3.setEmpsalary(10300.00);
    	ses.save(e3);
    	Employee e4=new Employee();
    	e4.setEmpId(104);
    	e4.setEmpFirstName("Shruti");
    	e4.setEmpLastName("Pramanik" );
    	e4.setEmpEmail("ShrutiPramanik@gmail.com");
    	e4.setEmpPhone(795854447);
    	e4.setEmpAddr("Asansol");
    	e4.setEmpsalary(13300.00);
    	ses.save(e4);
    	Employee e5=new Employee();
    	e5.setEmpId(105);
    	e5.setEmpFirstName("Abhisheik");
    	e5.setEmpLastName("Maity" );
    	e5.setEmpEmail("Abhisheik@gmail.com");
    	e5.setEmpPhone(64746447);
    	e5.setEmpAddr("Mednipur");
    	e5.setEmpsalary(15300.00);
    	ses.save(e5);
    	//transaction object to commit changes
    	t.commit();
    	//closing the table
    	ses.close();
	}

}
