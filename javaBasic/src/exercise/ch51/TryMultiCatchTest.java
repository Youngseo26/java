package exercise.ch51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {

	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("src/exercise.ch50/test.txt");
			
			int i = 0;
			int data = 100 / i;
			
			String str = "abc";
			System.out.println(str.toUpperCase());
			
			int index = 5;
			int[] intArr = new int[10];
			System.out.println(intArr[index]);
			
			
		} catch(FileNotFoundException e){
			System.out.println("File Not Found");
			e.printStackTrace();
		} 
		catch(ArithmeticException | NullPointerException e) {
			System.out.println("ArithmeticException or NullPointerException!");
			e.printStackTrace();
		} catch(Exception e) { // 맨 처음 catch문에 하면 다음 catch문 빨간줄뜬다.
			System.out.println("Final Exception Filter");
			e.printStackTrace();
		}
//		catch(NullPointerException e) {
//			System.out.println("NullPointerException!");
//			e.printStackTrace();
//		}
		System.out.println("End Main Method");
	}

}
