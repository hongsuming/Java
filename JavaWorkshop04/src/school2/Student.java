package school2;

public class Student {
	
	private String name;
	private int age;
	private int height;
	private int weigth;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, int height, int weigth) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weigth = weigth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeigth() {
		return weigth;
	}
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	
	public String studentInfo() {
		return name+"\t"+age+"\t"+height+"\t"+weigth;
	}
	
	

}
