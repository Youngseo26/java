package ch53;

public class LocalTest {

	public static void main(String[] args) {
		
		class LocalWalk implements Walkable{

			@Override
			public void walk() {
				System.out.println("LocalWalk");
			}
		}
		
		LocalWalk localWalk = new LocalWalk();
		localWalk.walk();
		
		int i = 100;
		
		//익명 클래스
		Walkable anonymousWalk = new Walkable() {

			@Override
			public void walk() {
				// i = 100; 수정은 안됨
				System.out.println(i); //출력됨
				System.out.println("anonymousWalk");
			}
		};
		
		anonymousWalk.walk();
	}
}
