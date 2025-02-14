package exercise.ch36;

public class Airplane implements Flyable {
	//속성
	private String airplaneID;
	private long remainingFuelAmount;
	private long maximumCapacity;
	
	public String getAirplaneID() {
		return airplaneID;
	}

	public void setAirplaneID(String airplaneID) {
		this.airplaneID = airplaneID;
	}

	public long getRemainingFuelAmount() {
		return remainingFuelAmount;
	}

	public void setRemainingFuelAmount(long remainingFuelAmount) {
		this.remainingFuelAmount = remainingFuelAmount;
	}

	public long getMaximumCapacity() {
		return maximumCapacity;
	}

	public void setMaximumCapacity(long maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
	}
	

	public Airplane(String airplaneID) {
		this.airplaneID = airplaneID;
	}

	@Override
	public void fly() {
		System.out.println("비행기 ID(" + airplaneID + ")가 납니다.");
	}
	
	public void refillFuel(long fuel) {
		remainingFuelAmount += fuel;
	}

}
