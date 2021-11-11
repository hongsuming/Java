package calc;

import org.omg.CORBA.UserException;

public class CalcTest {

	public static void main(String[] args) {
		int data1 = Integer.parseInt((args[0]));
		String arg = args[1];
		char operator = arg.charAt(0);
		int data2 = Integer.parseInt(args[2]);
		System.out.println(data1 + "\t" + operator + "\t" + data2);
		System.out.println();

		Calculator calc = new Calculator();
		if (operator == '+') {
			System.out.println(calc.plus(data1, data2));
		} else if (operator == '-') {
			System.out.println(calc.minus(data1, data2));
		} else if (operator == 'x') {
			System.out.println(calc.multiplication(data1, data2));
		} else if (operator == '/') {
			System.out.println(calc.devide(data1, data2));
			
		}

	}

}
