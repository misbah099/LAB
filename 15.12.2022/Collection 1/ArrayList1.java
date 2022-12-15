//Problem 1
/*  */
package assignments;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
private ArrayList<Integer> A1 = new ArrayList<Integer>();
	
	public ArrayList<Integer> storeEvenNumbers(int N) {//method 1 to store Even number
		A1 = new ArrayList<Integer>();
		
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) A1.add(i);//adding the even numbers in list
		}
			return A1;}
		public ArrayList<Integer> printEvenNumbers() {//method 2 to print even pattern 4,8,12...n
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		
		for (int item : A1) {
			A2.add(item * 2);
			System.out.print(+item * 2+" ");
		}
			return A2;}
	public int retrieveNumber(int N) {//method 3t to check number passed 'N' 
		Iterator<Integer> it = A1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(N))// check the number
				return N;	}
			return 0;}
		public static void main(String[] args) {
		ArrayList1 asg = new ArrayList1();
		System.out.println("the even Array List is: "+asg.storeEvenNumbers(20));
	//	System.out.println("the even Array List after multiply: "+asg.printEvenNumbers());
		asg.printEvenNumbers();//print list by multiplying by 2
		System.out.println("The number is present in the list :"+asg.retrieveNumber(4));//check number present if then print number
		System.out.println("The answer is :"+asg.retrieveNumber(3));//print 0 because 3 is not present in 
}}
