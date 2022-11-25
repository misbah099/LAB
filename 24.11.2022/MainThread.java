//Create two threads to print even numbers and odd numbers from 1 to 100?
//note: after printing of all even numbers only odd numbers should print
package lab;
class EvenNoThread implements Runnable{
	 public void run() {
	        System.out.println("All Even Numbers are ");
	        for (int i = 1; i <= 100; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i+" ");
	            }   }   }}
class OddNoThread implements Runnable{
	public void run() {
        System.out.println("\nAll Odd Numbers are ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            } } }}
public class MainThread {
	public static void main(String[] args) throws InterruptedException {
        EvenNoThread obj1=new EvenNoThread();
        Thread t1 = new Thread(obj1);
        t1.start();  // first thread will start 
        t1.join(); // t2 wait for completing t1 then t2 start 
        OddNoThread obj2=new OddNoThread();
        Thread t2 = new Thread(obj2);
        t2.start(); // then second thread will start
  }}
