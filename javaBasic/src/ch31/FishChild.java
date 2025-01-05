package ch31;

public class FishChild extends Fish {
	
	private boolean eatable;

	public boolean isEatable() {
		return eatable;
	}

	public void setEatable(boolean eatable) {
		this.eatable = eatable;
	}
	
	public void becomeDanger() {
		this.havingPoison = true;
	}
	
	@Override
	void eat(String food) {
		System.out.println(myInfo() + food + "을/를 아주 열심히 가열차게 먹고있습니다.");
	}
	
	public void digging() {
		System.out.println(myInfo() + "가 모래를 파고있습니다.");
	}

}