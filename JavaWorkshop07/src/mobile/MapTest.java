package mobile;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		HashMap<String, Mobile> map = new HashMap<String, Mobile>();
		map.put("LU6800", new Mobile("LU6800", "Optimus 2X", 800000.0));
		map.put("SU6600", new Mobile("SU6600", "Optimus Black", 900000.0));
		map.put("KU5700", new Mobile("KU5700", "Optimus Big", 700000.0));
		map.put("SU7600", new Mobile("SU7600", "Optimus Mach", 950000.0));

		double sum=0.0;
		for (String key : map.keySet()) {
			Mobile m = map.get(key);
			System.out.println(m.printInfo());
			sum+=m.getPrice();
		}
		System.out.println("합계:"+sum);

		// 전체 모바일 가격의 10% 상승
		for (String key : map.keySet()) {
			Mobile m = map.get(key);
			m.setPrice(m.getPrice()+(m.getPrice()*10));
		}
		
		System.out.println("가격 변경 후");
		for (String key : map.keySet()) {
			Mobile m = map.get(key);
			System.out.println(m.printInfo());
			sum+=m.getPrice();
		}
		System.out.println("합계:"+sum);
		
	}
}
