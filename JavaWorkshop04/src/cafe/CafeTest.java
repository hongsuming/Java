package cafe;

public class CafeTest {

	public static void main(String[] args) {
		
		Cafe cafe = new Cafe(); // 배열 10개 방이 생성 됨
		cafe.setCoffeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeList(new Coffee("라떼", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeList(new Coffee("라떼", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeList(new Coffee("라떼", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000)); // 11번째 -> 정보 추가가 될 수 없습니다. 출력
		
		Coffee[] arr= cafe.getCoffeeList();
		
		//int sum=0;
		for (Coffee coffee : arr) {
			System.out.println(coffee);
			//sum+=coffee.getPrice();
		}
		
		//System.out.println("커피 가격의 합 : "+sum);
		System.out.println("커피 가격의 합 : "+cafe.totalPrice());

		
		
		
		

	}

}
