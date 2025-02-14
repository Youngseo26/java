package exercise.ch59;

public class JavaThreading {

	public static void main(String[] args) {
		// Thread 실행
		Thread thread = new Thread(new myRunnable());
		
		//익명 클래스
		Thread thread2 = new Thread(new myRunnable() {
			@Override
			public void run() {
				System.out.println("Thread " + Thread.currentThread().getName() + "실행 중");
			}
		});
		
		//람다식
		Thread thread3 = new Thread(() -> System.out.println("Thread " + Thread.currentThread().getName() + "실행 중"));

		System.out.println("Thread " + Thread.currentThread().getName() + "실행 중");

		thread.start();
		thread2.start();
		thread3.start();

		System.out.println("Thread " + Thread.currentThread().getName() + "실행 중");
	}

	static class myRunnable implements Runnable {

		@Override
		public void run() {
			System.out.println("Thread " + Thread.currentThread().getName() + "실행 중");
		}

	}

}
