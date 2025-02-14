package exercise.ch29;



public class CafeSituation {

	public static void main(String[] args) {
		//인스턴스화
		Customer customer1 = new Customer();
		Cashier cashier = new Cashier();
		Barista barista = new Barista();
		
		customer1.setCashAmount(50000);
		cashier.setSalesAmount(1000000);
		
		//로직 시작
		String coffeeName = "카푸치노";
		boolean isTakeOut = true;
		customer1.askCoffee(cashier, coffeeName);
		
		long price = cashier.checkCoffeePrice(coffeeName);
		cashier.replyCoffeePrice(coffeeName,price );
		
		long cash = customer1.substractCash(price);
		customer1.orderCoffee(coffeeName, isTakeOut);
		
		cashier.addAmount(cash);
		cashier.sayOrder(coffeeName);
		
		barista.noticeOrder(coffeeName);
		Coffee coffee = barista.makeCoffee(coffeeName, 500, 30);
		barista.sayCoffeeReady(coffee);
		
		Coffee coffeeCompleted = cashier.wrappedCoffee(coffee);
		cashier.sayCoffeeReady(coffeeCompleted);
		
		customer1.drinkCoffee(coffeeCompleted);
		if(coffeeCompleted.getCoffeeName() == coffeeName && coffeeCompleted.isWrapped() == isTakeOut) {
			customer1.upgradeMyFeeling();
		} 
			customer1.showMyInfo();
		
	}

}