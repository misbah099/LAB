/* Qusetion@2:Write a Java program to find sequences of lowercase letters joined with a underscore. */
package lab;

import java.util.Scanner;

public class SequenceLowercase {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the string to check");
		   String s=sc.nextLine();
			boolean b=false;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='_') {
					char c=s.charAt(i+1);
				
					if(Character.isLowerCase(c)) {
					b=true;
					break;
				}
					
					
			}
		} if(b)
			System.out.println("matched");
		else
			System.out.println("not matched");
			}}
