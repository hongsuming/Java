
public class EnumTest3 {
	
	public enum Color {BLUE, RED, YELLOW}
	
	public static void main(String[] args) {
		
		Color c = Color.BLUE;
		Color c2 = Color.RED;
		Color c3 = Color.YELLOW;
		System.out.println(c.ordinal());
		
		Color colors[] = Color.values();
		for (Color color : colors) {
//			System.out.println(color);
			System.out.println(color.name()+"\t"+color.ordinal());
		}


	}

}
