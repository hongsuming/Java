
public class MyTest03 {

	public static void main(String[] args) {
		int n = 10;
		int n2 = 20;
		
		
		// 두 개의 값을 swap
//		n = n2; // n = 20, n2 = 20
//		n2 = n; // n2 = 20 -> 20, n = 20
		
		// 변수를 이용하여 두 개의 값을 swap
		int nn = n;
		n = n2;
		n2 = nn;
		
		
		System.out.println("n값은 "+n);
		System.out.println("n2값은 "+n2);

	}
}
