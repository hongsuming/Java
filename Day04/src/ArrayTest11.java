import java.util.Arrays;

public class ArrayTest11 {

	public static void main(String [] args) {
		
		// 2차원배열
		//1. new
		//2. 값
		//3. new+값 혼합
		int [][] num = new int[][]{{10,20,30},{40},{50,60}}; 
		
		for (int[] is : num) {
			for(int x : is) {
				System.out.println(x);
			}
		}
		
	}//end main

}




