package exercise.ch60.singleton;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	private String fileName;

	public FileWriterExample(String fileName) {
		this.fileName = fileName;
	}

	public void writeToFile(String message) {
		try {
			FileWriter fileWriter = new FileWriter(fileName, true);
			fileWriter.write(message + "\n");
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
