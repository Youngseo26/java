package ch35;

public class Fish extends Animal {

	private boolean havingPoison;
	private String sea;

	public boolean isHavingPoison() {
		return havingPoison;
	}

	public void setHavingPoison(boolean havingPoison) {
		this.havingPoison = havingPoison;
	}

	public String getSea() {
		return sea;
	}

	public void setSea(String sea) {
		this.sea = sea;
	}

	@Override
	public void eat(String food) {
		System.out.println("물고기는 " + food + "를 먹습니다.");
	}

	@Override
	public void sleep() {
		System.out.println("물고기는 물 속에서 잠을 자요");
	}

	public void swim() {
		System.out.println("물고기가 헤엄칩니다.");
	}

}
