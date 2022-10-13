package lab;
/* ... Develop a public java class and make sure nobody can create any object of this class from outside the class */
public class Test {
private String a;
private int b;
private Test() {
	System.out.println(a+b);
}
public static void main(String[] args) {
	Test t=new Test();

}
}
