import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatTest {

	public static void main(String[] args) throws ParseException {
		
		DecimalFormat df = new DecimalFormat("$###, ###, ###");
		String msg = df.format(987654321);
		System.out.println(msg);
		
		DecimalFormat df2 = new DecimalFormat("$###, ###");
		Number xx = df2.parse("$987, 654");
		System.out.println(xx);
		System.out.println(xx.intValue()-1);

	}

}
