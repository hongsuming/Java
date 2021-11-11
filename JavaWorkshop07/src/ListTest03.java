import java.util.ArrayList;

public class ListTest03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			list1.add((int)(Math.random()*10));
			list2.add((int)(Math.random()*10));
		}
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		
		
		for(int i=0; i<10; i++) {
			int list1V = list1.get(i);
			int list2V = list2.get(i);
			
			try {
				System.out.print(list1V+"/"+list2V+"=");
				System.out.println(list1V/list2V);
			} catch (Exception e) {
				System.out.println("분모가 0입니다.");
			}
		}
		
	}
}
