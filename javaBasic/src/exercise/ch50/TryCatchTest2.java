package exercise.ch50;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {

	public static void main(String[] args) {

		System.out.println("Start Main Method");

		List<String> stringList = new ArrayList<>();

		stringList.add("Hello");
		stringList.add("World");
		stringList.add("I");
		stringList.add("Hate");
		stringList.add(null);
		stringList.add("You");

		for (int i = 0; i < stringList.size() + 5; i++) {
			try {
				String str = stringList.get(i);
				System.out.println(str.toUpperCase());
			} catch (NullPointerException e) {
				e.printStackTrace();
				System.out.println("Can not add Null");
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("Overflow");
				break;
			}
		}
		
		System.out.println("End Main Method");
	}

}
