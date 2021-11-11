import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat dd = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String m = dd.format(d);
		System.out.println(m);
		
		SimpleDateFormat dd2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date d2 = dd2.parse("2020년 10월 16일");
		System.out.println(d2);
		

	}

}
