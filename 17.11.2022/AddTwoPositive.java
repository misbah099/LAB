package lab;
//Question 3
public class AddTwoPositive {
public void addTwoPositive(int a,int b)throws ArithmeticException{
	try {
		if(a<0||b<0) {
			throw new ArithmeticException("non positive integer ");
		}else {
			System.out.println("The sum of two number is "+(a+b));
		}
	}finally {
		System.out.println("End of the program");
	}
}
public static void main(String[] args) {
	AddTwoPositive ob=new AddTwoPositive();
	ob.addTwoPositive(22, -21);
}
}
