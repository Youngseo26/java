package ch55;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		//List
		List<TravelCustomer> customers = new ArrayList<>();
		customers.add(new TravelCustomer("영서", 29,  200000));
		customers.add(new TravelCustomer("명곤", 29,  250000));
		customers.add(new TravelCustomer("지희", 30,  300000));
		customers.add(new TravelCustomer("희진", 30,  350000));
		customers.add(new TravelCustomer("두부", 5,  20000));
		
		
		//1. 고객 명단 추가된 순서로 출력
		customers.stream().map((customer) -> customer.getName()).forEach((name) -> System.out.println(name));
		
		//2. 총 고객들의 여행 비용 계산
		long total = customers.stream().map((customer) -> customer.getPrice()).mapToInt(i -> i).sum();
		System.out.println(total);
		
	}

}
