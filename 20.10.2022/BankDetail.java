/* Problem 2.
Banking Operations relate a class with customer private instance
variables as accountNumber,accountName,accountBalance and
create methods as
1. create account => accnumber,accname,accbal
2. setAmount=> add amount to accbal
3. getAmount=>print accbal and name account
4. withDrawAmount()=to withdraw amount from accBalance
create a main class to use customer and create atleast two
customers */
package lab;
import java.util.Scanner;

public class BankDetail {
 private int accno;  
 private String name;  
 private long balance;  
 //method to open new account  
void createAccount(int accno,String name,long bal) {
	this.accno=accno;
	this.name=name;
	this.balance=bal;
}
void addAmount(int amount) {
	this.balance=amount;
}
void getAmount() {
	System.out.println("Account Name="+this.name+"\n Account Balance="+this.balance);
}
void withDrawAmount(int amount) {
	this.balance=amount;
}
}
	        
