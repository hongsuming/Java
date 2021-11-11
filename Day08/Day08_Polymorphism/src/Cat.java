
// Cat is a Pet ==> 상속관계로 지정가능

public class Cat extends Pet{


	private String gender;
	
	//동작
	@Override
	public void cry() {
		System.out.println("cat 야옹이~");
	}
	@Override
	public void eat() {
		System.out.println("cat 생선 먹기");
		
	}
	@Override
	public void sleep() {
		System.out.println("cat 새근새근~");
		
	}
	
	
	
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	



	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
