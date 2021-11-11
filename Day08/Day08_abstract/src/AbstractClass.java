
public abstract class AbstractClass {
// 멤버변수, 생성자, 함수 포함, 추상메소드(구현 안 된)가 포함된 클래스
// abstract 클래스로 선언, new 객체 생성 안 됨
// 다른 클래스에서 extends로 상속, 추상 메소드 오버라이딩
// 구현된 클래스를 객체 생성해서 사용
	
	private int num;
	
	public abstract void test(); //{}가 없는 추상 메소드

	public AbstractClass() {}
	public AbstractClass(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
