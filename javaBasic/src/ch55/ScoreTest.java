package ch55;

import java.util.ArrayList;
import java.util.List;

public class ScoreTest {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("영서", "여자", 95));
		students.add(new Student("명곤", "남자", 98));
		students.add(new Student("지희", "여자", 91));
		students.add(new Student("희진", "남자", 92));
		students.add(new Student("두부", "남자", 72));
		students.add(new Student("윤석", "남자", 62));
		students.add(new Student("경서", "남자", 83));
		students.add(new Student("오리", "남자", 29));
		
		
		//1. 90점 넘은 학생의 이름 출력
		students.stream().filter((student) -> student.getScore() > 90).map((student) -> student.getName()).forEach((name) -> System.out.println(name));
		
		//2. 중위값 구하기
		//System.out.println(students.stream().map((student) -> student.getScore()).mapToInt(i -> i).average()); 이건 평균 구하기~
		long size = students.stream().count();
		
		int medium = students.stream().map((student) -> student.getScore()).sorted().skip(size / 2).findFirst().orElseGet(() -> 0);
		System.out.println(medium);
	}

}
