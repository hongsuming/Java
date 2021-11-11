package cafe;

public class Cafe {
	
	Coffee[] coffeeList=new Coffee[10];
//	Coffee[] coffeeList;
	int index;
	
	
	public Cafe() {
		super();
		//coffeeList = new Coffee[10];
		//index=0; // 전역으로 사용할 배열 방 번호
	}


	public Coffee[] getCoffeeList() {
		return coffeeList;
	}


	public void setCoffeList(Coffee coffee) {
			if(index<10) { // 커피 객체를 배열에 저장하기 전 10개가 넘는지 검사
				coffeeList[index]=coffee; // 넘지 않을 경우 배열 방에 저장
				index+=1; // 다음 번 배열 방 번호 저장
			}else {
				System.out.println("정보 추가가 될 수 없습니다.");
			}
	}
	
	public int totalPrice() {
		int total=0;
		for(int i=0; i<index; i++) {
			total+=coffeeList[i].getPrice();
		}
		return total;
	}
	
	

}
