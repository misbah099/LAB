/* Q: */
package lab;

import java.util.Scanner;

public class SpecificvalueArray {
	public static boolean contains(int[] arr, int num) {
	      for (int i : arr) {
	         if (num == i) {
	            return true;
	         }
	      }
	      return false;
	   }
	   public static void main(String[] args) {
	          int[] my_array1 = {1789, 2035, 1899, 1456, 2013};
	      System.out.println(contains(my_array1, 2013));
	   }}
