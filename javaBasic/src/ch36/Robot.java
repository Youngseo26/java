package ch36;

public class Robot implements Walkable {
	// 속성
	private String robotID;
	private String modelName;
	private String color;

	public String getRobotID() {
		return robotID;
	}

	public void setRobotID(String robotID) {
		this.robotID = robotID;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Robot(String robotID) {
		super();
		this.robotID = robotID;
	}

	@Override
	public void walk() {
		System.out.println("로봇" + this.robotID + "가 두발로 걸어다닙니다.");
	}

	public void helpPerson(Person person) {
		String name = person.getName();
		System.out.println("로봇이 " + name + "을 도와줍니다.");
	}

}
