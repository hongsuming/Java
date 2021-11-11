package mobile;

public class MobileTest {

	public static void main(String[] args) {

		Ltab ltab = new Ltab("Ltab", 500, "AP-01");
		Otab otab = new Otab("Otab", 1000, "AND-20");
		System.out.println("Mobile \t BatterySize \t OsType");
		System.out.println("-------------------------------------------------");
		System.out.println(ltab.getName()+"  \t  "+ltab.getBatterySize()+"    \t"+ltab.getOsType());
		System.out.println(otab.getName()+"  \t  "+otab.getBatterySize()+"    \t"+otab.getOsType());
		System.out.println("10분 충전");
		ltab.charge(10);
		otab.charge(10);
		System.out.println("Mobile \t BatterySize \t OsType");
		System.out.println("-------------------------------------------------");
		System.out.println(ltab.getName()+"  \t  "+ltab.getBatterySize()+"    \t"+ltab.getOsType());
		System.out.println(otab.getName()+"  \t  "+otab.getBatterySize()+"    \t"+otab.getOsType());
		System.out.println("5분 통화");
		ltab.operate(5);
		otab.operate(5);
		System.out.println("Mobile \t BatterySize \t OsType");
		System.out.println("-------------------------------------------------");
		System.out.println(ltab.getName()+"  \t  "+ltab.getBatterySize()+"    \t"+ltab.getOsType());
		System.out.println(otab.getName()+"  \t  "+otab.getBatterySize()+"    \t"+otab.getOsType());
	}

}
