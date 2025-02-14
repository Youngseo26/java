package exercise.ch52;

public class StringNullDefault {

	public static void main(String[] args) {
		String str = "abc";
		try {
			int length = str.length();
			System.out.println(length);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException!");
			str = "";
			int length = str.length();
			System.out.println(length);
		}
		
	}

}
