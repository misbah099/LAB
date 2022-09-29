/*  1… Write the following code:
1. A class named Arithmetic with a method named add that takes integers as
parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic */
package lab;

public class Arthimetic {
int a;
int b;
 int add(int a,int b) {//add returning the sum of the two numbers
	 this.a=a;
	 this.b=b;
	 int sum=a+b;
	 return sum;
 }}
class Adder extends Arthimetic{//this Sub class inheriting the PARENT class arthimetic
	int add2(int a,int b) {
		return add(a,b);//calling the  method of PARENT class
	}}
class Arthimeticmain{
	public static void main(String[] args) {
		Adder a=new Adder();//creating obj of Subclass Adder
	int sum=a.add(5, 6);
		System.out.println("the sum of two numbers are="+sum);
	}
}