package ch36;

public interface Flyable {
	//속성
	long atmosphereLimit = 476; //대기권
	
	default void fly() {
		System.out.println("<정보> 현재 이 사물이 날고 있습니다.");
	};
	
	static void printLanding() {
		System.out.println("<주의> 현재 이 사물은 공중에 있습니다.");
	}

}
