package ch45;

public class Point<T extends Number, V extends Number> {
	private T x;
	private V y;

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public V getY() {
		return y;
	}

	public void setY(V y) {
		this.y = y;
	}

	public Point(T x, V y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Double calculateDistance() {
		// x**2 + y**2 ^ 1/2
//		if (!(this.x instanceof Number)) {
//			return null;
//		}
//		if (!(this.y instanceof Number)) {
//			return null;
//		} extends Number 하면 필요없어짐

		Double num1 = this.x.doubleValue();
		Double num2 = this.y.doubleValue();

		return Math.sqrt((Math.pow(num1, 2) + Math.pow(num2, 2)));
	}

}
