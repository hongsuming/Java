package com.test;

public class Ex05_12_1 {
	// 멤버변수
	int num=100;
	
	public static void change(int num) {
		System.out.println("1번 호출");
		num=20;
	}
	
	// 메소드 오버로딩
	public static void change(Ex05_12_1 a) {
		System.out.println("2번 호출");
		a.num=200;
	}
	
	public static Ex05_12_1 change2(Ex05_12_1 a) {
		Ex05_12_1 test = a;
		test.num=500;
		return test;
	}
	
	
	public static void main(String[] args) {
		
		int num=10;
		System.out.println("change 함수 호출 전 num = "+num);
		change(num);
		System.out.println("change 함수 호출 후 num = "+num);
		
		Ex05_12_1 ex1 = new Ex05_12_1();
		System.out.println("객체 생성 num = "+ex1.num);
		change(ex1);
		System.out.println("change 호출 후 객체 생성 num = "+ex1.num);
		change(ex1.num);
		System.out.println("change 호출 후 객체 생성 num = "+ex1.num);
		Ex05_12_1 ex2 = change2(ex1);
		System.out.println("change 호출 후 객체 생성 num = "+ex2.num);
	}

}
