package ch59;

public class PrintRunnable implements Runnable{
	
	int start;
	int end;
	
	

	public PrintRunnable(int start, int end) {
		this.start = start;
		this.end = end;
	}


	@Override
	public void run() {
		for(int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
	}
	

}
