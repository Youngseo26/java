package ch47;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {

	public static void main(String[] args) {
		// Set 구현
		Set<String> fruitSet = new HashSet<>();
		
		//add
		fruitSet.add("Orange");
		fruitSet.add("Apple");
		fruitSet.add("Mango");
		fruitSet.add("Grape");
		
		System.out.println(fruitSet); //순서 노 상관
		
		//중복 add 안된다.
		fruitSet.add("Apple");
		System.out.println(fruitSet);
		fruitSet.add("Kiwi");
		System.out.println(fruitSet);
		
		//remove
		fruitSet.remove("Apple");
		System.out.println(fruitSet);
		
		//contains
		System.out.println(fruitSet.contains("Apple"));
		System.out.println(fruitSet.contains("Mango"));
		
		//size isEmpty, clear
		System.out.println("set sze: " + fruitSet.size());
		System.out.println("Is set Empty?? " + fruitSet.isEmpty());
		fruitSet.clear();
		System.out.println("Is set Empty?? " + fruitSet.isEmpty());
		
		
	}

}
