package exercise.ch32.fish;

public class Fish {
	private String gender;
	protected boolean havingPoison;
	private String startSpawningDate;
	private String endSpawningDate;
	String leavingSea;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isHavingPoison() {
		return havingPoison;
	}

	public void setHavingPoison(boolean havingPoison) {
		this.havingPoison = havingPoison;
	}

	public String getStartSpawningDate() {
		return startSpawningDate;
	}

	public void setStartSpawningDate(String startSpawningDate) {
		this.startSpawningDate = startSpawningDate;
	}

	public String getEndSpawningDate() {
		return endSpawningDate;
	}

	public void setEndSpawningDate(String endSpawningDate) {
		this.endSpawningDate = endSpawningDate;
	}

	public String getLeavingSea() {
		return leavingSea;
	}

	public void setLeavingSea(String leavingSea) {
		this.leavingSea = leavingSea;
	}

	//행위
	void eat(String food) {
		System.out.println(myInfo() + food + "을/를 먹고있습니다.");
	}

	void swim(int meter) {
		System.out.println("나는" + meter + "m를 헤엄칩니다.");
	}

	void makeCrowd(Fish otherfish) {
		System.out.println("다른 물고기들과 무리짓습니다.");
	}

	void sleep() {
	}
	
	String myInfo() {
		return String.format("물고기(gender = %s\n havingPoison = %s\n leanvingSea = %s) \n", this.gender, this.havingPoison, this.leavingSea);
	}
	
	void printmyInfo() {
		System.out.println(myInfo());
	}
	
	public Fish() {
		System.out.println("내가 먼저 실행되지롱~!");
	}

	public Fish(String gender, boolean havingPoison, String startSpawningDate, String endSpawningDate,
			String leavingSea) {
		super();
		this.gender = gender;
		this.havingPoison = havingPoison;
		this.startSpawningDate = startSpawningDate;
		this.endSpawningDate = endSpawningDate;
		this.leavingSea = leavingSea;
	}
	
	
}