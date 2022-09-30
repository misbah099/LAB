/* QUESTION 1STCreate a class Circle.java in a package “com.cognizant.shapes” ,
 add a float instance
variable radius and add a default constructor (Constructor 1) for the class. This
constructor should initialize the radius to a default value 1.5f.
The above constructor should be invoked from a main method from another class,
Shape.java (in different package com.cognizant. geometry)  */
package com.cognizant.shapes;
public class Circle {
private float radius;
static float pi=3.5f;
public Circle() {
radius=1.5f;
}
 Circle(float radius){
	this.radius=radius;
}
Circle(float radius,float pi){
	this.radius=radius;
}
float calculateCircleArea(float r) {
	return pi*r*r;
}
float calculateCircumference(float r) {
	return 2 * pi * r;
}
public static void main(String[] args) {
	System.out.println(new Circle().calculateCircleArea(2.5f));
	System.out.println(new Circle().calculateCircumference(2.0f));
}}

