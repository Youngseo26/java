package exercise.ch54;

public class LambdaTest1 {

	public static void main(String[] args) {
		
		MultipleNum mn1 = (x) -> x * 1;
		MultipleNum mn2 = (x) -> x * 2;
		MultipleNum mn3 = (x) -> {return x * 3;};
		MultipleNum mn4 = (int myInt) -> {return myInt *  4;};
		
		System.out.println(mn1.calculate(5));
		System.out.println(mn2.calculate(5));
		System.out.println(mn3.calculate(5));
		System.out.println(mn4.calculate(5));
		
		StringNum sn1 = (x, y) -> System.out.println("stringNum1: " + x);
		StringNum sn2 = (x, y) -> {
			for(int i = 0; i < y; i++) {
				System.out.println("stringNum2: " +x);
			}
		};
		StringNum sn3 = (x, y) ->{
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < y; i++) {
				sb.append(x);
			}
			System.out.println("stringNum3: " +sb.toString());
		};
		
		sn1.printString("Hello ", 5);
		sn2.printString("Hello ", 5);
		sn3.printString("Hello ", 5);
		
	}
}
