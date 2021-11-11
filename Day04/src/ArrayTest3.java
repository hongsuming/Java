
public class ArrayTest3 {
	//클래스 안에 선언 : 멤버변수, 메소드(함수), 생성자(constructor)로 구성 
	//change1함수 
	public static void change1(int n) {//클래스의 메소드(함수)는 new를 통한 객체 생성 후 참조변수 이용 사용해야하지만 
		//static 함수는 객체 생성 없이 사용이 가능함
		System.out.println("change1호출됨=============================");
		n =20;
	}
	//change2함수 
	public static void change2(int [] n) {//클래스의 메소드(함수)는 new를 통한 객체 생성 후 참조변수 이용 사용해야하지만 
		//static 함수는 객체 생성 없이 사용이 가능함
		System.out.println("change2 호출됨=============================");
		n[2]=90;
	}
	public static void change3(int n) {//클래스의 메소드(함수)는 new를 통한 객체 생성 후 참조변수 이용 사용해야하지만 
		//static 함수는 객체 생성 없이 사용이 가능함
		System.out.println("change3 호출됨=============================");
		n=1111;
	}
		public static void main(String[] args) {		
		//기본형 데이터
		int xxx =10;
		System.out.println("호출전:"+ xxx);//10 
		change1(xxx);  //change1함수 호출 xxx=10 을 매개변수로 전달함   기본형데이터 - 함수로 전달 사용시 call by value 를 사용함 : 값의 복사 
		System.out.println("호출후:"+ xxx);  //10
		////////////////////////////////////////////////////////////////////////////
		//참조형 데이터
		int [] num= new int[3];  // num은 참조변수 , 주소값저장 
		num[0]=10;
		num[1]=20;
		num[2]=30;
		System.out.println("호출전"+ num[2]);//30 출력 
		change2(num);  // 매개변수로 주소전달 : 참조형 변수 - call by reference / call by  ref - 호출된 함수에서 내용을 변경 -> 반영되어 있음
		System.out.println("호출전"+ num[2]);//90출력 
		/////////////////////////////////////////////////////////////////////////////////
		System.out.println(num[0]);// 10 
		change3(num[0]);
		System.out.println("=========="+num[0]);//?
	}//end main
}//end class




