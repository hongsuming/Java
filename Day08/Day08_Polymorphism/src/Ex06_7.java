


class Employee {
	String name;
	int salary;

	public Employee() {
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getEmployee() {
		return name + "\t" + salary;
	}
}

class Manager extends Employee {
	String depart;

	public Manager() {
	}

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	@Override
	public String getEmployee() {
		return super.getEmployee() + "\t" + depart;
	}

	public void test() {
		System.out.println("Manager.test() 호출 됨 -------------------");
	}
}

public class Ex06_7 {
	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 2000);
		System.out.println(emp.getEmployee());

		emp = new Manager("이순신", 4000, "개발");
//		emp.depart; 접근 자신의 멤버 변수, 함수만 가능
//		emp.test(); 자식의 유일한 함수여서 접근 안 됨
		System.out.println(emp.getEmployee()); // 실제 객체의 오버라이딩 된 함수가 호출 됨
		Manager m =(Manager) emp;
		System.out.println(m.name+"\t"+m.salary+"\t"+m.depart);
	}
}
