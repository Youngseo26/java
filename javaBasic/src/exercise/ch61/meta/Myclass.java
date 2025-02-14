package exercise.ch61.meta;

public class Myclass {
	
	@Repeat(value = 3)
	public void printMessage() {
		System.out.println("Hello, World!");
	}
	
	@Repeat(value = 20)
	public void foo() {
		System.out.println("This is another method.");
	}

}
