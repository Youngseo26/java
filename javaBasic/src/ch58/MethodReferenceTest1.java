package ch58;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest1 {

	public static void main(String[] args) {
		
		//static method
		Consumer<String> ex1 = Printer::printSomething;
		Consumer<String> ex2 = (str) -> Printer.printSomething(str); //람다
		
		ex1.accept("Use MethodReference");
		ex2.accept("Use Lambda");
		
		//생성자 호출
		Supplier<Customer> ex3 = () -> new Customer();
		Supplier<Customer> ex4 = Customer::new;
		
		System.out.println(ex3.get());
		System.out.println(ex4.get());
		
		Function<String, Customer> ex5 = (str) -> new Customer(str);
		Function<String, Customer> ex6 = Customer::new;
		
		System.out.println(ex5.apply("사람"));
		System.out.println(ex6.apply("사람2"));
		
	}

}
