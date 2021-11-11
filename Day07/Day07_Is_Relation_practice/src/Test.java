
public class Test {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		m.setName("홍길동");
		m.setAddress("서울");
		m.setDepart("영업부");
		m.setSsn("1234");
		System.out.println(m.getName()+"\t"+m.getAddress()+"\t"+m.getDepart()+"\t"+m.getSsn());
		
		Engineer e = new Engineer();
		e.setName("이순신");
		e.setAddress("경기");
		e.setSsn("1234");
		e.setSkill("전자공학");
		System.out.println(e.getName()+"\t"+e.getAddress()+"\t"+e.getSsn()+"\t"+e.getSkill());
		

	}

}
