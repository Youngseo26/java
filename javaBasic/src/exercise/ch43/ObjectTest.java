package exercise.ch43;

public class ObjectTest {

	public static void main(String[] args) {
		//toString()Test
		Customer customer = new Customer("영서");
		GoldCustomer customer2 = new GoldCustomer("명곤");
		Staff staff = new Staff();
		VipCustomer vip = new VipCustomer("리스테린");
		// Object로 업캐스팅도 되겠넹???
		//Object customer = new Customer("영서"); // 됩니둥
		System.out.println(customer.toString());
		System.out.println(customer2.toString());
		System.out.println(staff);
		System.out.println(vip);
	}

}
