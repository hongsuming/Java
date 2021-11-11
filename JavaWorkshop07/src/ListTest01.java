import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		
		int size = 10;
		MakeList mList = new MakeList();
		mList.makeArrayList(size);
		
//		ArrayList<Integer> list = null;
//		
//		list = mList.getList();
//		for(int i=0; i<list.size(); i++) {
//			System.out.print(list.get(i)+" ");
//		}
		
		for(int i=0; i<mList.list.size(); i++) {
			System.out.print(mList.list.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("평균 :"+mList.getAverage());
		

	}

}
