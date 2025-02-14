package exercise.ch60.singleton;

import java.io.FileWriter;

public class FileWriterSingletonTest {

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			//FileWriterExample writer = new FileWriterExample("src/exercise.ch60/singleton/test.txt");
			FileWriterSingleton writer = FileWriterSingleton.getInstance();
			writer.writeToFile("Thread 1: Message 1");
			writer.writeToFile("Thread 1: Message 2");
		});
		
		Thread thread2 = new Thread(() -> {
			FileWriterSingleton writer = FileWriterSingleton.getInstance();
			writer.writeToFile("Thread 2: Message 3");
			writer.writeToFile("Thread 2: Message 4");
		});
		
		
		thread1.start();
		thread2.start();
		
	}

}
