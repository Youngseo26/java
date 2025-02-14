package exercise.ch53;

public class StringUtilTest {

	public static void main(String[] args) {
		String str = "Hello World";
		char target = 'o';
		
		//1. 문자열이 비어있는지
		boolean isEmpty = StringUtils.isEmpty(str);
		//2. 문자열을 반대로 뒤집기
		String reverse = StringUtils.reverse(str);
		//3. 주어진 문자열에서 특정 문자의 갯수 세기
		int count = StringUtils.CharChecker.countChar(str, target);
		//4. 주어진 문자열에 특정 문자가 있는지 확인
		boolean isContain = StringUtils.CharChecker.containChar(str, target);
		
		System.out.println(isEmpty);
		System.out.println(reverse);
		System.out.println(count);
		System.out.println(isContain);
	}

}
