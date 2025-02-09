package ch54;

public class LambdaUseTest {

	public static void main(String[] args) {
		MultipleNum mn = (num) -> num * 10;
		//printNum(mn);
		//printNum((x) ->x * 100);
		
		GenericLambda<String> gl1 = (str) -> str.toUpperCase();
		GenericLambda<Integer> gl2 = (num) -> num * 2;
		GenericLambda<Boolean> gl3 = (myBool) -> myBool & true;
		
		System.out.println(gl1.calculate("youngseo"));
		System.out.println(gl2.calculate(200));
		System.out.println(gl3.calculate(false));
		
		
	}
	
	static void printNum(MultipleNum mn) {
		int result = mn.calculate(5);
		System.out.println(result);
	}
	

}
