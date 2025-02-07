package ch51;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		System.out.println("Start Main Method");
		try {
			Integer myInt = 14;
			Integer data = 100/ myInt;
			
			if(myInt == 14) return;
			
			System.out.println("data: " + data);
		} catch (ArithmeticException e) {
			System.out.println("MyInt cannot be 0");
			e.printStackTrace();
		} finally {
			System.out.println("Must Execute Finally part");
		}
		System.out.println("End Main Method");

	}

}
