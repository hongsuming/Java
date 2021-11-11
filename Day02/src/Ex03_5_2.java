
public class Ex03_5_2 {

	public static void main(String[] args) {

		int a = 3;						
		++a;								// a+1
		System.out.println(a);				// 4
		a--;								// 4-1
		System.err.println(a);				// 3
		
		int x = 5;							
		int y = ++x;						// 1. x=x+1 2. y=x
		System.out.println(x + " " + y);	// 6 6
		
		int x2 = 5;							
		int y2 = x2++;						// 1. y2=x2 2. x2=x2+1
		System.out.println(x2+ " " + y2);	// 6 5
	}

}
