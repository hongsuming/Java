
public class ArrayTest1 {

	public static void main(String[] args) {
		
		// 1. 배열 선언
		// 데이터타입 [] 변수명;
		int [] num;
		
		//2. 배열 생성
		// 변수명 =  new 데이터타입[크기];  
		num = new int[3];   //index 0~2번까지 3개의 방 생성 ,자동 초기화 
		System.out.println(num[0]);
		System.out.println(num[2]); // 범위 초과   java.lang.ArrayIndexOutOfBoundsException
		
		
		
		//3. 배열방 명시적 초기화
		num[0] =10;
		num[1] =20;
		num[2] =30;
		//num[3] =40;   //java.lang.ArrayIndexOutOfBoundsException
		//4. 배열 데이터 사용 
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println("배열크기(길이)"+ num.length);//index =0~  배열.length-1 
		System.out.println(num);//배열의 주소 저장 -참조변수
		
		
		int sum=0;
		for(int i=0; i<num.length;i++) {  // i=idx번호 
			System.out.println(">> num["+i+"]=  " + num[i]);
			sum+=num[i];
		}
		System.out.println(sum);		
		System.out.println("===============================");
		int idx=0;
		for (int i : num) {//i는 idx 가 아닌 실제 방 하나의 데이터가 됨 
			System.out.println("num["+idx+"]======"+i);
			idx++;
		}
		
		// foreach문
		for(int x : num) {
			System.out.println(x);
		}
	
	}

}
