
public class ArrayTest2 {

	public static void main(String[] args) {
		

		int [] num = new int[3];// 선언과 동시에 생성 
		num[0] =10;
		num[1] =20;
		num[2] =30;
		num = new int[4];
		num[0] =10;
		num[1] =20;
		num[2] =30;
		num[3] =40;		
		for(int x : num) {
			System.out.println(x);
		}
		int num2[]= new int[10];
		num2= num;//동일한 배열을 참조함 
		for (int i : num2) {
			System.out.println(i);
		}
		System.out.println(num2 +"\t"+ num);
		num[0]=1111;
		System.out.println(num2[0]);
	}//end main
}//end class




