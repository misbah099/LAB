package assignments;

import java.util.ArrayList;
import java.util.List;
//PROBLEM 3
public class ListP3 {
 public static void main(String[] args) {
		 List<String> l1= new ArrayList<String>();
		      l1.add("Red");
		      l1.add("Green");
		      l1.add("Black");
		      l1.add("White");
		      l1.add("Pink");
      ArrayList<String> l2= new ArrayList<String>();
		      l2.add("Red");
		      l2.add("Green");
		      l2.add("Black");
		      l2.add("Pink");
  //Storing the comparison output in ArrayList
		 List<String> l3 = new ArrayList<String>();
		      for (String e : l1)
		        l3.add(l2.contains(e) ? "Yes" : "No");
		        System.out.println(l3);
 }}
