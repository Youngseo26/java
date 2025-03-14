package exercise.ch57;

import java.io.Serializable;

public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String gender;
	private transient  int age;  //transient 기본값으로 보여진다.
	private String country;
	private String occupation;
	
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
		this(name, "unknown");
	}
	
	public Person(String name, String gender) {
		this(name, gender, -1, "Korea", null);
	}
	
	
	public Person(String name, String gender, int age, String country, String occupation) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.country = country;
		this.occupation = occupation;
	}
	
	


	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", country=" + country + ", occupation="
				+ occupation + "]";
	}


	public Person returnMySelf() {
		return this;
	}
	
	
}