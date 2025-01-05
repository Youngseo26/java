package ch29;

public class Customer {
	//속성
	private long cashAmount;
	private String myFeeling;
	
	
	//행위
	
	public long getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(long cashAmount) {
		this.cashAmount = cashAmount;
	}

	public String getMyFeeling() {
		return myFeeling;
	}

	public void setMyFeeling(String myFeeling) {
		this.myFeeling = myFeeling;
	}

	public void askCoffee(Cashier cashier, String coffeeName) {
		System.out.println(coffeeName + " 얼마인가요?");
	}
	
	public long substractCash(long amount) {
		this.cashAmount -= amount;
		return amount;
	}
	public void orderCoffee(String coffeeName, boolean isWrapped) {
		System.out.println(coffeeName + "주문할게요" + isWrapped + "로 주세요.");
	}
	
	public void drinkCoffee(Coffee coffee) {
		String coffeeName = coffee.getCoffeeName();
		System.out.println(coffeeName + " 마셔요");
	}
	
	public void upgradeMyFeeling() {
		this.myFeeling = "햅삐~!";
	}
	
	public void showMyInfo() {
		System.out.printf("지금 나의 기분은 %s 하고, 현금은 %d 원이 남았습니다.", this.myFeeling, this.cashAmount);
	}
}