package exercise.ch58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("C001", "사람"));
		customers.add(new Customer("C002", "사람2"));
		customers.add(new Customer("C003", "사람3"));
		customers.add(new Customer("C004", "사람4"));
		
		//StringUtils의 isLongName static 메소드를 이용하여 긴 이름의 손님들 이름 출력
		
		customers.stream().map((customer )-> customer.customenName).filter(StringUtils::isLongName).forEach(System.out::println);
		
		List<String> customerNames = Arrays.asList(
				"영서",
				"명곤",
				"지희",
				"희진");
		
		//손님들 이름 가지고 새로운 Customer List 만들기
		List<Customer> customerList = customerNames.stream().map(Customer::new).collect(Collectors.toList());
				
		System.out.println(customerList);

	}

}
