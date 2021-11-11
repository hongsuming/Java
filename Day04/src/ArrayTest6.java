import java.util.Arrays;
import java.util.Date;

public class ArrayTest6 {

	public static void main(String[] args) {
		Date d= new Date();

		int[] num2 = { 10, 20, 30, 40, 50 };

		// 배열관련 유틸리티 클래스
		String[] kkk = { "xMan", "Alex", "XMan", "Bob", "Curl" };
		for (int i = 0; i < kkk.length; i++) {
			String name = kkk[i];
			if (name.equals("Curl")) {
				System.out.println(i);
			}
		}

		// 5.검색
		Arrays.sort(kkk);// sort후 검색
		for (String s : kkk) {
			System.out.print(s);
		}
		System.out.println();
		int idx = Arrays.binarySearch(kkk, "Curl");
		System.out.println("idx===" + idx);

		int[] xyz = { 9, 4, 3, 12, 55, 63, 2, 3, 190 };
		Arrays.sort(xyz);
		for (int i : xyz) {
			System.out.println("***" + i);
		}

		// 3. 값비교
		int[] a = { 10, 20 };
		int[] b = { 10, 20 };

		System.out.println(a == b);// f
		System.out.println(Arrays.equals(a, b));// true
		// 2. 채워넣기
		Arrays.fill(num2, 100);
		for (int i : num2) {
			System.out.println("###" + i);
		}
			// 1. 배열복사
			int[] xxx = Arrays.copyOf(num2, num2.length);
			for (int s : xxx) {
				System.out.println(s);
			}
			System.out.println(xxx + "\t" + num2);

			int[] xxx2 = Arrays.copyOf(num2, 5);
			for (int m : xxx2) {
				System.out.println(">>>" + m);
			}
		}
}

