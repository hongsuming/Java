
public class Cat extends Pet{ // 상속 관계 지정 (단일 상속만 가능)
	
	// name, age는 부모 클래스에 있기 때문에 삭제함
	private String gender;
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age, String gender) {
		// 묵시적으로 super()로 부모 기본 생성자 호출
		System.out.println("Cat 생성자 호출--------------------------");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// 오버라이딩(재정의) : 부모의 함수를 자식에서 입맛에 맞도록 내용 수정
	// 상속 관계에서 부모의 함수 정의는 따라가되 내용은 수정하는 것
	public void cry() {
		System.out.println("cat 울기~");
	}
		
	@Override
	public void eat() {
		//super.eat();
		System.out.println("cat 사료 먹기");
	}
	@Override
	public void sleep() {
		//super.sleep();
		System.out.println("cat 새근새근~");
	}
	
	
	// get, set 함수도 부모 클래스에 있기 떄문에 삭제함
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Cat [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}
	
	


}
