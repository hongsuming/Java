
public class Person {
	
	String name;
	int age;
	String address;
	
	public Person() {
		
	}
	public Person(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}

	// 멤버함수
	public String toString() {
		return this.name+"\t"+this.age+"\t"+this.address;
	}
	
}
