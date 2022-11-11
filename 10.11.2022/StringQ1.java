package lab;
//QUESTION 1:Write a program which creates "Welcome to Java World"
public class StringQ1 {

	public static void main(String[] args) {
String str="Welcome to Java world";
//Returning the 5th character 
System.out.println("Charater at 5th position :"+str.charAt(5));
str=str.toLowerCase();
//comparing the Welcome lexicographically
String str1="Welcome";
System.out.println("Checking Welcome :"+(str1.compareTo(str)) != null?"yes":"no");
	
//Concatenates "Let us learn"
	String str2="Let us learn";
	System.out.println("Concantanating str and str2: "+str.concat(str2));
	//Return the position of the occurance of character'a'
	System.out.println("The 1st occurence of 'a' :"+str.indexOf('a', 0));
	//Replace all the occurence of 'a' letter to 'e'
	String replaceString=str.replaceAll("a","e");
	System.out.println("Replacing all 'a' to ''c' :"+replaceString);
	//Replace the String between 4th and 10th position
	String returnString=str.substring(4, 10);
	System.out.println("replaced string from 4th to 10 :"+returnString);
	//Return the lowercase of the String
	String lower=str.toLowerCase();
	System.out.println("The lower case String is: "+lower);
}}