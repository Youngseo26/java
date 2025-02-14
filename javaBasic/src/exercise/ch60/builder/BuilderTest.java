package exercise.ch60.builder;

public class BuilderTest {

	public static void main(String[] args) {
		// 적용 전
		User user1 = new User("John", "Doe", 30, "johndoe@email.com");
		
		System.out.println("적용 전 :" + user1);
		
		//적용 후
		User user2 = new User.UserBuilder().firstName("John").lastName("Doe").age(39).email("johndoe@email.com").build();
		
		System.out.println("적용 후 :" + user2);

	}

}
