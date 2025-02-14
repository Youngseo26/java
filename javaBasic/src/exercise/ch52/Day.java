package exercise.ch52;

public enum Day {
	SUNDAY("일요일"),
	MONDAY("월요일"),
	TUESDAY("화요일"),
	WEDNESDAY("수요일"),
	THURSDAY("목요일"),
	FRIDAY("금요일"),
	SATURDAY("토요일");
	
	private final String koreanName;

	private Day(String koreanName) {
		this.koreanName = koreanName;
	}

	public String getKoreanName() {
		return koreanName;
	}
	
	
	
	
}
