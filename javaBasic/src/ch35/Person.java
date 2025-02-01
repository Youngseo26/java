package ch35;

public class Person extends Animal {

	private String name;
	private int height;
	private String job;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public void eat(String food) {
		System.out.println("사람이 젓가락으로 " + food + "을/를 먹어요.");
	}

	@Override
	public void sleep() {
		System.out.println("졸령 집에 가고싶어");
	}

	public void walk() {
		System.out.println("사람은 두발로 걸어다닙니다.");
	}
}
