package ch29;

public class Cashier {

	// 속성
	private long salesAmount;
	
	

	public long getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(long salesAmount) {
		this.salesAmount = salesAmount;
	}

	public long checkCoffeePrice(String coffeeName) {
		long price;

		switch (coffeeName) {
		case "아메리카노":
			price = 5000;
			break;
		case "카페라떼":
			price = 6000;
			break;
		case "카페모카":
			price = 6500;
			break;
		case "카푸치노":
			price = 6500;
			break;
		default:
			price = 0;
			break;
		}

		return price;
	}

	public void replyCoffeePrice(String coffeeName, long price) {
		if (price == 0) {
			System.out.printf("죄송합니다. 손님 %s 메뉴는 없습니다.", coffeeName);
		}
		System.out.printf("%s의 가격은 %d 원 입니다.", coffeeName, price);
	}

	public void addAmount(long money) {
		this.salesAmount += money;
	}

	public void sayOrder(String coffeeName) {
		System.out.println(coffeeName + "주문 들어왔습니다.");
	}

	public Coffee wrappedCoffee(Coffee coffee) {
		coffee.beWrappedUp();
		return coffee;
	}

	public void sayCoffeeReady(Coffee coffee) {
		String coffeeName = coffee.getCoffeeName();
		System.out.println("캐셔: 주문하신" + coffeeName + " 나왔습니다.");
	}
}