package exercise.ch56;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		String content = "파일 내용 입니다.";
		
		try(FileWriter fos = new FileWriter("src/exercise.ch56/fileWriter.txt")){  //, true 이어 쓰기
			fos.write(content);
			
			System.out.println("File Add!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
