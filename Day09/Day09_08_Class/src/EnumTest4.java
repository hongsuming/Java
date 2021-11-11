
public class EnumTest4 {
	
	public enum DML { SELECT, INSERT, DELETE}
	
	public static void check(DML num) { // 매개변수를 열거형 상수로 지정 제한을 줌
		switch(num) {
		case SELECT: System.out.println("SELECT"); break;
		case INSERT: System.out.println("INSERT"); break;
		case DELETE: System.out.println("DELETE"); break;
		default: System.out.println("default"); break;
		}
	}
	
	public static void main(String[] args) {
		
		check(DML.SELECT);
		check(DML.INSERT);
		check(DML.DELETE);
//		check(99); 의미 없는 숫자 지정 불가능


	}

}
