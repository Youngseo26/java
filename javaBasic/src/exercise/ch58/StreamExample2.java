package exercise.ch58;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {

	public static void main(String[] args) {

		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("C001", "사람"));
		customers.add(new Customer("C002", "사람2"));
		customers.add(new Customer("C002", "사람2"));
		customers.add(new Customer("C001", "사람"));
		customers.add(new Customer("C003", "사람3"));
		customers.add(new Customer("C001", "사람"));
		customers.add(new Customer("C004", "사람4"));
		
		Customer myCustomer = new Customer("C001", "사람");
		
		//myCustomer와 동일한 객체는 몇개
		long count = customers.stream().filter((customer) -> customer.equals(myCustomer)).count(); //람다
		System.out.println(count);
		long count2 = customers.stream().filter(myCustomer::equals).count(); //메소드레퍼런스
		System.out.println(count2);
		
		//customers의 각각의 bonusPoint를 얻어라
		List<Integer> bonusPoint = customers.stream().map((customer) -> customer.getBonusPoint()).collect(Collectors.toList());
		System.out.println(bonusPoint);
		List<Integer> bonusPoint2 = customers.stream().map(Customer::getBonusPoint).collect(Collectors.toList());
		System.out.println(bonusPoint2);

	}

}
