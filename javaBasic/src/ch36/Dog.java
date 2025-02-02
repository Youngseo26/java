package ch36;

public class Dog extends Animal{

	@Override
	public void eat(String food) {
		System.out.println("멍멍이는 " + food + "을/를 이빨로 물어먹습니다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("멍멍이는 잠을 잡니다.");
	}

}
