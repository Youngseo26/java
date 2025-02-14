package exercise.ch54;

import java.util.Optional;

public class OptionalLambdaTest {

	public static void main(String[] args) {
		String str = null;
		
		Optional<String> stringOptional = Optional.ofNullable(str);
		
		//Supplier<String> stringSupplier = () -> "default";
		String str2 = stringOptional.orElseGet(() -> "default").toUpperCase();
		
		System.out.println(str2);
	}

}
