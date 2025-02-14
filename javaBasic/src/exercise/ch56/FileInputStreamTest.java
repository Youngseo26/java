package exercise.ch56;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		// FileInputStream
		try(FileInputStream fis = new FileInputStream("src/exercise.ch56/test.txt")) { //test._kr.txt파일 인코딩 안되어서 출력됨 -> FileReaderTest.java로
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
