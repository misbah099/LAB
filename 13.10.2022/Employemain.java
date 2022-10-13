/* Q.2... Write a java class to develop an employee class object & initialized the emp name & emp Id for 5 Emp. now write another
 *  class having name and from this class you have to create 5 employee objects but you are not allowed to use new keyword. */
package lab;
class Employee2{
	static int id;
	static String ename;

	static void getValue(int id,String name) {
		id=id;
		ename=name;
		System.out.println("Emp name="+ename+" Emp ID="+id);
	}}
public class Employemain {

	public static void main(String[] args) {
Employee2.getValue(100, "aaa");
Employee2.getValue(101, "bbb");
Employee2.getValue(102, "ccc");
Employee2.getValue(103, "ddd");
Employee2.getValue(104, "eee");
}}
