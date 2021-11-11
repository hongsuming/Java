package school2;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 15, 170, 80);
		Student s2 = new Student("한사람", 13, 180, 70);
		Student s3 = new Student("임걱정", 16, 175, 65);
		
		Student arr[] = new Student[3];
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		
		
		
		
		
		double t_a=0.0;
		double t_h=0.0;
		double t_w=0.0;
		
		int maxA=0;
		int minA=0;
		int maxH=0;
		int minH=0;
		int maxW=0;
		int minW=0;
		System.out.println("이름\t나이\t신장\t몸무게");
		for(int i=0; i<arr.length; i++) {
			t_a+=arr[i].getAge();
			t_h+=arr[i].getHeight();
			t_w+=arr[i].getWeigth();
			System.out.println(arr[i].studentInfo());
			
			if(arr[maxA].getAge()<arr[i].getAge()) maxA=i;
			if(arr[minA].getAge()>arr[i].getAge()) minA=i;
			if(arr[maxH].getHeight()<arr[i].getHeight()) maxH=i;
			if(arr[minH].getHeight()>arr[i].getHeight()) minH=i;
			if(arr[maxW].getWeigth()<arr[i].getWeigth()) maxW=i;
			if(arr[minW].getWeigth()>arr[i].getWeigth()) minW=i;
		}
		
		System.out.println();
		System.out.printf("나이의 평균 : %.3f \n",t_a/3);
		System.out.printf("신장의 평균 : %.3f \n",t_h/3);
		System.out.printf("몸무게의 평균 : %.3f \n",t_w/3);
		
		Student max_a = arr[0];
		Student max_h = arr[0];
		Student max_w = arr[0];
		Student min_a = arr[0];
		Student min_h = arr[0];
		Student min_w = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max_a.getAge()<arr[i].getAge()) max_a=arr[i];
			if(min_a.getAge()>arr[i].getAge()) min_a=arr[i];
			if(max_h.getHeight()<arr[i].getHeight()) max_h=arr[i];
			if(min_h.getHeight()>arr[i].getHeight()) min_h=arr[i];
			if(max_w.getWeigth()<arr[i].getWeigth()) max_w=arr[i];
			if(min_w.getWeigth()>arr[i].getWeigth()) min_w=arr[i];
		}
	
		
		System.out.println();
		System.out.println("나이가 가장 많은 학생 : "+max_a.getName()+"\t"+arr[maxA].getName());
		System.out.println("나이가 가장 적은 학생 : "+min_a.getName()+"\t"+arr[minA].getName());
		System.out.println("키가 가장 큰 학생 : "+max_h.getName()+"\t"+arr[maxH].getName());
		System.out.println("키가 가장 작은 학생 : "+min_h.getName()+"\t"+arr[minH].getName());
		System.out.println("몸무게가 가장 많은 학생 : "+max_w.getName()+"\t"+arr[maxW].getName());
		System.out.println("몸무게가 가장 적은 학생 : "+min_w.getName()+"\t"+arr[minW].getName());
	}

}
