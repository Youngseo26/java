package exercise.ch40;

public class GoldCustomer extends Customer {
	
	private double discountRatio;
	//private int amount;

	public double getDiscountRatio() {
		return discountRatio;
	}

	public void setDiscountRatio(double discountRatio) {
		this.discountRatio = discountRatio;
	}
	
	@Override
	public int calculate(int price) {
		this.bonusPoint += price * bonusPointRatio;
		price -= price * discountRatio;
		return price;
	}
	
//	public int pay(int price) {
//		amount -= price;
//		return amount;
//	}

	public GoldCustomer(String customerName) {
		super();
		this.customerId = "CUSTOMER" + Customer.serialNum++;
		this.customenName = customerName;
		this.customerGrade = "GOLD";
		this.bonusPoint = 0;
		this.bonusPointRatio = 0.03;
		this.discountRatio = 0.03;
		//this.amount = 1200000;
	}
	
	@Override
	public void printMyInfo() {
		System.out.println("Gold");
		super.printMyInfo();
		//System.out.println("잔액은 " + amount + "원 입니다.");
	}
	
	
	

}