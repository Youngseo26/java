package exercise.ch51;

public class ThrowUncheckException {

	public static void main(String[] args) {
		System.out.println("Start Main Method");
		
//		int myInt = 0;
//		
//		try {
//			myInt = getIntElement(5);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		//System.out.println(myInt);
		int myData = 0;
		try {
			myData = getDivide(0);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(myData);
		System.out.println("End Main Method");

	}
	
	static int getIntElement(int index) throws Exception {
		int[] intArr = {1,2,3,4,5,6,7,8,9,10};
		
		if(index >= intArr.length) {
			throw new Exception("Index는 intArr의 길이를 넘을 수 없습니다.");
		}
		return intArr[index];
	}
	
	static int getDivide(int num) throws Exception {
		
		if(num == 0) {
			throw new Exception("0으로 나눌 수 없습니다.");
		}
		int data = 100 / num;
		return data;
	}

}
