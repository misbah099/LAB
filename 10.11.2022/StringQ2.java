package lab;
//Question2:Write a program which creates "This is StringBuffer"
public class StringQ2 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("This is StringBuffer");
//Adds the String "This is a simple Program" to existing String 
System.out.println("The Added String is: "+str.append("This is a sample program"));
//Insert the String "Object" to the existing String at 21st position
str.insert(21,"Object");
System.out.println("The Inserted string at 21st position is: "+str);
//Reverse entire the string and display it
str.reverse();
System.out.println("The reversed string is :"+str);
//Replace the Buffer with Builder and Display
StringBuffer str1=new StringBuffer("This is StringBuffer");
str1.replace(14, 22, "Builder");
System.out.println("The Buffer is replaced by Builder"+str1);

	}}
