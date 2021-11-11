
public class ForTest2 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println("hello "+i);
			if(i==3) break;
		}
		System.out.println("main");
		
		for(int i=0; i<5; i++) {
			System.out.println("num2 hello "+i);
			if(i==3) continue; // 반복문 다시 실행
			System.out.println("num2 hello2 "+i);
		}
		
		// 라벨 이용
		A:
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				System.out.println(i+"\t"+j);
				if(i==3) break A;
				//if(i==3) break;
			}
			System.out.println("for 바깥");
		}

		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				System.out.println(i+"\t"+j);
				if(i==3) break;
			}
			System.out.println("for 바깥");
		}
	}

}
