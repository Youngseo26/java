package ch54;

public class LambdaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleNum mn = new MultipleNum() {

			@Override
			public int calculate(int num) {
				return num * 1;
			}
		};
		
		StringNum sn = new StringNum() {

			@Override
			public void printString(String str, int num) {
				for(int i = 0; i < num; i++) {
					System.out.println("stringNum2: " + str);
				}
			}
			
		};

	}

}
