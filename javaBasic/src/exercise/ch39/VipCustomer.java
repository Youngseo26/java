package exercise.ch39;

public class VipCustomer extends Customer {
	static int serialNum = 1;

	private String agentId;
	private double discountRatio;

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		VipCustomer.serialNum = serialNum;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomenName() {
		return customenName;
	}

	public void setCustomenName(String customenName) {
		this.customenName = customenName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusPointRatio() {
		return bonusPointRatio;
	}

	public void setBonusPointRatio(double bonusPointRatio) {
		this.bonusPointRatio = bonusPointRatio;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

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
	
	public void callAgent() {
		System.out.println("담당직원" + this.agentId + "분 불러주세요.\n");
	}

	public VipCustomer(String customenName) {
		this.customerId = "VIP" + serialNum++;
		this.customenName = customenName;
		this.customerGrade = "VIP";
		this.bonusPoint = 0;
		this.bonusPointRatio = 0.05;
		this.discountRatio = 0.1;
	}

	@Override
	public void printMyInfo() {
		System.out.println("VIP");
		super.printMyInfo();
	}

}