
public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동1", "서울1");
		Student s2 = new Student("홍길동2", "서울2");
		Student s3 = new Student("홍길동3", "서울3");
		Student s4 = new Student("홍길동4", "서울4");
		Student s5 = new Student("홍길동5", 19, "서울5");
		
		Student students[] = new Student[5];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		students[3]=s4;
		students[4]=s5;
		
//		int sum=0;
//		for(int i=0; i<students.length; i++) {
//			Student stu = students[i];
//			sum+=stu.getAge();
//			System.out.println(stu);
//			System.out.println(students[i]);
//		}
//		System.out.println(sum);
		
		Student students2[] = {new Student("홍길동1","서울1"),
				new Student("홍길동2","서울3"),
				new Student("홍길동4","서울4"),
				new Student("홍길동5","서울5"),
				new Student("홍길동5",19,"서울5")};
		
		for (Student s : students2) {
			System.out.println(s);
		}

		

	}

}
