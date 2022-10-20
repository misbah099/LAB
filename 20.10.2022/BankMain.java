package lab;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		BankDetail b1=new BankDetail();
		BankDetail b2=new BankDetail();
		b1.createAccount(1111, "Misbah", 100000);
        b1.addAmount(3000);
        b1.getAmount();
        b1.createAccount(2222, "Sourav", 44000);
        b1.addAmount(2000);
        b1.getAmount();
	}
	  }

