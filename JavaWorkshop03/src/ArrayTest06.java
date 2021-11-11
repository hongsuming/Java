import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
				
		
		Scanner scan = new Scanner(System.in);
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람 수 : ");
		int m = scan.nextInt();
		int arr[] = new int[m];
		
		for(int i=0; i<m; i++) {
			System.out.print("사람 "+(i+1)+": ");
			arr[i]=scan.nextInt();
		}
		
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) max=arr[i];
		}
		System.out.println("최대값은 "+max+"cm입니다.");
		
		
	}

}
