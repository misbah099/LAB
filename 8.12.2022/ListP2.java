package assignments;
//PROBLEM 2
import java.util.ArrayList;
import java.util.List;

public class ListP2 {
	public static void main(String[] args) {
		  // Creating list of colour
		  List<String> l = new ArrayList<String>();
		  l.add("Red");
		  l.add("Green");
		  l.add("Orange");
		  l.add("White");
		  l.add("Black");
		  System.out.println("Original list: " + l);//printing the orignal list
		  List<String> sl = l.subList(0, 3);//extracting the elelments till 3rd index 
		  System.out.println("Extracted Elements are: " + sl);//printing new extracted list
		 }
}
