package assignment;
//1.Implement inter thread communication by creating banking methods like deposit and withdraw.
class Bank {
	int total=100000;
	synchronized void deposit(int amount) {
		total+=amount;
		System.out.println("deposit is completed");
		System.out.println("Total balance is "+total);
		notify();}
	synchronized void withdraw(int amount1) {
		total-=amount1;
		System.out.println("withdrawl is completed");
		System.out.println("Total balance is "+total);
		notify();
	}}
class Thread1 extends Thread{
	Bank b;
	Thread1(Bank b){
		this.b=b;}
	public void run() {
		b.deposit(60000);
	}}
	class Thread2 extends Thread{
		Bank b;
		Thread2(Bank b){
			this.b=b;}
		public void run() {
			b.withdraw(10000);
		}}
	public class IOQ1{
public static void main(String[] args) {
	Bank obj=new Bank();
	Thread1 t1=new Thread1(obj);
	Thread2 t2=new Thread2(obj);
	t1.start();
	t2.start();
}}
