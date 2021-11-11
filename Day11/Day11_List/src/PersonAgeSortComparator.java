import java.util.Comparator;

public class PersonAgeSortComparator implements Comparator<Person>{
	
	public int compare(Person p1, Person p2) {
		int num=-1;
		if(p1.getAge()>p2.getAge()) {
			num=1; // 내림차순 : 0 / 오름차순 : -1
		}
		return num;
	}
}
