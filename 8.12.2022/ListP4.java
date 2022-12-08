package assignments;
//PROBLEM 4
import java.util.ArrayList;
import java.util.List;

public class ListP4 {

	public static void main(String[] args) {
List<String>l=new ArrayList<String>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
System.out.println("The orignal Ist is: "+l);
System.out.println("Checking List is Empty or not: "+l.isEmpty());
l.removeAll(l);
System.out.println("The List after removing all element is: "+l);
System.out.println("Checking List is Empty or not: "+l.isEmpty());
	}}
