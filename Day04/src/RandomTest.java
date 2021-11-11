import java.util.Random;

public class RandomTest {

	public static void main(String [] args) {
		
		//랜덤값 얻기
		Random r = new Random();
		System.out.println(r.nextInt(10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int n = r.nextInt();
		int n = r.nextInt(5)+1; //1~5
		System.out.println(n);
		boolean n2 = r.nextBoolean();
		System.out.println(n2);
		
		
		
		//현재시간:  long타입으로   1/1000초
		//유일한 값 지정시
//		long kkk = System.currentTimeMillis();
//		int sum=0;
//		for (int i = 0; i < 100000; i++) {
//			sum+=i;
//			System.out.println(sum);
//			
//		}
//		System.out.println("총합============="+ sum);
//		long kkk2 = System.currentTimeMillis();
//		System.out.println(kkk+"\t"+ kkk2);
//		System.out.println(kkk2-kkk);
		
	}//end main

}




