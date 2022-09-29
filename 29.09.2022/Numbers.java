/*  Write a java program to print numbers between 1 to 100 are divisible be 3,5 and both */
package lab;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("NUMBERS DIVISIBLE BY 3 ARE");
  for(int i=1;i<100;i++) {
	if(i%3==0) {
		System.out.print(i+" ");
	}}
	System.out.println("\n NUMBERS DIVISIBLE BY 5 ARE");

  for(int i=1;i<100;i++) {
	  if(i%5==0) {
	System.out.print(i+" ");
  
	  } }
	System.out.println("\n NUMBERS DIVISIBLE BY BOTH 3&5 ARE");

  for(int i=1;i<100;i++) {
	  if(i%3==0&& i%5==0) {
	System.out.print(i+" ");
  
} }
  
	}}
