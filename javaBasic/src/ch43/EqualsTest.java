package ch43;

public class EqualsTest {

	public static void main(String[] args) {
		Customer customer1 = new Customer("ID1", "영서");
		Customer customer2 = customer1;
		
		Customer customer3 = new Customer("ID1", "영서");
		Customer customer4 = new Customer("ID2", "서영");
		
		System.out.println(customer1);
		System.out.println(customer3);
		
		System.out.println(customer1.equals(customer2));
		System.out.println(customer1.equals(customer3)); //equals() 만들기 전에는 false 생성 후 true
		System.out.println(customer1.equals(customer4));
	}

}
