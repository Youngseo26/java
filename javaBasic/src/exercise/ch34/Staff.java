package exercise.ch34;

public class Staff {

	//속성
	private int salesAmount;


	//향위
	public int getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
	}

	public int helpPayment(Customer customer, int price) {
		return customer.calculate(price);
	}
	
//	public int helpPayment(VipCustomer vipCustomer, int price) {
//		return vipCustomer.calculate(price);
//	}
	
	public void addSalesAmount(int cash) {
		salesAmount += cash;
	}
	
	public void printMySalesAmount() {
		System.out.println("오늘 최종 매출랙은 " + this.salesAmount + "원 입니다.");
	}
}