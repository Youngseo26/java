package exercise.ch39;

public class DepartmentSituation {

	public static void main(String[] args) {
		//전제 상황
		int price = 10000;
		Staff staff = new Staff();
		staff.setSalesAmount(1_000_000);
		
		Customer customer = new VipCustomer("댄공");
		//GoldCustomer goldCustomer = new GoldCustomer("비욘세");
		
		Customer[] customerQueue = {
				new Customer("영서"), new Customer("명곤"), new VipCustomer("누구"),
				customer, new Customer("희진"),customer,
				new Customer("유진"), customer, new VipCustomer("몰라"), new GoldCustomer("이솝"),
				new GoldCustomer("뻥이요"), new GoldCustomer("집 가고 싶어")
		};
		
		//시나리오
		for(Customer customers : customerQueue) {
			customers.printMyInfo();
		    int cash = staff.helpPayment(customers, price);
		    System.out.printf("내가 내는 금액은 %d원 입니다.\n", cash);
		    System.out.println();
		   // goldCustomer.pay(cash);
			staff.addSalesAmount(cash);
			//goldCustomer.printMyInfo();
		}
		
		staff.printMySalesAmount();
	}

}