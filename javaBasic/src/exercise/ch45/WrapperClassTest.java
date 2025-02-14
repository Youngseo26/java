package exercise.ch45;

public class WrapperClassTest {

	public static void main(String[] args) {
		//Integer
		Integer integer1 = new Integer(20); // Boxing : int -> Integer
		Integer integer2 = new Integer(30);
		
		int int1 = integer1.intValue(); // Unboxing: Integer -> int
		
		Integer integer3 = 40; //AutoBoxing
		int int2 = integer3; //AutoUnboxing
		
		System.out.println(integer1);
		System.out.println(int1);
		System.out.println(integer3);
		System.out.println(int2);
		
		//연산자
		System.out.println(integer1 + integer2 );
		System.out.println(integer1 + int1 );
		
		//Character
		Character character = new Character('X');
		char ch1 = character.charValue();
		
		System.out.println(character);
		System.out.println(ch1);
		
		Character[] characters = {'a', 'b', 'c'};
		char [] chars = {'a', 'b', 'c'};
		
		String str = String.valueOf(characters);
		String str2 = String.valueOf(chars);
		
		System.out.println(str);
		System.out.println(str2);
		
		//Boolean
		Boolean boolean1 = new Boolean(true);
		boolean b1 = boolean1.booleanValue();
		
		Boolean boolean2 = false;
		boolean b2 = boolean2;
		
		System.out.println(boolean1 & boolean2);
		System.out.println(boolean1 | boolean2);
	}

}
