
public class Ex03_5 {

	public static void main(String[] args) {
		
		int a = 3;
		++a;							// 전치
		System.out.println(a);			// 4
		a--;							// 후치
		System.out.println(a);			// 3
		
		int k = 10;
		++k;
		System.out.println(k);
		// 전치
		// k = k+1
		k++;
		System.out.println(k);
		// 후치
		// k = k+1
		
		int b = 0;
		int sum = ++b;
		System.out.println("sum : "+ sum + ", b : " + b); // sum : 1, b : 1
		// 전치 +1하고 사용
		// 1. b=b+1
		// 2. sum=b
		
		int b2 = 0;
		int sum2 = b2++;
		System.out.println("sum2 : "+ sum2 + ", b2 : " + b2); // sum : 0, b : 1
		// 후치 사용하고 +1
		// 1. sum=b
		// 2. b=b+1
		
		
		int x = 5;						
		int y = ++x;					// 전치
		System.out.println(x+" "+y);	// 6 6
		// 전치 
		// 1. x = x+1
		// 2. y = x
		
		int x2 = 5;
		int y2 = x2++;					// 후치
		System.out.println(x2+" "+y2);	// 6 5
		// 후치
		// 1. y2 = x2
		// 2. x2 = x2+1
		
		int c = 10;
		int c2 = ++c;
		System.out.println(c+"\t"+c2);
		// 전치
		// 1. c = c+1;
		// 2. c2 = c
		int c3 = c++;
		System.out.println(c+"\t"+c2);
		// 후치
		// 1. c3 = c
		// 2. c = c+1
		
//		int a = 3;
//		++a;
//		System.out.println(a);
//		a--;
//		System.out.println(a);

	}

}
