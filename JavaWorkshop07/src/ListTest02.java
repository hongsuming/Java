import java.util.ArrayList;
import java.util.Iterator;

public class ListTest02 {

	public static void main(String[] args) {
		
		int array[] = {3, 4, 2, 5, 2, 3, 6, 7, 5, 7, 9};
		ConvertList conList = new ConvertList();
		
		ArrayList<Integer> list = conList.convertList(array);

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator<Integer> it = list.iterator();
		for (Integer itList : list) {
			System.out.println("iterator:"+itList);
		}

	}
}
