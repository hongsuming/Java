package com.bank;


public class Bank {
	
	private String name; // 멤버변수
	private static Bank b = new Bank(); // 2. 하나는 만들어놔야 해서 같은 클래스에서 생성자를 이용해 객체 하나를 만듦
	
	// 기본생성자
	private Bank() { // 1. 다른 클래스에서 객체 생성 못 하게 생성자를 private으로 막아 놓음. (같은 클래스에서만 사용 가능)
					 // 문제 : 하나는 만들어야 하는데 하나도 못 만드는 문제가 발생
	}
	
	// get, set 함수
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public static Bank getBank() { // 3. 만들어놓은 하나의 Bank를 다른 클래스에서 사용하라고  getBank 함수를 만듦 
								   // static을 붙이지 않으면 객체 생성하고 사용해야 하는데 객체 생성을 할 수 없게 막아놔서
								   // static 키워드를 붙여서 생성하지 않고 사용할 수 있도록 함
		return b;				   // 만들어 놓은 하나의 Bank 객체를 리턴해줌 
	}

}

