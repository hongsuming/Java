package com.test;

public class Ex04_10 {

	public static void main(String[] args) {
		
		// 1부터 10까지 누적 합계 홀수만
		int total = 0;
		for(int n=1; n<=10; n+=2) {
			total+=n;
		}
		System.out.println("홀수의 총 합계는 "+total);
		
		// 2부터 10까지 누적 합계 짝수만
		int total2 = 0;
		for(int n=2; n<=10; n+=2) {
			total2+=n;
		}
		System.out.println("짝수의 총 합계는 "+total2);

	}

}
