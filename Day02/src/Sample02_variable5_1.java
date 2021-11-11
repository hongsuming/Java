
public class Sample02_variable5_1 {

	public static void main(String[] args) {
//		int num = 10;
		
		// 자바는 블럭 scope (자바스크립트는 함수 scope)
		{ // A 블럭
//			num = 20;
			int num = 10;
			System.out.println("A 블럭 : " + num);
		
		} // A 블럭 종료
//		System.out.println(num); // 블럭 밖에서 인식 불가
		
		{ // B 블럭
			int num = 20;
			System.out.println("B 블럭 : " + num);
			{ // C 블럭
				System.out.println("C 블럭 : " + num);
			} // C 블럭 종료
		} // B 블럭 종료
	} // main 블럭
	
}
