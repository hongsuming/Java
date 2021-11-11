
public class ArrayTest03 {

	public static void main(String[] args) {
		
		int arr2 [][] = {					// [4][5]
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
				};
		
		int idx = 0;
		int sum = 0;
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				sum+=arr2[i][j];
				idx++;
			}
		}
		double avg = (double)sum/idx;
		System.out.println("total = "+sum);
		System.out.println("average = "+avg);

	}

}
