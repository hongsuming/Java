package account;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a = new Account("441-0290-1203", 500000, 7.3);
		System.out.println(a);
		a.withdraw(600000);
		a.deposit(20000);
		System.out.println(a);
		System.out.println(a.calcuateInterest()+"원");

	}

}
