package exercise.ch46;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {

	public static void main(String[] args) {
		//List 정의
		List<String> fruitList = new ArrayList<String>();
		
		//add
		fruitList.add("Orange");
		fruitList.add("Apple");
		fruitList.add("Cherry");
		fruitList.add("Kiwi");
		
		System.out.println(fruitList);
		
		//add(index, element)
		fruitList.add(3, "Mango");
		
		System.out.println(fruitList);
		
		
		//remove(index)
		fruitList.remove(3);
		System.out.println(fruitList);
		
		//get(index)
		String myFruit = fruitList.get(3);
		System.out.println(myFruit);
		
		//set(index, element)
		fruitList.set(1, "PineApple");
		System.out.println(fruitList);
		
		//size
		System.out.println(fruitList.size());
		
		//isEmpty : 현재 리스트가 비어있는지
		List<String> fruitList2 = new ArrayList<>();
		System.out.println(fruitList2.isEmpty());
		System.out.println(fruitList.isEmpty());
		
		//contains: 리스트에 해당 원소가 있는지 없는지 확인하는 메소드
		System.out.println(fruitList.contains("Kiwi"));
		System.out.println(fruitList.contains("Apple"));
		
		//indexOf, clear
		String myFruit2 = "Orange";
		System.out.println(fruitList.indexOf(myFruit2));
		String myFruit3 = "Apple";
		System.out.println(fruitList.indexOf(myFruit3));
		
		fruitList.clear();
		System.out.println(fruitList);
	}

}
