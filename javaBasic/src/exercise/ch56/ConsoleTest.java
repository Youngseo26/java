package exercise.ch56;

import java.io.IOException;

public class ConsoleTest {

	public static void main(String[] args) {
//		int i = 0;
//		
//		System.out.println("입력값: ");
//		try {
//			i = System.in.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(i);
//		System.out.println((char) i);
		
		int i = 0;
		
		System.out.println("입력값: ");
		try {
			StringBuilder sb = new StringBuilder();
			while((i = System.in.read()) != '\n') {
				sb.append((char) i);
			}
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
