package lab;
//Problem 1
import java.util.ArrayList;

 class LoaderThread implements Runnable {
int startNumber,lastNumber;
LoaderThread(int sn,int ln){
	this.startNumber=sn;
	this.lastNumber=ln;
	}
public void  run() {
	ArrayList<Integer>L=new ArrayList<Integer>();
	for(Integer i=startNumber;i<=lastNumber;i++) {
		L.add(i);
	}
	for(int j:L) {
		System.out.println(j);
	}
}
public class MainThread2{
	public static void main(String[] args) throws InterruptedException {
		Runnable r=new LoaderThread(0,100);
		Thread t=new Thread(r);
		int a=(int)System.currentTimeMillis();//time taken before executing
		System.out.println("response time before executing loadlist "+a);
		t.start();
		t.join();
		int b=(int)System.currentTimeMillis();//After executing
		System.out.println("response time after executing loadlist "+b);
		System.out.println("Response time "+(b-a));
}
}
}
