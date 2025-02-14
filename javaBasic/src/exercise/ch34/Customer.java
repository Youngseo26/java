package exercise.ch34;

public class Customer {
	static int serialNum = 1;

	protected String customerId;
	protected String customenName;
	protected String customerGrade;

	protected int bonusPoint;
	protected double bonusPointRatio;

	public int calculate(int price) {
		this.bonusPoint += price * bonusPointRatio;
		return price;
	}
	
	public Customer() {
	}

	Customer(String customenName) {
		this.customerId = "Customer" + serialNum++;
		this.customenName = customenName;
		this.customerGrade = "silver";
		this.bonusPointRatio = 0.01;
		this.bonusPoint = 0;
	}
	
	public void printMyInfo() {
		System.out.printf("customerId : %s\ncustomerName : %s\ncustomerGrade : %s\nbonusPoint : %d 입니다.\n",this.customerId, this.customenName, this.customerGrade, this.bonusPoint);
	}
	
	
	
	
	
	

}