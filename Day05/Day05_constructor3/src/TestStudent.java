
public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍수민"); // 객체 생성
		System.out.println(s1.name+"\t"+s1.age+"\t"+s1.address);
		Student s2 = new Student("홍재훈"); 
		System.out.println(s2.name+"\t"+s2.age+"\t"+s2.address);
		Student s3 = new Student("홍수민",24,"천호");
		System.out.println(s3.name+"\t"+s3.age+"\t"+s3.address);
		Student s4 = new Student();
		System.out.println(s4.name+"\t"+s4.age+"\t"+s4.address);

	}

}
