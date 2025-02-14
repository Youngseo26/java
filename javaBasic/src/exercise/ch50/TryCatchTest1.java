package exercise.ch50;

public class TryCatchTest1 {

	public static void main(String[] args) {
		System.out.println("Start Main Method");

		try {
			int i = 10;
			int data = 50 / i;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println("Cannot be divided by 0.");
			System.out.println("data: " + 0);
			e.printStackTrace();
		}

		System.out.println("End Main Method");

	}

}
