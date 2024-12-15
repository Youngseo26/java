package ch33;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Bird();
		Animal animal3 = new Fish();
		
		feed(animal1, "빼빼로");
		feed(animal2, "벌레");
		feed(animal3, "빵쪼가리");
	}
	
	public static void feed(Animal animal, String food) {
		animal.eat(food);
	}

}