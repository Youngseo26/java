package exercise.ch28;

public class ThisTest {

	public static void main(String[] args) {
		 
		Person person1 = new Person("김영서");
		Person person2 = new Person("강명곤", "Male");
		Person person3 = new Person("김경서", "Male", 23);
		
//		person1.printMySelf();
//		person2.printMySelf();
//		person3.printMySelf();
		
		Person person11 = person1.returnMySelf();
		Person person22 = person2.returnMySelf();
		Person person33 = person3.returnMySelf();
		
		System.out.println(person11);
		System.out.println(person22);
		System.out.println(person33);
	}

}