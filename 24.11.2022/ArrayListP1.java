package lab;

public class ArrayListP1 {
public static void main(String[] args) {
	double d=System.currentTimeMillis();
	ListLoader l=new ListLoader();
	l.loadList(0, 100000);
	double d2=System.currentTimeMillis();
	System.out.println("Response time is= "+(d2-d)+"milliseconds ");
}
}
