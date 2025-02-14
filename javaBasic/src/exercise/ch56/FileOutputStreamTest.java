package exercise.ch56;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		String content = "This is Content of File2";
		
		try(FileOutputStream fos = new FileOutputStream("src/exercise.ch56/output.txt", true)){  //, true 이어 쓰기
			byte[] bytes = content.getBytes();
			fos.write(bytes);
			
			System.out.println("File Add!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
