import java.util.Calendar;
import java.util.Random;

import com.xxx.Student;

public class StudentTest2 {

	public static void main(String[] args) {
		
		// 패키지의 명시적 사용
		com.xxx.Student s1 = new com.xxx.Student();
		com.yyy.Student s2 = new com.yyy.Student();
		com.zzz.Student s3 = new com.zzz.Student();
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.name);

	}

}
