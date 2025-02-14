package exercise.ch52;

import java.util.Arrays;

public class DayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Day monday = Day.MONDAY;
//		
//		System.out.println(monday);
//		System.out.println(monday.getKoreanName());
		
		
//		Day day = Day.WEDNESDAY;
//		
//		switch(day) {
//		case MONDAY:
//			System.out.println("한 주의 시작입니다. " + day.getKoreanName());
//			break;
//		case TUESDAY:
//		case WEDNESDAY:
//		case THURSDAY:
//			System.out.println("어후 일하기 싫어 "+ day.getKoreanName());
//			break;
//		case FRIDAY:
//			System.out.println("오늘만 지나면 주말이야 " + day.getKoreanName());
//			break;
//		case SATURDAY:
//		case SUNDAY:
//			System.out.println("야호 주말이야 " + day.getKoreanName());
//			break;
//		}

		
		//각각 enum값 정의
		//ordianl, compareTo, values
		
		Day monday = Day.MONDAY;
		Day tuesday = Day.TUESDAY;
		Day wednesday = Day.WEDNESDAY;
		Day thursday = Day.THURSDAY;
		Day friday = Day.FRIDAY;
		Day saturday = Day.SATURDAY;
		Day sunday = Day.SUNDAY;
		
		System.out.println("ordinal: " + monday.ordinal());
		System.out.println("ordinal: " + sunday.ordinal());
		System.out.println("ordinal: " + thursday.ordinal());
		
		System.out.println("CompareTo: " + monday.compareTo(sunday));
		System.out.println("CompareTo: " + monday.compareTo(thursday));
		
		Day[] days = Day.values();
		System.out.println("Days: " + Arrays.toString(days));
		
		
	}

}
