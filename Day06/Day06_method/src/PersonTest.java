
public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20, "aa@naver.com");
		Person p2 = new Person("이순신", 10, "bb@naver.com");
		
		System.out.println(p1);
		System.out.println(p2);
		
		if(p1.getAge()==p2.getAge()) {
			System.out.println("나이 같음");
		} else {System.out.println("나이 다름");
		}
		
		p1.setName("이순신");
		
		if((p1.getName()).equals(p2.getName())) {
			System.out.println("이름 같음");
		} else {System.out.println("이름 다름");
		}

	}

}
