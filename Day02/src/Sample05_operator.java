
public class Sample05_operator {

	public static void main(String[] args) {
		
		int n = 10;
		int n2 = 3;
		
		System.out.println(n+n2); // 13
		System.out.println(n-n2); // 7
		System.out.println(n*n2); // 30
		System.out.println(n/n2); // 3
		System.out.println(n/3.0); // 3. 3333
		System.out.println(n%n2); // 1
		
		// 대입 연산자
		int x = 10;
		int x2 = x;
		x2+=x; // x2 = 20
//		System.out.println(x2); // 20
//		
//		x2+=1; // x2 = x2 + 1 
//		x2=x2+1; // x2 + 1 = 22
//		System.out.println(x2); // 22
		
		x2 -= x;				// 20 - 10
		System.out.println(x2); // 10
		x2 *= x;				// 10 * 10
		System.out.println(x2); // 100
		x2 /= x;				// 100 / 10
		System.out.println(x2); // 10
		x2 %= x;				// 10 / 10
		System.out.println(x2); // 0
		x2 += 1;				// 0 + 1
		System.out.println(x2);	// 1
		x2 -= 1;				// 1 - 1
		System.out.println(x2); // 0
		
		// 비교 연산자
		int xyz = 5;
		int xyz2 = 3;
		boolean result = xyz == xyz2;
		System.out.println(result);		 // false
		System.out.println(xyz == xyz2); // false
		System.out.println(xyz != xyz2); // true
		System.out.println(xyz > xyz2);  // true
		System.out.println(xyz >= xyz2); // true
		System.out.println(xyz < xyz2);  // false
		System.out.println(xyz <= xyz2); // false
		
		System.out.println(3==4 && 4>3);	// false
		System.out.println(!true);			// false
		System.out.println(!false);			// true
		System.out.println(true || true);	// true
		System.out.println(true || false);	// true
		System.out.println(false || true);	// true
		System.out.println(false || false);	// false
		
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		System.out.println(false && true);	// false
		System.out.println(false && false);	// false		
		
		// 3항 연산자
		int xxx = (3==4) ? 100:200;
		String xxx2 = (3==4) ? "A":"B";
		System.out.println(xxx);		// 200
		System.out.println(xxx2);		// B

	}

}
