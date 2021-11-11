
public class WhileTest2 {

	public static void main(String[] args) {
		
		// 반복문을 이용한 누적
		// 0~10까지의 합계 : 55
		
		int num = 0;	// 증가값
		int sum = 0;	// 누적된 합계
		while(num<=10) {
			sum+=num;	// sum = sum+num
			System.out.println(num+" "+sum);
			num++;
		}
		System.out.println(sum+"끝");
		
		// 1~100까지 합
		int num2 = 1;
		int sum2 = 0;
		while(num2<=100) {
			sum2+=num2;
			System.out.println(num2+" "+sum2);
			num2++;
		}
		System.out.println(sum2+"끝");
	}

}
