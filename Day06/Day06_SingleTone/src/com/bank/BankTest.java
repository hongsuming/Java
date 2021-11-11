package com.bank;

public class BankTest {

	public static void main(String[] args) {
		
		Bank b1 = Bank.getBank();
		System.out.println(b1);
		Bank b2 = Bank.getBank();
		System.out.println(b1+"\t"+b2);
		
		b1.setName("kb저축");
		System.out.println(b2.getName());
		System.out.println(b1.getName());

	}

}
