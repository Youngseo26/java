package ch39;

public class Animal {
	//public final class Animal -> 상속 안됨 Bird, Fish, Person error!

	protected String gender;

	public void eat(String food) {
		//public final void eat(String food) { 오바라이딩 안됨 Bird.eat Fish.eat, Person.eat error!
		System.out.println("동물이 " + food + "를 먹습니다.");
	}

	public void sleep() {
		System.out.println("잠을 자고있습니다.");
	}

}
