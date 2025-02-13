package ch59;

public class MultiThreadinfExample {

	public static void main(String[] args) {
		// 1~100까지 출력, MultiThreading
		Thread thread1 = new Thread(new PrintRunnable(1, 33));
		Thread thread2 = new Thread(new PrintRunnable(34, 66));
		Thread thread3 = new Thread(new PrintRunnable(67, 100));
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
