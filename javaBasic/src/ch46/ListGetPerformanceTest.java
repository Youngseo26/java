package ch46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGetPerformanceTest {

	public static void main(String[] args) {
		
		 final int SIZE = 100000;
		
		//List 구현 ArrayList
		List<Integer> integerList1 = new ArrayList<>();
		
		for(int i = 0; i < SIZE; i++) {
			integerList1.add(i);
		}
		
		List<Integer> integerList2 = new LinkedList<>();
		for(int i = 0; i < SIZE; i++) {
			integerList2.add(i);
		}
		
		System.out.println(integerList1);
		System.out.println(integerList2);
		
		long startTime;
		long endTime;
		
		startTime = System.currentTimeMillis();
		for(int i =0; i < SIZE; i++) {
			integerList1.get(i);
		}
		endTime = System.currentTimeMillis();
		
		System.out.println("ArrayList : " + (endTime-startTime));
		
		startTime = System.currentTimeMillis();
		for(int i =0; i < SIZE; i++) {
			integerList2.get(i);
		}
		endTime = System.currentTimeMillis();
		
		System.out.println("LinkedList : " + (endTime-startTime));
		
		
		
	}

}
