package ch50;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTest3 {

	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("src/ch50/test.txt");
			
			int i;
			while((i = fs.read()) != -1) {
				System.out.write(i);
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("Can not found file");
			e.printStackTrace();
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
