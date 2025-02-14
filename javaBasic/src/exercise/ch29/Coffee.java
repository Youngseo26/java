package exercise.ch29;

public class Coffee {

	private String coffeeName;
	private long waterQuantity;
	private long coffeeBeanQuantity;
	private boolean isWrapped;

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public long getWaterQuantity() {
		return waterQuantity;
	}

	public void setWaterQuantity(long waterQuantity) {
		this.waterQuantity = waterQuantity;
	}

	public long getCoffeeBeanQuantity() {
		return coffeeBeanQuantity;
	}

	public void setCoffeeBeanQuantity(long coffeeBeanQuantity) {
		this.coffeeBeanQuantity = coffeeBeanQuantity;
	}

	public boolean isWrapped() {
		return isWrapped;
	}

	public void setWrapped(boolean isWrapped) {
		this.isWrapped = isWrapped;
	}

	// 행위
	void beWrappedUp() {
		this.isWrapped = true;
	}

	// 생성자
	public Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity) {
		this.coffeeName = coffeeName;
		this.waterQuantity = waterQuantity;
		this.coffeeBeanQuantity = coffeeBeanQuantity;
		isWrapped = false;
	}

}