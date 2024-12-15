package ch33;

public class AnimalDownCastingTest {

	public static void main(String[] args) {
		// 다운캐스팅 여부
		
		Animal animal = new Bird();
		Bird bird = (Bird) animal; //Bird로 인스턴스화 시킨 것만 하위 타입으로 다운캐스팅 가능
		checkBirdAndFly(animal);
		
		Animal animal2 = new Animal();
		checkBirdAndFly(animal2);
		//Bird bird2 = (Bird) animal2; ClassCastException
		
		Animal animal3 = new Person();
		checkBirdAndFly(animal3);
		//Bird bird3 = (Bird) animal3; ClassCastException

	}
	
	static void checkBirdAndFly(Animal animal) {
		if(animal instanceof Bird) {
			Bird bird = (Bird) animal;
			bird.fly();
		} else {
			System.out.println("새 아님");
		}
	}

}