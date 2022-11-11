/* Write a Java program to remove duplicate characters from a given string presents in another given string. 
Sample Output: 
The given String is: Anudip Foundation Skill & career development centre.
The given mask string is – Famous
The new string is: Without all letters 
 */
package lab;
import java.util.Scanner;

public class StringQ3 {
 public static void main(String[] args) {
		  String str1 = "Anudip Foundtion Skill & Career development centre ";
		  Scanner sc=new Scanner(System.in);//taking the second string as a input 
		  System.out.println("Enter the String you want to check");

		  String str2=sc.nextLine();//for 'Famous'
		  System.out.println("The given string is: " + str1);
		  System.out.println("The given secondString string is: " + str2);
		  char arr[] = new char[str1.length()];
		  char[] secString = new char[250];
		  
		  for (int i = 0; i < str2.length(); i++) {
		   secString[str2.charAt(i)]++;}
		  System.out.println("\nThe new string is: ");
		  for (int i = 0; i < str1.length(); i++) {
		   if (secString[str1.charAt(i)] == 0)
		    System.out.print(str1.charAt(i));
		  } }}
