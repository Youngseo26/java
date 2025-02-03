package ch42;

public class GarbageCollectorTest {

	public static void main(String[] args) throws InterruptedException {
		
		Customer[] customers = new Customer[100];
		
		for(int i = 0; i< 100; i++) {
			Customer customer = new Customer("김영서");
			customers[i] = customer;
		}
		
		System.gc(); //아주 무거운 작업
		
		for(Customer customer: customers) {
			customer.printMyInfo();
		}
		
		while(true) {
			Thread.sleep(100);
		}
	}
	
	

}
