package exercise.ch36;

public class Bird extends Animal implements Flyable{

	private long weight;
	private String color;

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 행위

	@Override
	public void eat(String food) {
		System.out.println("새가 부리로 " + food + "를 먹고있습니다.");
	}

	@Override
	public void sleep() {
		System.out.println("새가 잠을 자고있습니다.");
	}
	
	@Override
	public void fly() {
		System.out.println("새가 하늘을 날고있습니다.");
	}
}
