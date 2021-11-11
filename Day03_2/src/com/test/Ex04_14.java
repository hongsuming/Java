package com.test;

public class Ex04_14 {

	public static void main(String[] args) {
		
		// break 사용
		int n=1;
		while(n<=10) {
			System.out.println(n+" Hello World");
			n++;
			if(n==8) break;
		}
		System.out.println("n값이 8이면 while문 빠져나옴");
	}

}
