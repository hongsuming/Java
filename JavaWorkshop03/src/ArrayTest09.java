
public class ArrayTest09 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		int randNum = 0;
		int sum = 0;
		
		top:
		for(int i=0; i<5; i++) {
			randNum = (int)(Math.random()*10+1);
			for(int j=0; j<=i; j++) { 
				// 바로 값을 넣지 않고 중복 값 검사
				if(randNum==arr[j]) {
					continue top;	  // 중복 값 있을 경우 top으로 돌려보내서 
									  // 다시 랜덤 값 받음
				}
			}
			arr[i]=randNum;			  // 중복되지 않은 랜덤 값만 배열에 넣음
		}
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (double)sum/arr.length);

	}

}
