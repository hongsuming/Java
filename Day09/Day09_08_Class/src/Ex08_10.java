import java.util.Random;

public class Ex08_10 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int num = ran.nextInt(100)+1;
		System.out.println("1부터 100 사이의 임의의 값 : "+num);
		
		float f = ran.nextFloat();
		System.out.println("0.0부터 1.0 사이의 임의의 값 : "+f);
		
		boolean b = ran.nextBoolean();
		System.out.println("임의의 논리값 : "+b);

	}

}
