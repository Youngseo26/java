package exercise.ch55;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOpsTest {

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
		
		//filter: 길이가 6이상인 과일만 출력
		fruitList.stream().filter((i) -> i.length() >=6).forEach((i) -> System.out.println(i));
		
		//distinct: 중복된 과일 제거
		List<String> fruit2 = fruitList.stream().distinct().collect(Collectors.toList());
		//System.out.println("변경 전: " + fruitList);
		//System.out.println("변경 후: " +fruit2);
		
		//map: 과일 이름을 대문자로 변환
		List<String> fruitMap = fruitList.stream().map((fruit) -> fruit.toUpperCase()).collect(Collectors.toList());
		System.out.println("변경 전: " + fruitList);
		System.out.println("변경 후: " + fruitMap);
		
		//map: 과일 이름을 과일이름길이로 변환
		List<Integer> fruitMap2 = fruitList.stream().map((fruit) -> fruit.length()).collect(Collectors.toList());
		System.out.println("변경 전: " + fruitList);
		System.out.println("변경 후: " + fruitMap2);
		
		//limit: 처음 3개의 과일만 선택
		List<String> fruitLmt = fruitList.stream().limit(3).collect(Collectors.toList());
		System.out.println(fruitLmt);
		
		//skip: 처음 3개의 과일을 제외한 나머지 과일 선택
		List<String> fruitSkip = fruitList.stream().skip(3).collect(Collectors.toList());
		System.out.println(fruitSkip);
		
		//sorted: 과일을 알파벳 순으로 정렬
		List<String> fruitSort = fruitList.stream().sorted().collect(Collectors.toList());
		System.out.println(fruitSort);
		
		//sorted: String 길이 짧은 순으로 정렬
		List<String> fruitSort2 = fruitList.stream().sorted((fruit1, fruit4) -> fruit1.length() - fruit4.length() ).collect(Collectors.toList());
		System.out.println(fruitSort2);
	}

}
