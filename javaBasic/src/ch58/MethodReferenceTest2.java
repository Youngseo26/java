package ch58;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceTest2 {

	public static void main(String[] args) {
		// Instance 메소드 참조
		Customer customer1 = new Customer("사람");
		Customer customer2 = new Customer("사람2");
		
		Supplier<String> ex1 = customer1::toString;
		Supplier<String> ex2 = customer2::toString;
		
		System.out.println(ex1.get());
		System.out.println(ex2.get());

		// 임의 객체 메소드 호출
		List<Customer> customerList = Arrays.asList(new Customer("person1"), new Customer("person2"),
				new Customer("person3"), new Customer("person4"));
		
		customerList.forEach(Customer::printMyInfo);
	}

}
