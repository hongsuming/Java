import java.util.ArrayList;

public class ConvertList {
	
	public ArrayList<Integer> convertList(int[] array){
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=array.length-1; i>=0; i--) {
			a.add(array[i]);
		}
		return a;
	}
}
