import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println("d="+d);
		System.out.println("d.toString=="+d.toString());
		Date d2 = new Date(2019, 06, 18);
		System.out.println("d2="+d2);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.toString());
		System.out.println("년도:"+c.get(Calendar.YEAR));
		int month = c.get(Calendar.MONTH)+1;
		System.out.println("월:"+month);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("일:"+day);
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int seconds = c.get(Calendar.SECOND);
		System.out.println(hour+"\t"+minute+"\t"+seconds);
			
		// 명시적으로 새로운 날짜 설정
		c.set(2019, 10, 18);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		// Calendar -> Date
		Date xxx = c.getTime();
		System.out.println(xxx);
		
		long yyyy = c.getTimeInMillis();
		System.out.println(yyyy);
		
		long yyyy2 = System.currentTimeMillis();
		System.out.println(yyyy2);
		
		

	}

}
