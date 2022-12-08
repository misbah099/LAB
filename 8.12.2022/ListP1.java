package assignments;
//PROBLEM 1
import java.util.ArrayList;
import java.util.List;

public class ListP1 {
	public static void main(String[] args) {
		  // Creating list of colour
		  List<String> l = new ArrayList<String>();
		  l.add("Red");
		  l.add("Blue");
		  l.add("Green");
		  l.add("Black");
		  System.out.println("Original list: " + l);//printing the orignal list
		  l.add(2,"Yellow");
		  System.out.println("Updated list: " + l);//printing the updated list

}}
