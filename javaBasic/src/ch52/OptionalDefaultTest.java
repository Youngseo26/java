package ch52;

import java.util.Optional;

public class OptionalDefaultTest {

	public static void main(String[] args) {
		String str = null;
		Optional<String> strOptional = Optional.ofNullable(str);
		
		int length = strOptional.orElseGet( () -> "" ).length();
		
		System.out.println(length);

	}

}
