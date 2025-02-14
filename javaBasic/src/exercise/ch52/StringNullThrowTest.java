package exercise.ch52;

public class StringNullThrowTest {

	public static void main(String[] args) {
		try {
			String str = "str";
			System.out.println(str.length());
		} catch (NullPointerException e) {
			throw new CustomException("CustomException!");
		}

	}

}
class CustomException extends RuntimeException {
	public CustomException (String message) {
		super(message);
	}
}