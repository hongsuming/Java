
public class Ex08_5 {

	public static void main(String[] args) {
		
		int v1 = 123;
		char v2 = 'A';
		float v3 = 3.14F;
		boolean v4 = true;
		
		String x1 = Integer.toString(v1);
		String x2 = Character.toString(v2);
		String x3 = Float.toString(v3);
		String x4 = Boolean.toString(v4);
		String x5 = String.valueOf(v1);
		
		System.out.println(x1+"\t"+x2+"\t"+x3+"\t"+x4+"\t"+x5);

	}

}
