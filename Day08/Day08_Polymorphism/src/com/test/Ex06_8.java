package com.test;
class Test{
	public static void taxRate(Employee e) { // 다형성 매개변수
		if(e instanceof Manager) {
			Manager m = (Manager) e;
			System.out.println("Manager 세금 구하기");
		} else if(e instanceof Engineer) {
			Engineer en = (Engineer) e;
			System.out.println("Engineer 세금 구하기");
		} else if(e instanceof Employee) {
			System.out.println("Employee 세금 구하기");
		}
	}
}
class Employee{}
class Manager extends Employee{}
class Engineer extends Employee{}

public class Ex06_8 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Manager man = new Manager();
		Engineer eng = new Engineer();
		
		Test.taxRate(emp);
		Test.taxRate(man);
		Test.taxRate(eng);
		
//		Employee tt = new Engineer(); //
//		Test.taxRate(tt);
	}
}
