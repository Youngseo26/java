package ch36;

public class InterfaceTest {

	public static void main(String[] args) {
		
		//속성
		System.out.println(Flyable.atmosphereLimit);
		
		//Flyable
		Flyable bird = new Bird();
		Flyable airplane = new Airplane("OZ222");
		
		bird.fly();
		airplane.fly();
		
		//walkable
		Walkable person = new Person();
		Person person2 = new Person();
		person2.setName("영서");
		Walkable robot = new Robot("AB111");
		
		person.walk();
		robot.walk();
		
		if( robot instanceof Robot) {
			Robot robot2 = (Robot) robot;
			robot2 .helpPerson(person2);
		}
		
		//Drone
		Flyable drone = new Drone();
		Flyable airplane2 = new Airplane("KE077");
		
		drone.fly();
		airplane2.fly();
		
		if(drone instanceof Drone) {
			Drone drone2 = (Drone)drone;
			drone2.takePicture();
		}
	}

}
