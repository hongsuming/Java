import java.util.ArrayList;

public class MakeList {
	public ArrayList<Integer> list;

	public MakeList() {
		list = new ArrayList<Integer>();
	}
	
	public void makeArrayList(int size) {
		for(int i=0; i<size; i++) {
			list.add((int)(Math.random()*10)+10);
		}
	}
	
	public double getAverage() {
		double avg=0.0;
		for(int i=0; i<list.size(); i++) {
			avg+=(double)list.get(i).intValue();
		}
		avg=avg/list.size();
		return avg;
	}
	public ArrayList<Integer> getList() {
		return list;
	}
	

}
