
public class ForTest {

	public static void main(String[] args) {
		
		// 1. for문
		for (int i3 = 0; i3 < 5; i3++) {		// i3이 0부터 4까지 총 5번
			System.out.println("hello "+i3);
			
		}
		System.out.println("for 바깥-------");
		
		// 1-1. 누적 합계
		int sum = 0;
		for (int k = 0; k <= 10; k++) {
//			int sum = 0; 이렇게 되면 밖에서 sum 사용이 안 될 뿐더러
//			for문이 돌 때마다 sum 값이 0으로 계속 초기화 됨
			sum+=k; // sum = sum+k
		}
		System.out.println(sum);
		
		// 2. 10부터 1까지 반대로
		for (int i2 = 10; i2 > 0; i2--) {
			System.out.println("world "+i2);
		}
		
		// 3. 변수 2개 동시에
		for(int i=0, j=0; i<5 && j<3; i++, j++) {
			System.out.println("happy "+i+"\t"+j);
		}
		
		// 4. 2씩 증가
		for (int i4=0; i4<5; i4+=2) {
			System.out.println("hello "+i4);
		}
		
		// 5. 이중 for문
		for(int i5=0; i5<5; i5++) {
			for(int j5=0; j5<4; j5++) {
				System.out.println(i5+"\t"+j5);
			}
		}
		
		// 6. 이중 for문
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.println("6번 : "+i+"\t"+j);
			}
		}
		
		

	}

}
