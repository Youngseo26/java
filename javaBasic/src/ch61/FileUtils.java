package ch61;

import java.io.FileReader;
import java.io.IOException;

public class FileUtils {
	/**
	 * 
	 * @param fileName 읽을 파일 이름
	 * @return String 파일을 읽은 결과값
	 * @throws IOException 파일을 찾을 수 없는 경우 발생
	 */
	public static String readFile(String fileName) throws IOException{
		
		StringBuilder sb = new StringBuilder();
		try (FileReader fis = new FileReader("")) {
			int data;
			while((data = fis.read()) != -1) {
				sb.append((char) data);
			}
		}
		return sb.toString();
	}

}
