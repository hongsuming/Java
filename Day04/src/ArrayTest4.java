
public class ArrayTest4 {

	public static void main(String[] args) {
		
		//1. new 이용
		int [] num;
		num = new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		//2. 값만 이용
		int [] num2 = { 10,20,30};// 리터럴 이용 , 자동생성, 초기값 지정 
		System.out.println(num2.length);
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2[2]);
		for (int i : num2) {
			System.out.println(i);
		}
		
		int [] num3 = {10,20,30,40};
		num2 = num3;
		for (int i : num2) {
			System.out.println(">>"+i);
		}
		String[] names= {"a", "b"};
		for (String s : names) {
			System.out.println(s);
		}
	
	}

}
