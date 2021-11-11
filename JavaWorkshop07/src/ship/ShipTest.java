package ship;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		
		ArrayList<Ship> list = new ArrayList<Ship>();
		list.add(new Boat("Boat01", 500));
		list.add(new Cruise("Cruise01", 1000));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		for(int i=0; i<list.size(); i++) {
//			Ship ship = list.get(i);
			if(list.get(i) instanceof Boat) {
				list.get(i).sail(10);
			}else {
				list.get(i).sail(15);
			}
			System.out.println(list.get(i));
		}
		
		for(int i=0; i<list.size(); i++) {
//			Ship ship = list.get(i);
			if(list.get(i) instanceof Boat) {
				list.get(i).refuel(20);
			}else {
				list.get(i).refuel(30);
			}
			System.out.println(list.get(i));
		}
	}

}
