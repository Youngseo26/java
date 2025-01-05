package ch28;

public class Person {
	
	private String name;
	private String gender;
	private int age;
	
	public void printMySelf() {
		System.out.printf("Person 인스턴스 : name : %s , gender : %s , age : %d \n", this.name, this.gender, this.age);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name) {
		this(name, "unknown", 0);
	}
	
	public Person(String name, String gender) {
		this(name, gender, -1);
	}
	
	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public Person returnMySelf() {
		return this;
	}
	
	
}