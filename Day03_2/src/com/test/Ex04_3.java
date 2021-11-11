package com.test;

import java.util.Scanner;

public class Ex04_3 {

	public static void main(String[] args) {
		
		// 학점구하기
		
		int score = 88;
		char grade;
		
		if(score>=90) {
			grade='A';
		}else if(score>=80) {
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else if(score>=60) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println("학점은 "+grade);
		
		
		// scanner 이용해서 학점 구하기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int jumsu = scan.nextInt();
		if(jumsu<60) {
			grade='F';
		}else if(jumsu<70) {
			grade='D';
		}else if(jumsu<80) {
			grade='C';
		}else if(jumsu<90) {
			grade='B';
		}else {
			grade='A';
		}
		System.out.println("학점은 "+grade);
	}

}