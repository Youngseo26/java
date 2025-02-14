package exercise.ch51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyCloseTest {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Start Main Method");

		try(FileInputStream fs = new FileInputStream("src/exercise.ch50/test.txt");) {

			int i;
			while ((i = fs.read()) != -1) {
				System.out.write(i);
			}
			
			int myInt = 0;
			int data = 100 / myInt;
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Can not found file");
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("myInt cannot be 0");
		}
		
		System.out.println("End Main Method");
		
		while(true) {
			Thread.sleep(1000);
		}

	}

}
