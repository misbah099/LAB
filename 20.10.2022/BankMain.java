package lab;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		BankDetail b1=new BankDetail();//creating the object of 1st account
		BankDetail b2=new BankDetail();//creating the object of second account
		b1.createAccount(1111, "Misbah", 100000);//details of 1st account
        b1.addAmount(3000);//amount added by 1st account
	b1.withDrawAmount(20000);//amount withdraw by 1st account
        b1.getAmount();//print the updated details
        b2.createAccount(2222, "Sourav", 44000);//creating the 2nd account
        b2.addAmount(2000);//adding amount by 2nd
        b2.withDrawAmount(10000);//withdrawing the balance from 2nd
        b2.getAmount();//updated detail of 2nd acc
	}
	  }

