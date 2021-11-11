import java.util.Arrays;

public class ArrayTest9 {

	public static void main(String [] args) {
		
		// 2차원배열
		// 2. 비정방형(모든행의 열크기동일)

		int [][] num = new int[2][]; //2행 
		
		num[0] = new int[3];
		num[1] = new int[2];
		
		//초기화
		num[0][0] =10;
		num[0][1] =20;
		num[0][2] =30;
		num[1][0] =40;
		num[1][1] =50;
		
		System.out.println("==================================");
		for (int i = 0; i < num.length; i++) {//2
			for (int j = 0; j < num[i].length; j++) {//3
				System.out.println("num["+i+"]["+j+"]="+num[i][j]);
			}
		}
		System.out.println("==================================");				
		
		
		for (int[] is : num) {
			for(int x :is) {
				System.out.println(x);
			}
		}
		
		System.out.println("행의 갯수:"+num.length);
		System.out.println("1행의 열갯수:"+num[0].length);
		System.out.println("2행의 열갯수:"+num[1].length);
	}//end main

}




