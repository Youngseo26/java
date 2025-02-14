package exercise.ch56;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		int i = 0;
		
		System.out.println("입력값: ");
		try {
			StringBuilder sb = new StringBuilder();
			while((i = System.in.read()) != '\n') {
				sb.append((char) i);
			}
			System.out.println("InputStream  적용 전 : " + sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int j = 0;
		
		System.out.println("입력값: ");
		StringBuilder sb2 = new StringBuilder();
		try (InputStreamReader isr = new InputStreamReader(System.in)){
			while((j = isr.read()) != '\n') {
				sb2.append((char) j);
			}
			System.out.println("InputStream  적용 후 : " +sb2.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}