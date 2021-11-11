
public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(); // 객체 생성
		// new Student() -> public Student(){} 생성자 호출 객체를 생성함
		System.out.println(s1.name+"\t"+s1.age+"\t"+s1.address);
		Student s2 = new Student(); 
		System.out.println(s2.name+"\t"+s2.age+"\t"+s2.address);

	}

}
