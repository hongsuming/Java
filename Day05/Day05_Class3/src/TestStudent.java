
public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1.name+"\t"+s1.age+"\t"+s1.address);
		Student s2 = new Student();
		System.out.println(s2.name+"\t"+s2.age+"\t"+s2.address);
		
		s1.name="홍수민";
		System.out.println(s1.name+"\t"+s1.age+"\t"+s1.address);
		

	}

}
