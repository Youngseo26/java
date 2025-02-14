package exercise.ch29;

public class Barista {

	// 속성

	// 행위
	public void noticeOrder(String coffeeName) {
		System.out.printf("바리스타 : 커피 주문 확인했습니다.\n" + coffeeName);
	}

	public Coffee makeCoffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity) {
		Coffee coffee = new Coffee(coffeeName, waterQuantity, coffeeBeanQuantity);
		return coffee;
	}

	public void sayCoffeeReady(Coffee coffee) {
		String coffeeName = coffee.getCoffeeName();
		System.out.printf("주문하신 %s 나왔습니다. \n", coffeeName);
	}
}