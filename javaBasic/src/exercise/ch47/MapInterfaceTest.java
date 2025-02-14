package exercise.ch47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {

	public static void main(String[] args) {
		//Map 정의
		Map<String, Integer> fruitMap = new HashMap<>();
		
		//Map에 데이터 넣음
		fruitMap.put("Orange", 5);
		fruitMap.put("Apple", 10);
		fruitMap.put("Banana", 3);
		fruitMap.put("Kiwi", 20);
		
		System.out.println(fruitMap ); //순서 상관 없
		
		//get(key) 주어진 키에 대응하는 값을 return, 키 존재하지않을 경우 null
		Integer appleCount = fruitMap.get("Apple");
		Integer bananaCount = fruitMap.get("Banana");
		
		System.out.println("사과 " + appleCount +"개");
		System.out.println("바나나 " + bananaCount +"개");
		
		//contains(key) map 안에 존재 유무 확인 있으면 true 없으면 false
		Boolean isApple = fruitMap.containsKey("Apple");
		Boolean isMango = fruitMap.containsKey("Mango");
		
		System.out.println(isApple);
		System.out.println(isMango);
		
		//remove
		fruitMap.remove("Apple");
		System.out.println(fruitMap );
		
		//size
		System.out.println(fruitMap.size());
		
		//keySet
		System.out.println(fruitMap.keySet());
		
	}

}
