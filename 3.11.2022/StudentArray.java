/* Create a student class having the following attributes
              1. Student No. (Data type int)
              2. Student Name. (Data type String)
              3. Student Mail Id. (Data type String)
              4. Student Address. (Data type String)
         This class should have 2 methods
              1. void fees (Int Student No.)
              2. void display (Int Student number)

•	After the class, you need to create an array of Student having 5 Students
           assign different fees to each Student and also print the details of each
           Student with the array only.


•	Now create a static method in the main class which will accept Student 
            number and Student fees as parameter and if the fees are less than 2000
            then fees will increase by 10% of their current fees to that Student.

Call the display method to print the updated details
 */
package lab;
public class StudentArray {
int StudentNo;
String Name,Mail,Address;
double fees;
static double increasedFess;
StudentArray(int stno,String stname,String stmail,String stadd){//creating constructor
	this.StudentNo=stno;
	this.Name=stname;
	this.Mail=stmail;
	this.Address=stadd;	
}
void fees(double f) {
	fees=f;
}
void display( ){
	this.fees=this.fees+increasedFess;;//updating the fees before printing
	System.out.println("Student ID no="+this.StudentNo+" Student name="+this.Name+" Student Mail ID="+this.Mail+" Stdent address"+this.Address+" Student fees"+this.fees);
}
static void increaseFees(int n,double f) {
	if(f<2000) {
		f=10*f/100;
		increasedFess=f;
	}
}
public static void main(String[] args) {
	StudentArray[] student=new StudentArray[5];
	student[0]=new StudentArray(111,"amit","amit@fd","somewhere");
	student[1]=new StudentArray(222,"bob","bob@fd","somewhere");
	student[2]=new StudentArray(333,"joy","joy@fd","somewhere");
	student[3]=new StudentArray(444,"rahul","rahul@fd","somewhere");
	student[4]=new StudentArray(555,"roy","roy@fd","somewhere");
	//adding fees value
	increaseFees(100,1064);
	increaseFees(102,957);
	increaseFees(103,1999);
	System.out.println("_______Details  of students____");//traversing the array of student object
	for(StudentArray i:student) {
		i.display();
	}
}
}
