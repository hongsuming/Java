import java.util.Calendar;
import java.util.Random;

import com.xxx.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1.name);
		
		// java.lang의 모든 패키지는 import
		
		Random r = new Random();
		Calendar c = Calendar.getInstance();
		System.out.println(c);

	}

}
