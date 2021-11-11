package com.test;

public class Ex04_11 {

	public static void main(String[] args) {
		
		// 이중 for문으로 탑 쌓기
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
