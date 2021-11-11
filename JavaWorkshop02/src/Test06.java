
public class Test06 {

	public static void main(String[] args) {

		for (int a = 1; a <= 6; a++) {
			for (int b = 1; b <= 6; b++) {
				for (int c = 1; c <= 6; c++) {
					if ((a * b * c) % 3 == 0) {
						System.out.println(a + "*" + b + "*" + c + "=" + (a * b * c));
					}
				}
			}
		}

	}

}
