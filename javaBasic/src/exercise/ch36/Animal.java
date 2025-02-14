package exercise.ch36;

public abstract class Animal {
	//public final class Animal -> 상속 안됨 Bird, Fish, Person error!

	protected String gender;

	public abstract void eat(String food) ;

	public abstract void sleep();

}
