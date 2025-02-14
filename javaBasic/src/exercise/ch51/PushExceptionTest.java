package exercise.ch51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PushExceptionTest {

	public static void main(String[] args) {
			printFile("src/exercise.ch50/test.txt");

	}

	static void printFile(String fileName)  {
		try {
			 FileInputStream fs = getFileStream(fileName);
			 
			 int i;
		   	 while((i = fs.read()) != -1){
				System.out.write(i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static FileInputStream getFileStream(String fileName) throws FileNotFoundException {
		FileInputStream fs = new FileInputStream(fileName);
		return fs;
	}

}
