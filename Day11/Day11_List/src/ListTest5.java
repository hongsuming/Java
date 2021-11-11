import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListTest5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(6);
		list.add(1);
		list.add(3);
		list.add(4);
		
		System.out.println("정렬 전 :"+list);
		
		Collections.sort(list);
		System.out.println("sort 정렬 후 :"+list);
		
		Collections.reverse(list);
		System.out.println("reverse 정렬 후 :"+list);
		
		ArrayList<Person> list2 = new ArrayList<Person>();
		list2.add(new Person("홍길동", 20, "서울"));
		list2.add(new Person("이순신", 44, "전라"));
		list2.add(new Person("강감찬", 33, "전라"));
		System.out.println("정렬 전:"+list2);
		
		Collections.sort(list2, new PersonAgeSortComparator());
		System.out.println("정렬 후:"+list2);
		
		// 1. foreach 사용 Person 객체 데이터 출력
		for (Person person : list2) {
			System.out.println("foreach:"+person.getName());
		}
		// 2. Iterator 사용 Person 객체 데이터 출력
		Iterator<Person> it = list2.iterator();
		while(it.hasNext()) {
			System.out.println("iterator:"+it.next().getName());
		}
		// 3. 일반 for문 사용 Person 객체 데이터 출력
		for(int i=0; i<list2.size(); i++) {
			System.out.println("일반 for:"+list2.get(i).getAddress());
		}

	}
}
