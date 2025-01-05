package ch30;

public class StaticTest {

	public static void main(String[] args) {
		
		//클래스 변수
		int num = Student.getSerialNum();
		String city = Student.getCity();
		
		Student.setSerialNum(10);
		
		System.out.println(num);
		System.out.println(city);

		Student student1 = new Student("Alice", "F");
		Student student2 = new Student("Tom", "M");
		Student student3 = new Student("Taylor", "F");
		Student student4 = new Student("Bob", "M");
		
		student1.printStudent();
		student2.printStudent();
		student3.printStudent();
		student4.printStudent();
		
		
	}

}