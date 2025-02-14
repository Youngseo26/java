package exercise.ch36;

public class Drone implements Flyable {

	// 속성
	private String droneID;
	private long remainingBatteryAmount;
	private long remainingFileStorage;

	public String getDroneID() {
		return droneID;
	}

	public void setDroneID(String droneID) {
		this.droneID = droneID;
	}

	public long getRemainingBatteryAmount() {
		return remainingBatteryAmount;
	}

	public void setRemainingBatteryAmount(long remainingBatteryAmount) {
		this.remainingBatteryAmount = remainingBatteryAmount;
	}

	public long getRemainingFileStorage() {
		return remainingFileStorage;
	}

	public void setRemainingFileStorage(long remainingFileStorage) {
		this.remainingFileStorage = remainingFileStorage;
	}

	public void takePicture() {
		Flyable.printLanding();
		System.out.println("이 드론은 사진을 찍고있습니다.");
	}

}
