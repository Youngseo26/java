package exercise.ch55;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTerminalOpsTest {

	public static void main(String[] args) {
		
		List<String> fruitList = new ArrayList<>();
		fruitList.add("Apple");
		fruitList.add("Apple");
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Orange");
		fruitList.add("Mango");
		fruitList.add("Grapes");
		fruitList.add("Watemelon");
		fruitList.add("PineApple");
		fruitList.add("Strawberry");
		
		//1. forEach():출력
		fruitList.stream().forEach((i) -> System.out.println(i.toUpperCase()));
		
		//2.collect(): 다른 또는 같은 컬렉션 반환
		Set<String> fruitSet = fruitList.stream().collect(Collectors.toSet());
		System.out.println(fruitSet);
		
		//3.findFirst(): Stream의 첫번째 값 산출, Optional
		Optional<String> fruitOps = fruitList.stream().findFirst();
		System.out.println(fruitOps.orElseGet(() -> "default fruit"));
		
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(5);

		
		//4.sun, average
		System.out.println("sum: " + integerList.stream().mapToInt((i) -> i).sum());
		System.out.println("average: " + integerList.stream().mapToInt((i) -> i).average());
		
		//5. count(), max(), min()
		System.out.println(integerList.stream().count());
		System.out.println(integerList.stream().mapToInt((i) -> i).max());
		System.out.println(integerList.stream().mapToInt((i) -> i).min());
		
		//6.reduce()로 소모값 구하기
		int result = integerList.stream().reduce(0,(int1, int2) -> int1 - int2 );
		System.out.println(result);
	}

}
