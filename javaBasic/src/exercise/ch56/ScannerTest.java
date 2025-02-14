package exercise.ch56;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// scanner로 이름 직업 나이 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		System.out.println("직업: ");
		String job = sc.nextLine();
		
		System.out.println("나이: ");
		int age = sc.nextInt();
		
		System.out.printf("이름: %s, 직업: %s, 나이: %d", name, job, age);
		

	}

}
