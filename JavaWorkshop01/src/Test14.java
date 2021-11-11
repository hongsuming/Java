
public class Test14 {

	public static void main(String[] args) {
		
		String mesg = "100/200";
		String [] data = mesg.split("/");
		int n = Integer.parseInt(data[0]);
		int n2 = Integer.parseInt(data[1]);
		System.out.println("정수값 합계 : "+(n+n2));
		System.out.println("정수값 평균 : "+(n+n2)/data.length);
		
		// 합계 sum에 저장 출력, 평균 avg 저장 출력
		int sum = n+n2;
		int avg = sum/data.length;
		
		System.out.println("정수값 합계 : "+sum);
		System.out.println("정수값 평균 : "+avg);

	}

}
