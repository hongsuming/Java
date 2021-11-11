
public class ArrayTest5 {

	public static void main(String[] args) {
		
		//1. new 이용
		int [] num;
		num = new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		//2. 값만 이용
		int [] num2 = { 10,20,30};
	
		//3.  new+값 리터럴
		int [] num3;
		num3 = new int[]{ 10,20,30};
		num3 = new int[]{ 10,20,30,40};
		for (int i : num3) {
			System.out.println(">>"+i);
		}
	}

}
