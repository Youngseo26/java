package ch34;

public class Test {

	public static void main(String[] args) {
		Customer customer1 = new Customer("영서");
		VipCustomer vipCustomer1 = new VipCustomer("연수");
		Customer customer2 = new Customer("영서");
		
		customer1.printMyInfo();
		System.out.println();
		vipCustomer1.printMyInfo();
		System.out.println();
		customer2.printMyInfo();
	}

}