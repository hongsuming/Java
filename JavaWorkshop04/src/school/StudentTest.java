package school;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 15, 171, 81);
		Student s2 = new Student("한사람", 13, 183, 72);
		Student s3 = new Student("임걱정", 16, 175, 65);
		
		Student arr[] = new Student[3];
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		
		double t_a=0.0;
		double t_h=0.0;
		double t_w=0.0;
		System.out.println("이름\t나이\t신장\t몸무게");
		for(int i=0; i<arr.length; i++) {
			t_a+=arr[i].getAge();
			t_h+=arr[i].getHeight();
			t_w+=arr[i].getWeigth();
			System.out.println(arr[i]);
		}
		
		System.out.println();
		System.out.printf("나이의 평균 : %.2f \n",t_a/3);
		System.out.printf("신장의 평균 : %.2f \n",t_h/3);
		System.out.printf("몸무게의 평균 : %.2f \n",t_w/3);
	}

}
