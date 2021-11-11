package calc;

import org.omg.CORBA.UserException;

public class Calculator {
	
	public double plus(int a, int b) {
		double result=0.0;
		result=a+b;
		System.out.print("결과 :");
		return result;
	}
	
	public double minus(int a, int b) {
		double result=0.0;
		result=a-b;
		System.out.print("결과 :");
		return result;
	}
	
	public double multiplication(int a, int b) {
		double result=0.0;
		result=a*b;
		System.out.print("결과 :");
		return result;
	}
	
	public double devide(int a, int b){
		double result=0.0;
		try {
		result=a/b;
		}catch(ArithmeticException e) {
			System.out.println("Exception이 발생하였습니다. 다시 입력해주세요.");
		}
		System.out.print("결과 :");
		return result;
	}

}
