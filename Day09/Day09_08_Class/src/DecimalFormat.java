import java.text.NumberFormat;

public class DecimalFormat {

	public static void main(String[] args) {
		
		System.out.println(Long.MAX_VALUE);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // 현재 지역 화폐 양식
		String msg = nf.format(987654321);
		System.out.println(msg);

	}

}
