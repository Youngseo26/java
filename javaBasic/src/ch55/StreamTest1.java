package ch55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		// Stream.of, Arrays.Stream Collection(=List) -> Stream
		
		Stream<String> fruits = Stream.of("Apple", "Banana", "Orange");
		Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
		
		//Array.Stream
		Stream<String> fruit2 = Arrays.stream(new String[] {"Apple", "Banana", "Orange"});
		Stream<Integer> integerStream2 = 	Arrays.stream(new Integer[] {1,2,3,4,5,6,7,8,9,10});
		
		//Collection
		List<String> fruitList = new ArrayList<>();
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Orange");
		fruitList.add("Mango");
		fruitList.add("Kiwi");
		
		Stream<String> fruit3 = fruitList.stream();
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(5);
		integerList.add(6);
		integerList.add(7);
		integerList.add(8);
		integerList.add(9);
		integerList.add(10);
		
		Stream<Integer> integer = integerList.stream();
		
		//Stream으로 for loop
		for(String fruit: fruitList) {
			System.out.println(fruit.toUpperCase());
		}
		
		//Stream
		fruit3.forEach((fruit) -> System.out.println(fruit.toUpperCase()));
		
		for(Integer integer3: integerList) {
			if(integer3 % 2 == 0) System.out.println(integer3);
			else continue;
		}
		
		integer.filter((i) -> i % 2 == 0).filter((i) -> i >4).forEach(i -> System.out.println(i));
		
		//integer.forEach(i -> System.out.println(i)); // java.lang.IllegalStateException: stream has already been operated upon or closed
		//Stream은 한번 사용하면 못쓴다. 근데 Stream만들때 쓴 List는 사용가능

	}

}
