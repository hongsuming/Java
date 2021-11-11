package account;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
	}
	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calcuateInterest() {
		return this.balance*(this.interestRate/100);
	}
	public void deposit(int money) {
		this.balance+=money;
	}
	public void withdraw(int money) {
		if(balance<money) {
			System.out.println("출금을 할 수 없습니다.");
		}else {
			System.out.println(money+"을 출금하였습니다. 현재 잔액 : "+balance);
			balance-=money;
		}
	}
	
	@Override
	public String toString() {
		return "계좌번호 : " + account + ", 현재잔액 : " + balance;
	}
	

}
